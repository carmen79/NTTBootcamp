package com.ntt.spring.desafio2.model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Long id;
    private String direccion;
    private Boolean isCeutaMelillaCanarias;
    private List<Producto> productos;

    public Pedido(Long id, String direccion, Boolean isCeutaMelillaCanarias) {
        this.id = id;
        this.direccion = direccion;
        this.isCeutaMelillaCanarias = isCeutaMelillaCanarias;
        this.productos= new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getCeutaMelillaCanarias() {
        return isCeutaMelillaCanarias;
    }

    public void setCeutaMelillaCanarias(Boolean ceutaMelillaCanarias) {
        isCeutaMelillaCanarias = ceutaMelillaCanarias;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", isCeutaMelillaCanarias=" + isCeutaMelillaCanarias +
                ", productos=" + productos +
                '}';
    }
}
