import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Get user input as a double
        System.out.print("How much money do you withdraw? $ ");
        // Break down the bills by 100/20/10/5/1//
        double money = input.nextDouble();

        // Remember that division and modulus can help you!
        int hundreds = (int)(money / 100); money %= 100;
        int twenties = (int)(money / 20); money %= 20;
        int tens = (int)(money / 10); money %= 10;
        int fives = (int)(money / 5); money %= 5;
        int ones =  (int)(money / 1); money %= 1;

        // Break down the coins by .25/.10/.05/.01// Print the results - be careful about 'penny' vs 'pennies' and such
        int quarters =  (int)(money / 0.25); money %= 0.25;
        int dimes =  (int)(money / 0.10); money %= 0.10;
        int nickels =  (int)(money / 0.05); money %= 0.05;
        int pennies =  (int)(money / 0.01); money %= 0.01;

        // Print the results - be careful about 'twenty' vs 'twenties' and such
        if (twenties > 1 || twenties == 0) {
            System.out.printf("Bills: you are given %d hundred(s), %d twenties, %d ten(s), %d five(s), %d one(s).\n", hundreds, twenties, tens, fives, ones);
        } else {
            System.out.printf("Bills: you are given %d hundred(s), %d twenty, %d ten(s), %d five(s), %d one(s).\n", hundreds, twenties, tens, fives, ones);
        }

        if (pennies > 1 || pennies == 0) {
            System.out.printf("Coins: you are given %d quarter(s), %d dimes, %d nickel(s), %d pennies.", quarters, dimes, nickels, pennies );
        } else {
            System.out.printf("Coins: you are given %d quarter(s), %d dimes, %d nickel(s), %d penny.", quarters, dimes, nickels, pennies );
        }
    }
}