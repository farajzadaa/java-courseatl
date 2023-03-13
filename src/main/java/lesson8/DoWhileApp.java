package lesson8;

import java.util.Scanner;

public class DoWhileApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int number2 = number;

        while (true) {
            System.out.println(number);
            if (number > 0) {
                System.out.println(number % 10);
                number /= 10;
            } else {
                break;
            }

        }

        do {
            System.out.println(number2);
            if (number2 > 0) {
                System.out.println(number2 % 10);
                number2 /= 10;
            }

        } while (number2 > 0);


    }
}
