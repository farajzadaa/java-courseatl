package lesson6;

import java.util.Scanner;

public class ConditionsApp {
    public static void mainV1(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        if (a < 0) {
            System.out.println("Negative");
        } else if (a == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }

    }

    public static void mainV2(String[] args) {

        Scanner in = new Scanner((System.in));

        int a = in.nextInt();


        if (a == 1) {
            System.out.println("yanvar");
        } else if (a == 2) {
            System.out.println("fevral");
        } else if (a == 3) {
            System.out.println("mart");
        } else if (a == 4) {
            System.out.println("aprel");
        } else if (a == 5) {
            System.out.println("may");
        } else if (a == 6) {
            System.out.println("iyun");
        } else if (a == 7) {
            System.out.println("iyul");
        } else if (a == 8) {
            System.out.println("avqust");
        } else if (a == 9) {
            System.out.println("sentyabr");
        } else if (a == 10) {
            System.out.println("oktyabr");
        } else if (a == 11) {
            System.out.println("noyabr");
        } else if (a == 12) {
            System.out.println("dekabr");
        } else {
            System.out.println("secim duzgun deyil");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));

        int a = in.nextInt();

        if(a>=1 && a<=3){
            System.out.println("");
        }
    }
}
