package com.company;


import java.util.ArrayList;

class ArraysZahlen {
    public static final String ANSI_RED = "\u001B[31m";

    public ArrayList<Integer> Summe(ArrayList<Integer> array1, ArrayList<Integer> array2) { //returneaza suma celor doua numere
        ArrayList<Integer> nrList = new ArrayList<Integer>();
        ArrayList<Integer> nrListReversed = new ArrayList<Integer>();
        int ok = 0;
        int nr;
        for (int i = array1.size() - 1; i >= 0; i--) {
            if (ok == 1) {
                nr = array1.get(i) + array2.get(i) + 1; //1 este carry-ul de la adunare
            } else {
                nr = array1.get(i) + array2.get(i);
            }
            if (nr < 10) { //daca numerele adunate nu depasesc 10 adaugam numarul cum este
                nrList.add(nr);
                ok = 0;
            } else {
                nrList.add(nr % 10); // daca depasesc 10, adaugam ultima cifra si salvam carry-ul in ok
                ok = 1;
            }
        }
        if (ok == 1) { //daca la final a mai ramas un carry, adaugam 1
            nrList.add(1);
        }
        for (int j = nrList.size() - 1; j >= 0; j--) { //inversam lista
            nrListReversed.add(nrList.get(j));
        }
        return nrListReversed;
    }


    public ArrayList<Integer> Differenz(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        ArrayList<Integer>arrayDifferenz = new ArrayList<Integer>();
        ArrayList<Integer>arrayDifferenzReversed = new ArrayList<Integer>();
        int nr1=0, nr2=0;
        int differenz;
        int ok;
        for(int i=0;i<array1.size();i++){
            nr1=nr1*10+array1.get(i); //transformam lista in numar
        }
        for(int i=0;i<array2.size();i++){
            nr2=nr2*10+array2.get(i);
        }
        if(nr1<nr2){ //verificam care numar este mai mare
            ok=0;
            differenz = nr2-nr1; //facem scaderea normal
        }
        else {
            ok = 1;
            differenz=nr1-nr2;
        }
        while(differenz>10){ //adaugam diferenta in lista
            arrayDifferenz.add(differenz%10);
            differenz/=10;
        }
        if(ok==0){
            arrayDifferenz.add(-differenz); //daca am facut scaderea cu modul adaugam ultima cifra cu minus
        }
        else
            arrayDifferenz.add(differenz);


        for(int i=arrayDifferenz.size()-1;i>=0;i--){ //inversam lista
            arrayDifferenzReversed.add(arrayDifferenz.get(i));
        }
        return arrayDifferenzReversed;
    }

    public ArrayList<Integer> Multiplikation(ArrayList<Integer> array1, int mul) { //facem inmultirea utilizand metoda summe
        ArrayList<Integer> nrListMultiplikation = new ArrayList<Integer>();
        nrListMultiplikation=array1;
        for(int i=1;i<mul;i++)
            nrListMultiplikation=Summe(nrListMultiplikation,array1);
        return nrListMultiplikation;
    }

    public ArrayList<Integer> Division(ArrayList<Integer> array1, int div) { //returneaza numarul impartit la div
        ArrayList<Integer> nrListDivision = new ArrayList<Integer>(0);
        if(div ==0) {
            System.out.println(ANSI_RED+"Nu se poate face impartire la 0!"); //in cazul in care div este 0, nu se poate face impartirea
            return nrListDivision;
        }
        int nr;
        int rest = 0;
        int division = 0;
        for (int i = 0; i < array1.size(); i++) {
            nr = array1.get(i);
            division = (rest * 10 + nr) / div;
            rest = (rest * 10 + nr) % div;
            nrListDivision.add(division);
        }
        return nrListDivision;

    }
}

