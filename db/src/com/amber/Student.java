package com.amber;

public class Student {
    private String fullName;

    private byte gradeYear;
    private String studentId;
    private String courses;
    private int tuitionBalance;
    private static int costOfCoarse = 600;
    private static int id = 1000;

    // constructor prompt user to enter student name and year
    public Student() {

        this.fullName = new AskName().askName();
        this.gradeYear = new GradeLevel().askGrade();
        setStudentId();
    }

    private void setStudentId(){
        this.studentId = gradeYear + "" + id;
        id++;
    }
    private String getStudentId(){
        return studentId;
    }

    //ask how many users

    //create n number of students

    //generate id

    //enroll in courses

    //view balance

    //pay tuition

    //show status
}
