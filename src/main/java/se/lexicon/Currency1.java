package se.lexicon;

import java.util.Scanner;

public class Currency1 {


    public static void SEKToOther(double amount) {

        System.out.println("1 USD");
        System.out.println("2 Euro");

        Scanner sc = new Scanner(System.in);
        System.out.println("To which currency do you want to convert? : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("1 SEK = " + 0.096 + " Dollar");
            System.out.println(amount + " SEK = " + (amount * 0.096) + " Dollar");
        } else if (choice == 2) {
            System.out.println("1 SEK = " + 0.088 + " Euro");
            System.out.println(amount + " SEK = " + (amount * 0.088) + " Euro");
        } else {
            System.out.println("Invalid choice");
        }
    }
}