package lesson12;

import java.util.Scanner;

public class ExceptionApp {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String scan = a.next();
        String scan1 = a.next();

        try {
            int scan2 = Integer.parseInt(scan);
            int scan3 = Integer.parseInt(scan1);
            double result = (double) scan2 / scan3;
            System.out.println(result);
        } catch (NumberFormatException exception) {
            System.out.println("NumberFormatException");
        }
    }
}
