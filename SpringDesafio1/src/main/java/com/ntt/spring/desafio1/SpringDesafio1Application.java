package com.ntt.spring.desafio1;

import com.ntt.spring.desafio1.model.Building;
import com.ntt.spring.desafio1.model.Person;
import com.ntt.spring.desafio1.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class SpringDesafio1Application implements CommandLineRunner {

    @Autowired
    private BuildingService buildingService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDesafio1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("desafio1");

        Person p1 = new Person("Manolo", "Perez");
        Person p2 = new Person("Antonio", "Ruiz");

        Building alcazaba = new Building(5, 3);
        Building hadar = new Building(6, 3);

        List<Person> lp = buildingService.consultPeople(alcazaba);
        System.out.println("Lista de personas" + lp);

        buildingService.addPerson(alcazaba, p1);

        List<Person> lp2 = buildingService.consultPeople(alcazaba);
        System.out.println("Lista de personas después de añadir persona:" + lp2);

        System.out.println("Búsqueda de persona por nombre y apellido");
        Person p3 = buildingService.findPerson(alcazaba,"Manolo","Perez");
        System.out.println("Resultado de la búsqueda: " + p3);
    }
}
