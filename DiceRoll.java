/*Denzel Chike
 * 10/20/2020
 *JDK 1.8
 *Prompt user amount of time dice rolled
 */

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        // scanner for scanning user input
        Scanner scanner = new Scanner(System.in);
        int times;
        // using while validating user input
        while (true) {
            System.out.println("How many times would you like to roll the dice?");
            times = scanner.nextInt();
            if (times < 1) continue;
            break;
        }
        // for tacking result
        int win = 0, lose = 0, tie = 0;
        Random random = new Random();
        // using loop to play
        for (int i = 0; i < times; i++) {
            int userroll = random.nextInt(6 - 1 + 1) + 1;
            int computerroll = random.nextInt(6 - 1 + 1) + 1;
            System.out.println("User rolls: " + userroll + "  Computer rolls: " + computerroll);
            if (userroll > computerroll) {
                System.out.println("You win.");
                win++;
            } else if (userroll < computerroll) {
                System.out.println("You lose.");
                lose++;
            } else {
                System.out.println("You tie.");
                tie++;
            }
        }
        // displaying stats
        System.out.println("Total Wins: " + win);
        System.out.println("Total Losses: " + lose);
        System.out.println("Total Ties: " + tie);
    }
}
// OUT

