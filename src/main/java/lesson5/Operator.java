package lesson5;

public class Operator {
    public static void main(String[] args) {
//        int a = 10;
//        double b = 2;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        byte c = 5;
//        float d = 2;
//        System.out.println(a * b);
//        System.out.println(a / b);
//        System.out.println(a % b);
//        System.out.println(a++);
//        System.out.println(b--);


//        // create variables
//        int a = 7, b = 11;
//
//        // value of a and b
//        System.out.println("a is " + a + " and b is " + b);
//
//        // == operator
//        System.out.println(a == b);  // false
//
//        // != operator
//        System.out.println(a != b);  // true
//
//        // > operator
//        System.out.println(a > b);  // false
//
//        // < operator
//        System.out.println(a < b);  // true
//
//        // >= operator
//        System.out.println(a >= b);  // false
//
//        // <= operator
//        System.out.println(a <= b);  // true


        // bir eded verilir cut olub olmamagini yoxlamag
        // + hemin ededin 10dan boyuk olmamagini yoxlayirig
        // cutdurse ve yaxud 3e tam bolunurse o zaman ekrana true veririy

        int i = 16;
        boolean isEven = (i % 2) == 0;
        System.out.println(isEven);

        boolean second = isEven && i > 10;
        System.out.println(second);

        boolean third = isEven || (i % 3) == 0;
        System.out.println(third);

        boolean fourth = !isEven && (i >= 10);
        System.out.println(fourth);

    }
}
