package ru.arsakhanov.lesson29;

import java.util.Objects;

public class Person {

    private int age;
    private String firstName;
    private String gender;

    public Person(int age, String firstName, String gender) {
        this.age = age;
        this.firstName = firstName;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, firstName, gender);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", sex='" + gender + '\'' +
                '}'+ '\n';
    }
}
