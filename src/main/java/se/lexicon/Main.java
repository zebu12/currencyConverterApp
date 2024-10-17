package se.lexicon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("1 SEK");
        System.out.println("2 USD");
        System.out.println("3 Euro");

        /* take the input from the user */

        Scanner sc = new Scanner(System.in);
        System.out.println("which currency do you have : ");
        int choice = sc.nextInt();
        System.out.println("Enter the amount you have : ");
        double amount = sc.nextDouble();

        /* which currency to convert*/

        switch (choice) {
            case 1:

                Currency1.SEKToOther(amount);
                break;
            case 2:
                Currency2.USDToOther(amount);
                break;
            case 3:
                Currency3.EuroToOther(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

}