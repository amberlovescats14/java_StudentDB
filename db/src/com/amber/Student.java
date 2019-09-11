package com.amber;

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

    private void setStudentId(){
        id++;
        this.studentId = gradeYear + "" + id;
    }
    private String getStudentId(){
        return studentId;
    }

    //enroll
    public void enroll(){
        var enroll = new Enroll();
        this. courses = enroll.enroll();
        this.tuitionBalance = enroll.getTuitionBalance();
    }

    //ask how many users

    //create n number of students

    //generate id



    //view balance

    //pay tuition

    //show status
}
