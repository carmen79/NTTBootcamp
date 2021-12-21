package com.nttdata.patterns.patterns.builder;

public class PersonBuilder {

    private Long id;
    private String name;
    private String surname;

    public PersonBuilder name(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder surname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder id(Long id) {
        this.id = id;
        return this;
    }

    public PersonBuilder build() {
        return new PersonBuilder();
    }
}
