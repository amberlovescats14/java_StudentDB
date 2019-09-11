package com.amber;

import java.text.NumberFormat;
import java.util.Scanner;

public class Student {
    private String fullName;
    private byte gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int id = 1000;

    // constructor prompt user to enter student name and year
    public Student() {

        this.fullName = new AskName().askName();
        this.gradeYear = new GradeLevel().askGrade();
        setStudentId();

    }
    // create student id with static variable
    private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" + id;
    }
    private String getStudentId(){
        return studentId;
    }

    //enroll and set all variables inside of student
    public void enroll(){
        var enroll = new Enroll();
        this. courses = enroll.enroll();
        this.tuitionBalance = enroll.getTuitionBalance();
    }

    //ask how many users

    //create n number of students



    //pay tuition
    public void payBalance(){
        tuitionBalance = new Payment().makePayment(tuitionBalance);
    }

    //get balance
    public int getTuitionBalance(){
        return tuitionBalance;
    }


    //show status
    public void showStatus(){
        System.out.println("-------------------");
        System.out.println("Name: " + fullName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade Level: " + stringGrade());
        System.out.println("Courses Enrolled: " + courses);
        System.out.println("Tuition Balance: " +
                NumberFormat.getCurrencyInstance().format(tuitionBalance));
        System.out.println("---------------------");
    }

    //deciding what grade they are in based on number
    private String stringGrade(){
        String gradeLevel;
                switch(gradeYear){
            case 1:  gradeLevel = "Freshman"; break;
            case 2:  gradeLevel = "Sophomore"; break;
            case 3:  gradeLevel = "Junior"; break;
            case 4:  gradeLevel = "Senior"; break;
            default: gradeLevel = "Withdrawn";
        }
        return gradeLevel;
    }
}
