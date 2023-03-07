package lesson5;

public class TernaryOperatorApp {
    public static void main(String[] args) {
        int a = 21;
        System.out.println('@');
        String result = a % 2 == 0 ? "EVEN" : "ODD";
        char result2 = (a-1) % 2 ==0? 'O' : 'E';
        System.out.println(result);
        System.out.println(result2);

        int b = 5;
        b++;
        System.out.println(b);
    }
}
