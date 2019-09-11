package com.amber;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Ask how many student to enroll
        Scanner scan = new Scanner(System.in);
        System.out.println("How many student would you like to enroll?");
        byte amount = scan.nextByte();
        Student[] students = new Student[amount];

        //create a new while running through the loop
        for(int i=0; i<students.length; i++){
            students[i] = new Student();

            students[i].enroll();
            students[i].payBalance();
        }
        for (Student s : students) {
            s.showStatus();
        }



    }
}
