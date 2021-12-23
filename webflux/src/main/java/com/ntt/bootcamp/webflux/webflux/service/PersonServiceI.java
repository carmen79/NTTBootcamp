package com.ntt.bootcamp.webflux.webflux.service;

import com.ntt.bootcamp.webflux.webflux.model.Person;

import java.util.List;

public interface PersonServiceI {

    List<Person> login(String userName, String password);
    List<Person> addPerson(Person persona);
}
