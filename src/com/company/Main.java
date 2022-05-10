package com.company;

public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Вероника")
                .setSurname("Семенова")
                .setAge(38)
                .setAddress("Кострома")
                .build();
        Person father = new PersonBuilder()
                .setName("Георгий")
                .setSurname("Семенов")
                .setAge(39)
                .setAddress("Кострома")
                .build();
        Person son = father.newChildBuilder()
                .setName("Селаньтий")
                .build();
        System.out.println("У " + mom + " и " + father + " есть сын, " + son);

    }
}
