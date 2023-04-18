package com.solvd.ta.lab2;

/*
 * This is an abstract class containing two fields name and age, which are variables of type String and int respectively.
 * This class also has four methods called getName(), setName(), getAge() and setAge() which are
 * used to access and modify the private fields.
 * Additionally, this class also contains overridden hashCode(), equals(), and toString() methods which are
 * used to describe the class's characteristics.
 */

import java.util.Objects;

abstract class Person {

    // Attributes and variables
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
