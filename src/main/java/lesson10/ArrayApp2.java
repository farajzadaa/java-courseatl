package lesson10;

import java.util.Random;
import java.util.Scanner;

public class ArrayApp2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ary = new int[scan.nextInt()];
        int min = ary[0];
        int max = ary[0];


        Random rd = new Random();
        for (int i = 0; i < ary.length; i++) {
            ary[i] = rd.nextInt();
            if (ary[i] < min) {
                min = ary[i];
            } else if (ary[i] > max) {
                max = ary[i];
            }
        }
        System.out.println("min value: " + min);
        System.out.println("max value: " + max);
    }
}
