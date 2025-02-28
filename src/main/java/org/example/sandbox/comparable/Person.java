package org.example.sandbox.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public int compareTo(Person person) {
        int returnValue = Integer.MAX_VALUE;
        if (this.firstName.compareTo(person.firstName) == 0) {
            if (this.lastName.compareTo(person.lastName)== 0) {
                return this.age - person.age;
            }
            return this.lastName.compareTo(person.lastName);
        }
        return this.firstName.compareTo(person.firstName);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {

        Person person1 = new Person("John", "Doe", 30);
        Person person2 = new Person("Jane", "Doe", 40);
        Person person3 = new Person("John", "Smith", 25);

        List<Person> people = new ArrayList<>();

        people.add(person1);
        people.add(person2);
        people.add(person3);

        Collections.sort(people);

        people.forEach(System.out::println);
    }
}
