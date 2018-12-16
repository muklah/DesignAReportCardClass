package com.example.muklahhn.designareportcardclass;

/**
 * Created by Muklah H N on 18/07/2018.
 */

public class ReportCard {

    private String name;

    private String language[];

    private int grade[];

    public ReportCard (String name, String[] language, int[] grade) {

        this.name = name;
        this.language = language;
        this.grade = grade ;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name;
    }

    public String[] getLanguage(){

        return language;
    }

    public void setLanguage (String[] language){

        this.language = language;
    }

    public int[] getGrade(){

        return grade;
    }

    public void setGrade(int[] grade){

        this.grade = grade;
    }

    @Override
    public String toString(){

        return "Student name: " + name + "\n"
                + "Language: " + Arrays.toString(language) + " " + "Grade: " + Arrays.toString(grade);
    }

}
