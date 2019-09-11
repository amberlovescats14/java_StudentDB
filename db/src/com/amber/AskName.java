package com.amber;

import java.util.Scanner;

public class AskName implements I_AskName {
    private String firstName;
    private String lastName;

    @Override
    public String askName(){
        Scanner first = new Scanner(System.in);
        System.out.print("First name? ");
        this.firstName = first.nextLine();
        Scanner last = new Scanner(System.in);
        System.out.print("Last name? ");
        this.lastName = last.nextLine();
        return firstName.toUpperCase() + " " + lastName.toUpperCase();
    }
}
