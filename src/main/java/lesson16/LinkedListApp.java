package lesson16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("ford");
        cars.add("merc");
        System.out.println(cars);
        cars.addFirst("Prius");
        System.out.println(cars);
        cars.addLast("Naz Lifan");
        System.out.println(cars);
        cars.removeFirst();
        System.out.println(cars);
        cars.removeLast();
        System.out.println(cars);
        cars.getFirst();
        System.out.println(cars);
        cars.getLast();
        System.out.println(cars);


    }
}
