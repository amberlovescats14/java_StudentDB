package com.amber;

import java.text.NumberFormat;
import java.util.Scanner;

public class Payment implements I_Payment {
    private int amount;
    @Override
    public int makePayment(int tuitionBalance){
        Scanner scan = new Scanner(System.in);
        System.out.println("Payment Amount? ");
        this.amount = scan.nextInt();
        tuitionBalance -= amount;
        System.out.println(NumberFormat.getCurrencyInstance().format(amount) +
                " paid: , New Balance: " +
                NumberFormat.getCurrencyInstance().format(tuitionBalance));
        return tuitionBalance;

    }
}

