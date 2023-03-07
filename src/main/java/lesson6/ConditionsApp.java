package lesson6;

import java.util.Scanner;

public class ConditionsApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a < 0) {
            System.out.println("Negative");
        } else if (a ==0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }
    }
}
