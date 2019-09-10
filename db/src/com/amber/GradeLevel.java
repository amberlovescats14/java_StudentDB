package com.amber;

import java.util.Scanner;

public class GradeLevel implements I_GradeLevel {
    private String gradeLevel;


    @Override
    public byte askGrade(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter grade level; ");
        System.out.println(" 1-Freshman \n 2-Sophomore \n 3-Junior \n 4-Senior ");
        return scan.nextByte();
    }

//    private void compare(byte grade){
//        switch(grade){
//            case 1:  gradeLevel = "Freshman"; break;
//            case 2:  gradeLevel = "Sophomore"; break;
//            case 3:  gradeLevel = "Junior"; break;
//            case 4:  gradeLevel = "Senior"; break;
//            default: gradeLevel = "Withdrawn";
//        }
//    }
}


