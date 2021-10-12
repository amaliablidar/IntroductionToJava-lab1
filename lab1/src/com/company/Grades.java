package com.company;

import java.util.ArrayList;

class Grades {

    public ArrayList<Integer> notEnough(ArrayList<Integer> grades) { //Returneaza un array cu notele mai mici decat 40
        int j = 0;
        ArrayList<Integer> gradesNotEnough = new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 40) {

                gradesNotEnough.add(grades.get(i));
                j++;
            }
        }
        return gradesNotEnough;
    }

    public float avg(ArrayList<Integer> grades) { //returneaza media tuturor notelor
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        return ((float) sum) / grades.size();
    }

    public ArrayList<Integer> roundedGrades(ArrayList<Integer> grades) { //returneaza notele rotunjite
        ArrayList<Integer> roundedGradesList = new ArrayList<Integer>();
        for (int i = 0; i < grades.size(); i++) {
            int actualGrade = grades.get(i);
            if (actualGrade >= 38) {
                if (actualGrade % 10 - 5 > 0 && Math.abs(actualGrade % 10 - 10) < 3) {
                    roundedGradesList.add(actualGrade + (10 - actualGrade % 10));
                } else {
                    if (Math.abs(actualGrade % 10 - 5) < 3 && actualGrade % 10 - 5 < 0) {
                        roundedGradesList.add(actualGrade + (Math.abs(actualGrade % 10 - 5)));
                    }
                }
            }
        }

        return roundedGradesList;
    }

    public int maxRoundedNote(ArrayList<Integer> grades){ // returneaza nota maxima din cele rotunjite
        ArrayList<Integer> roundedGradesList = new ArrayList<Integer>();
        roundedGradesList=roundedGrades(grades);
        int maxim=roundedGradesList.get(0);
        for(int i=0;i<roundedGradesList.size();i++){
            if(maxim<roundedGradesList.get(i)){
                maxim=roundedGradesList.get(i);
            }
        }
        return maxim;
    }

}
