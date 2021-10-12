package com.company;
import java.util.ArrayList;
public class Main {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";


    public static void main(String[] args) {
        //Aufgabe 1
        Grades grade = new Grades();

        ArrayList<Integer> grades = new ArrayList<Integer>();

        grades.add(43);
        grades.add(42);
        grades.add(29);
        grades.add(84);
        grades.add(96);
        grades.add(37);
        grades.add(38);


        //Afisare sir
        System.out.print(ANSI_YELLOW+"SIR NUMERE: ");
        for(int i =0;i<grades.size()-1;i++)
            System.out.print(ANSI_YELLOW+grades.get(i)+", ");
        System.out.print(ANSI_YELLOW+grades.get(grades.size()-1));
        System.out.println();


        System.out.println(ANSI_BLUE+"Aufgabe 1.1:");
        for(int i = 0;i<grade.notEnough(grades).size();i++){
            System.out.println(ANSI_RESET+grade.notEnough(grades).get(i));
        }

        System.out.println(ANSI_BLUE+"Aufgabe 1.2:");
        System.out.println(ANSI_RESET+grade.avg(grades));

        System.out.println(ANSI_BLUE+"Aufgabe 1.3:");
        for(int i=0;i<grade.roundedGrades(grades).size();i++){
            System.out.println(ANSI_RESET+grade.roundedGrades(grades).get(i));
        }

        System.out.println(ANSI_BLUE+"Aufgabe 1.4:");
        System.out.println(ANSI_RESET+grade.maxRoundedNote(grades));


        //Aufgabe2
        Zahlen zahlen = new Zahlen();

        ArrayList<Integer> zahlenList = new ArrayList<Integer>();

        zahlenList.add(4);
        zahlenList.add(8);
        zahlenList.add(3);
        zahlenList.add(3);
        zahlenList.add(17);
        zahlenList.add(17);


        //Afisare sir
        System.out.println();
        System.out.print(ANSI_YELLOW+"SIR NUMERE: ");
        for(int i =0;i<zahlenList.size()-1;i++)
            System.out.print(ANSI_YELLOW+zahlenList.get(i)+", ");
        System.out.print(ANSI_YELLOW+zahlenList.get(zahlenList.size()-1));
        System.out.println();


        System.out.println(ANSI_PURPLE+"Aufgabe 2.1");
        System.out.println(ANSI_RESET+zahlen.maximaleZahl(zahlenList));

        System.out.println(ANSI_PURPLE+"Aufgabe 2.2");
        System.out.println(ANSI_RESET+zahlen.minimaleZahl(zahlenList));

        System.out.println(ANSI_PURPLE+"Aufgabe 2.3");
        System.out.println(ANSI_RESET+zahlen.maxSumme(zahlenList));

        System.out.println(ANSI_PURPLE+"Aufgabe 2.4");
        System.out.println(ANSI_RESET+zahlen.minSumme(zahlenList));



        //Aufgabe3
        ArraysZahlen array = new ArraysZahlen();

        ArrayList<Integer> array1 = new ArrayList<Integer>();
        ArrayList<Integer> array2 = new ArrayList<Integer>();

        array1.add(2);
        array1.add(3);
        array1.add(4);
        array1.add(8);
        array1.add(0);
        array1.add(0);
        array1.add(0);
        array1.add(0);
        array1.add(0);

        array2.add(2);
        array2.add(3);
        array2.add(5);
        array2.add(4);
        array2.add(0);
        array2.add(0);
        array2.add(0);
        array2.add(0);
        array2.add(0);


        //Afisare siruri
        System.out.println();
        System.out.print(ANSI_YELLOW+"ARRAY1: ");
        System.out.print(ANSI_YELLOW+"[");
        for(int i=0;i<array1.size()-1;i++){
            System.out.print(ANSI_YELLOW+array1.get(i)+", ");
        }
        System.out.print(ANSI_YELLOW+array1.get(array1.size()-1));
        System.out.print(ANSI_YELLOW+"]");

        System.out.println();
        System.out.print(ANSI_YELLOW+"ARRAY2: ");
        System.out.print(ANSI_YELLOW+"[");
        for(int i=0;i<array2.size()-1;i++){
            System.out.print(ANSI_YELLOW+array2.get(i)+", ");
        }
        System.out.print(ANSI_YELLOW+array2.get(array2.size()-1));
        System.out.print(ANSI_YELLOW+"]");
        System.out.println();


        System.out.println(ANSI_GREEN+"Aufgabe 3.1");
        System.out.println(ANSI_RESET+array.Summe(array1, array2));

        System.out.println(ANSI_GREEN+"Aufgabe 3.2");
        System.out.println(ANSI_RESET+array.Differenz(array1, array2));

        System.out.println(ANSI_GREEN+"Aufgabe 3.3");
        System.out.println(ANSI_RESET+array.Multiplikation(array2,5));

        System.out.println(ANSI_GREEN+"Aufgabe 3.4");
        int div=0;
        System.out.println(ANSI_GREEN+"impartitor: "+div);
        System.out.println(ANSI_RESET+array.Division(array2,div));
        div=2;
        System.out.println(ANSI_GREEN+"impartitor: "+div);
        System.out.println(ANSI_RESET+array.Division(array2,div));


        //Aufgabe 4
        Shopping shopping = new Shopping();

        ArrayList<Integer> tastaturArray = new ArrayList<Integer>();
        ArrayList<Integer> USBArray = new ArrayList<Integer>();

        tastaturArray.add(40);
        tastaturArray.add(35);
        tastaturArray.add(70);
        tastaturArray.add(15);
        tastaturArray.add(45);

        USBArray.add(8);
        USBArray.add(20);
        USBArray.add(15);
        USBArray.add(12);

        int budget=30;


        //Afisare siruri
        System.out.println();
        System.out.print(ANSI_YELLOW+"TastaturArray: [");
        for(int i=0;i<tastaturArray.size()-1;i++){
            System.out.print(ANSI_YELLOW+tastaturArray.get(i)+", ");
        }
        System.out.print(ANSI_YELLOW+tastaturArray.get(tastaturArray.size()-1)+"]");
        System.out.println();

        System.out.print(ANSI_YELLOW+"USBArray: [");
        for(int i=0;i<USBArray.size()-1;i++){
            System.out.print(ANSI_YELLOW+USBArray.get(i)+", ");
        }
        System.out.print(ANSI_YELLOW+USBArray.get(USBArray.size()-1)+"]");
        System.out.println();

        System.out.println(ANSI_YELLOW+"Budget: "+budget);


        System.out.println(ANSI_CYAN+"Aufgabe 4.1");
        System.out.println(ANSI_RESET+shopping.billigsteTastatur(tastaturArray));

        System.out.println(ANSI_CYAN+"Aufgabe 4.2");
        System.out.println(ANSI_RESET+shopping.teuerstenGegenstand(tastaturArray,USBArray));

        System.out.println(ANSI_CYAN+"Aufgabe 4.3");
        System.out.println(ANSI_RESET+shopping.budgetMax(USBArray,budget));

        System.out.println(ANSI_CYAN+"Aufgabe 4.4");
        System.out.println(ANSI_RESET+shopping.shoppingTastaturAndUSB(tastaturArray,USBArray,5));

    }
}














