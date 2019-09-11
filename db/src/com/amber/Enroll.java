package com.amber;

import java.util.Scanner;

public class Enroll implements I_Enroll {
   private String courses = "";
   private int tuitionBalance = 0;
   private int costOfCoarse = 600;

    @Override
    public String enroll(){
        //Get inside a loop, user hit 0
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("Enter course to enroll or Q to quite: ");
            String course = scan.nextLine().toUpperCase();
            if(course.equals("Q")) break;
            courses = courses + " \n \t" + course ;
            tuition();
        }
        return courses;
    }

    @Override
    public int tuition(){
        tuitionBalance = tuitionBalance + costOfCoarse;
        return tuitionBalance;

    }

    public int getTuitionBalance(){
        return tuitionBalance;
    }

}
