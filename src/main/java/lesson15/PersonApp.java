package lesson15;

import java.util.Arrays;
import java.util.Comparator;

public class PersonApp {
    public static void main(String[] args) {
        Person[] person = {
                new Person(1, 28, "Samir", 1500),
                new Person(2, 24, "Elvin", 15000),
                new Person(3, 18, "Murad", 1500000),
                new Person(4, 49, "Filankes", 15)

        };

        System.out.println("-----");

        System.out.println(Arrays.toString(person));
        Arrays.sort(person, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o2.age, o1.age);
            }
        });
        System.out.println(Arrays.toString(person));
        Arrays.sort(person, (person1, person2) -> (Double.compare(person1.salary, person2.salary)));
        System.out.println(Arrays.toString(person));

    }
}
