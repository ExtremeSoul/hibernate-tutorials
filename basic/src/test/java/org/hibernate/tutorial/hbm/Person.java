package org.hibernate.tutorial.hbm;

public class Person {
    int id;
    String name;
    String surname;
    int age;

    public Person(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
