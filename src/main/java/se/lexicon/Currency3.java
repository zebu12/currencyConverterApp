package se.lexicon;

import java.util.Scanner;

public class Currency3 {


    public static void EuroToOther(double amount) {

        System.out.println("1 SEK");
        System.out.println("2 USD");

        Scanner sc = new Scanner(System.in);
        System.out.println("To which currency do you want to convert? : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("1 Euro = " + 11.38 + " SEK");
            System.out.println(amount + " Euro = " + (amount * 11.38) + " SEK");
        } else if (choice == 2) {
            System.out.println("1 Euro = " + 1.09 + " USD");
            System.out.println(amount + " Euro = " + (amount * 1.09) + " USD");
        } else {
            System.out.println("Invalid choice");
        }
    }


}
