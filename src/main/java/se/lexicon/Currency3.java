package se.lexicon;

import java.util.Scanner;

public class Currency3 {


    public static void EuroToOther(double amount) {

        System.out.println("1 SEK");
        System.out.println("2 USD");

        Scanner sc = new Scanner(System.in);
        System.out.println("To which currency do you want to convert? : ");
        int choice = sc.nextInt();
        switch (choice) {

            case 1:


                System.out.println("1 Euro = " + 11.38 + " SEK");
                System.out.println(amount + " Euro = " + (amount * 11.38) + " SEK");

                break;


            case 2:


                System.out.println("1 Euro = " + 1.09 + " USD");
                System.out.println(amount + " Euro = " + (amount * 1.09) + " USD");

                break;
            default:
                System.out.println("Invalid choice");


        }
    }


}
