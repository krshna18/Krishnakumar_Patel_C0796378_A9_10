package com.krishna;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Transaction t = new Transaction();

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter Monthly Sales:");
        double salesAmount = myObj.nextDouble();

        System.out.println("Enter Advance Pay:");
        double advancePay = myObj.nextDouble();
        t.setAdvance(advancePay);


        double a = t.calculatePay(salesAmount);
        t.display();
    }
}
