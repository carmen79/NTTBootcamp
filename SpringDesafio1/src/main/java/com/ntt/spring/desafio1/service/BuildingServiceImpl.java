package com.ntt.spring.desafio1.service;

import com.ntt.spring.desafio1.model.Building;
import com.ntt.spring.desafio1.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Override
    public void addPerson(Building b, Person p) {
        b.getPeople().add(p);
    }

    @Override
    public List<Person> consultPeople(Building b) {
        return b.getPeople();
    }

    @Override
    public Person findPerson(Building b, String name, String surname) {
        for(Person p : b.getPeople()) {
            if (p.getName().equals(name) && p.getSurname().equals(surname)){
                return p;
            }
        }
        return  null;
    }
}
