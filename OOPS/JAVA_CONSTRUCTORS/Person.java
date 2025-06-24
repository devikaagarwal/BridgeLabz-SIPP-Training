package OOPS.JAVA_CONSTRUCTORS;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        System.out.println("Person 1: " + person1.name + ", Age: " + person1.age);

        Person person2 = new Person(person1);
        System.out.println("Person 2 (copy of Person 1): " + person2.name + ", Age: " + person2.age);
    }
}

