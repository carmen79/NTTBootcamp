package com.ntt.spring.desafio1.service;

import com.ntt.spring.desafio1.model.Building;
import com.ntt.spring.desafio1.model.Person;

import java.util.List;

public interface BuildingService {
    public void addPerson(Building b, Person p);
    public List<Person> consultPeople(Building b);
    public Person findPerson(Building b , String name, String surname);

}
