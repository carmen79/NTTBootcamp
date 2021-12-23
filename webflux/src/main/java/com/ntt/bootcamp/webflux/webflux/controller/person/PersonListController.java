package com.ntt.bootcamp.webflux.webflux.controller.person;

import com.ntt.bootcamp.webflux.webflux.controller.numbers.NumbersSubscriber;
import com.ntt.bootcamp.webflux.webflux.model.Person;
import com.ntt.bootcamp.webflux.webflux.service.PersonServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class PersonListController {

    @Autowired
    private PersonServiceI personService;

    @GetMapping(path = "/login", produces = "text/event-stream")
    public Flux<Person> login(@RequestParam String userName, @RequestParam String password) {
        Flux<Person> flux = Flux.fromIterable(personService.login(userName, password)).delayElements(Duration.ofSeconds(1));
        flux.subscribe(person -> System.out.println(person));
        return flux;
    }

    @GetMapping("/addPerson")
    public String add() {
        Person persona = new Person("newUser", "passw", "New Name", "New Last Name", 18, false);
        personService.addPerson(persona);
        return "Person Added";
    }

}
