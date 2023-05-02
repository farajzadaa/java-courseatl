package lesson13;

import java.util.Optional;

public class GenericApp {
    public static void main(String[] args) {
        String str = " ";
        System.out.println(checkBox(str));

    }

    public static Optional<String> checkBox(String a) {
        return (a == null || a.isEmpty()) ? Optional.empty() : Optional.of(a);
    }

}
