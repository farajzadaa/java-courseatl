package lesson12;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String scan = a.next();

        try {
            int scan1 = Integer.parseInt(scan);
            while (scan1 > 0) {
                System.out.println(scan1 % 10);
                scan1 /= 10;
            }
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
    }
}
