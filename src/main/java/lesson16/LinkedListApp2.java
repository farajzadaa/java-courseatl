package lesson16;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListApp2 {


    public static void main(String[] args) {
        Queue<String> words = new LinkedList<>();
        words.add("WWWWW");
        words.add("EEEEEE");
        words.add("RRRRRR");
        words.add("TTTTT");
        words.add("UUUUU");
        words.add("IIIII");
        words.offer("Hello");
        System.out.println();
    }


}