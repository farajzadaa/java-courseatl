package lesson10;

import java.util.Scanner;

public class MethodsApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        PrintDigits(n);
    }
    
    public  static void PrintDigits(int x){
            
        while (x>0){
            System.out.print(x %10 + "_");
            x /= 10;

        }

        
        
    }
}
