package com.ntt.spring.desafio1.model;

public class Person {
    private String name;
    private String surname;

    public Person(String nameParameter, String surnameParameter) {
        this.name = nameParameter;
        this.surname = surnameParameter;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
