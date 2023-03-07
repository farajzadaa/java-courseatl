package lesson6;

import java.util.Scanner;

public class InputApp {
    public static void mainV1(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        System.out.printf("%.5f", num);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

    }
}
