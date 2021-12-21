package com.nttdata.patterns.patterns.prototype;

import com.nttdata.patterns.patterns.model.Person;

public class PersonPrototype {

    private Long id;
    private String name;
    private String surname;

    public PersonPrototype(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    public PersonPrototype copy (PersonPrototype person) {
        PersonPrototype p = new PersonPrototype (person.getId(), person.getName(),person.getSurname());
        return p;
    }
}
