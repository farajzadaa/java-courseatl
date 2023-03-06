package lesson4;

public class VariableApp {
    public static void mainV1(String[] args) {
        int a = 3;

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

         a = 6;
        System.out.println(a);

        int b = a + 2;
        System.out.println(b);

    }

    public static void mainV2(String[] args) {
        boolean ac = true;
        boolean ab;
        ab = false;
        System.out.println(ac);
        System.out.println(ab);

    }

    public static void mainV3(String[] args) {
        char c;
        c = '\u0000';
        byte a = (byte) 128;
        System.out.println(a);
    }

    public static void mainV4(String[] args) {
        int a = 5;
        long b = 5L;

        double d = 3.14;
        float f = 3.14F;

    }

    public static void mainV5(String[] args) {
        // single line comment

        /*
        multi line comment
         */

        /**
         * doc
         * comment
         *
         */


    }

    public static void main(String[] args) {
        System.out.println(33);
        System.out.println((char)33);
    }
}
