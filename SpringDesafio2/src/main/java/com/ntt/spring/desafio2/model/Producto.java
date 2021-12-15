package com.ntt.spring.desafio2.model;

public class Producto {
    private Long id;
    private String name;
    private Float precio;

    public Producto(Long id, String name, Float precio) {
        this.id = id;
        this.name = name;
        this.precio = precio;
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


    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                '}';
    }
}
