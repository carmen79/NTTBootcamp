package com.car.model;

public class Person {

    private String name;
    private String dni;
    private Long id;

    private static Person instance;

    public static Person getInstance(){
        if (instance == null){
            instance = new Person("Carmen", "7774455544n",1L);
        }
        return instance;
    }

    private Person(String name, String dni, Long id) {
        this.name = name;
        this.dni = dni;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
