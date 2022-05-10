package com.company;

import java.util.Objects;

public class Person {
    private final String name;
    private final String surname;
    private Integer age = null;
    private String address;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    ;

    public Person(String name, String surname, Integer age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    ;

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    ;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public boolean hasAge() {
        return age != null;
    }

    public void happyBirthday() {
        if (hasAge()) {
            age += 1;
        }
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getAddress() {
        return address;
    }


    @Override
    public String toString() {
        return name + " " + surname + " (" + age + " полных лет), адрес - " + address + " ; \n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder child = new PersonBuilder();
        child.setSurname(this.surname);
        child.setAge(1);
        child.setAddress(this.address);
        return child;
    }


}