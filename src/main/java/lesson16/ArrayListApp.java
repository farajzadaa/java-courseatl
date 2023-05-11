package lesson16;

import java.util.ArrayList;

public class ArrayListApp {

    public static void main(String[] args) {

        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(5);
        System.out.println(myList.size());
        for (int i = 0; i < 10; i++) {
            myList.add((int) (Math.random() * 100));
        }
        System.out.println(myList);
        System.out.println(myList.get(4));
        System.out.println(myList.contains(15));
        myList.remove(5);
        System.out.println(myList);
        myList.clear();
    }
}


