package lesson15;

public final class Person implements Comparable<Person> {
    public int id;
    public double salary;
    public String name;
    public int age;

    public Person(int id, int age, String name,double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return String.format("Student{id=%d, salary=%s, name='%s',age=%s}", id, salary, name,age);
    }


    @Override
    public int compareTo(Person that) {
        return Integer.compare(this.id,that.id);
    }
}
