package se.lexicon;

import java.util.Scanner;

public class Currency2 {

    public static void USDToOther(double amount) {

        System.out.println("1 SEK");
        System.out.println("2 Euro");

        Scanner sc = new Scanner(System.in);
        System.out.println("To which currency do you want to convert= :");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:

                System.out.println("1 USD = " + 10.45 + " SEK");
                System.out.println(amount + " USD = " + (amount * 10.45) + " SEK");

                break;

            case 2:

                System.out.println("1 USD = " + 0.92 + " Euro");
                System.out.println(amount + " USD = " + (amount * 0.92) + " Euro");

                break;

            default:
                System.out.println("Invalid choice");


        }
    }
}
