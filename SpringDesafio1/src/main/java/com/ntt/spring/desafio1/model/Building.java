package com.ntt.spring.desafio1.model;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Integer floor;
    private Integer apartmentsByFloor;
    private List<Person> people;

    public Building(Integer floor, Integer apartmentsByFloor) {
        this.floor = floor;
        this.apartmentsByFloor = apartmentsByFloor;
        this.people = new ArrayList<>();
    }

    public List<Person> getPeople() {
        return people;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public Integer getApartmentsByFloor() {
        return apartmentsByFloor;
    }

    public void setApartmentsByFloor(Integer apartmentsByFloor) {
        this.apartmentsByFloor = apartmentsByFloor;
    }
}
