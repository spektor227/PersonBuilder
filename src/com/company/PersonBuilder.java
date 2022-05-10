package com.company;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String address;

    public PersonBuilder() {
    }

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalArgumentException, IllegalStateException {
        if (this.name == null || this.surname == null) {
            IllegalStateException e = new IllegalStateException("не хватает обязательных полей ( имя ,фамилия)");
            e.printStackTrace();
        } else if (this.age < 0) {
            IllegalArgumentException e = new IllegalArgumentException("не корректный ввод возраста (не может быть отрицательным чисом)");
            e.printStackTrace();
        } else if (this.address == null) {
            IllegalStateException e = new IllegalStateException("не введен адрес");
            e.printStackTrace();
        }
        return new Person(this.name, this.surname, this.age, this.address);
    }
}
