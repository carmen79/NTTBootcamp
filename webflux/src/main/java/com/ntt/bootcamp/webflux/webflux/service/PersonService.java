package com.ntt.bootcamp.webflux.webflux.service;

import com.ntt.bootcamp.webflux.webflux.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonService implements  PersonServiceI {

    private List<Person> listaPersonas;

    public PersonService() {
        listaPersonas = new ArrayList<>();
        Person admin = new Person("carmenbueno", "passw", "Carmen", "Bueno", 18, true);
        listaPersonas.add(admin);
    }

    @Override
    public List<Person> login(String userName, String password) {

        Person person = listaPersonas.stream()
                .filter(p -> p.getUserName().equals(userName) && p.getPassword().equals(password)).collect(Collectors.toList()).get(0);

        if (person.isAdmin()) {
            return listaPersonas;
        } else {
            return new ArrayList<>();
        }
    }

    @Override
    public List<Person> addPerson(Person persona) {
        listaPersonas.add(persona);

        return listaPersonas;
    }
}
