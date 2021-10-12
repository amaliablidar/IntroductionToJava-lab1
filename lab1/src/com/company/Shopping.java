package com.company;


import java.util.ArrayList;

class Shopping{

    public int billigsteTastatur(ArrayList<Integer> tastaturArray){ //calculam minimul array-ului
        int min = tastaturArray.get(0);
        for(int i = 1;i<tastaturArray.size();i++){
            if(tastaturArray.get(i)<min){
                min=tastaturArray.get(i);
            }
        }
        return min;
    }

    public int teuerstenGegenstand(ArrayList<Integer> tastaturArray, ArrayList<Integer> USBArray){ //calculam maximul din cele doua array-uri
        int max=tastaturArray.get(0);
        for(int i=0;i<tastaturArray.size();i++){
            if(tastaturArray.get(i)>max){
                max=tastaturArray.get(i);
            }
        }
        for(int i=0;i<USBArray.size();i++){
            if(USBArray.get(i)>max){
                max=USBArray.get(i);
            }
        }
        return max;
    }

    public int budgetMax(ArrayList<Integer> USBArray,int budget){ //calculam cel mai scump USB mai ieftin ca bugetul
        int teuersteUSB = 0;
        for(int i = 0;i<USBArray.size();i++){
            if(USBArray.get(i)>teuersteUSB&&USBArray.get(i)<budget)
                teuersteUSB=USBArray.get(i);
        }
        return teuersteUSB;
    }

    public int shoppingTastaturAndUSB(ArrayList<Integer> tastaturArray, ArrayList<Integer> USBArray, int budget){ //calculam cele mai scumpe gadget-uri mai ieftine ca bugetul
        int maxBudget = -1;
        int gadgets;
        for(int i=0;i<tastaturArray.size();i++){
            for(int j=0;j<USBArray.size();j++){
                gadgets=tastaturArray.get(i)+USBArray.get(j);
                if(gadgets>maxBudget&&gadgets<budget){
                    maxBudget=gadgets;
                }
            }

        }
        return maxBudget;
    }

}
