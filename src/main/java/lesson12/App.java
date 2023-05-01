package lesson12;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String str = scan.next();
            try{
                int a = Integer.parseInt(str);
                System.out.println(a * 5);
            }
            catch (NumberFormatException){
                System.out.println("Try again");
            }
        }
    }
}
