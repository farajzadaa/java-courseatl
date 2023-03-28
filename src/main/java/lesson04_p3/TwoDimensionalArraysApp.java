package lesson04_p3;

import java.util.Scanner;

public class TwoDimensionalArraysApp {
    public static void main(String[] args) {
        final int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);

        final Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter your name: ");
        final String name = scanner.nextLine();

        System.out.printf("Let the game begin, %s!\n", name );
        int guessedNum;
        while (true) {
            System.out.println("Your guess: ");
            guessedNum = scanner.nextInt();

        }
    }
}
