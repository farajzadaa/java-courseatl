package lesson10;

import java.util.Scanner;

public class ArrayApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[scan.nextInt()];
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ".");
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ".");
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ".");
            }
        }


    }
}
