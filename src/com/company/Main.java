package com.company;

import java.util.Scanner;

/**
 * <h3>A variation of the dice game Pig</h3>
 *
 * <p>
 * Create a program that will randomly select two numbers from 1-6 (like rolling two dice). Show the dice rolls. You
 * should also show the running score.
 *
 * <p>
 * Prompt the user to either roll again or lose their turn.
 * <p>
 * A player scores the sum of the two dice thrown and gradually reaches a higher score as they continue to roll. If a
 * single number 1 is thrown on either die, the score for that whole turn is lost. However a double 1 counts as 25.
 * When you reach a score of 100 (or more) the game ends.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome! Let's Play Roll Dice!");
        String choice;
        int sum = 0;
        do {
            int a = 1 + (int) (Math.random() * 6);
            int b = 1 + (int) (Math.random() * 6);
            System.out.println("Your rolls " + a + " & " + b);
            if ((a == 1 && b > 1) || (a > 1 && b == 1)) {
                sum += 0;
            } else if (a == 1 && b == 1) {
                sum += 25;
            } else {
                sum += (a + b);
            }
            System.out.println("Score:" + sum);
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Roll again? ");
            choice = keyboard.next();
            System.out.println();
        } while (choice.equalsIgnoreCase("yes") && sum <= 100);
        if (sum > 100) {
            System.out.println("You have scored over 100");
        }
        System.out.println("Thank you for playing!");
    }
}
