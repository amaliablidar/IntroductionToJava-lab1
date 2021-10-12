package com.company;


import java.util.ArrayList;

class Zahlen{

    public int maximaleZahl(ArrayList<Integer> zahlen){ //calculam numarul maxim
        int maxZahl=zahlen.get(0);
        for(int i=0;i<zahlen.size();i++){
            if(zahlen.get(i)>maxZahl){
                maxZahl=zahlen.get(i);
            }
        }
        return maxZahl;
    }

    public int minimaleZahl(ArrayList<Integer> zahlen){ //calculam numarul minim
        int minZahl=zahlen.get(0);
        for(int i=0;i<zahlen.size();i++){
            if(zahlen.get(i)<minZahl){
                minZahl=zahlen.get(i);
            }
        }
        return minZahl;
    }

    public int maxSumme(ArrayList<Integer> zahlen){ //calculam suma maxima a n-1 numere
        int minZahl = minimaleZahl(zahlen);
        int summe=0;
        int count=0;
        for(int i=0;i<zahlen.size();i++){
            if(zahlen.get(i)==minZahl){
                count++;
            }
            if(zahlen.get(i)!=minZahl){
                summe+=zahlen.get(i);
            }
            if(zahlen.get(i)==minZahl&&count>1){
                summe+=zahlen.get(i);
            }
        }
        return summe;
    }

    public int minSumme(ArrayList<Integer> zahlen){ //calculam suma minima a n-1 numere
        int maxZahl = maximaleZahl(zahlen);
        int summe=0;
        int count=0;
        for(int i=0;i<zahlen.size();i++){
            if(zahlen.get(i)==maxZahl){
                count++;
            }
            if(zahlen.get(i)!=maxZahl){
                summe+=zahlen.get(i);
            }
            if(zahlen.get(i)==maxZahl&&count>1){
                summe+=zahlen.get(i);
            }
        }
        return summe;
    }

}
