package com.car.circuitbreaker;

public class CircuitBreaker {

    private Integer nintentosfallidos;
    private Integer nintentosok;
    private Integer limiteerror;
    private Integer nintentosmax;
    private Integer numintentoactual;

    public CircuitBreaker(Integer nintentosfallidos, Integer nintentosok, Integer limiteerror, Integer nintentosmax, Integer numintentoactual) {
        this.nintentosfallidos = nintentosfallidos;
        this.nintentosok = nintentosok;
        this.limiteerror = limiteerror;
        this.nintentosmax = nintentosmax;
        this.numintentoactual = numintentoactual;
    }

    public void retry() {
        // Simulamos un retry en el que sabemos que falla
        this.nintentosfallidos++;
        this.numintentoactual++;
    }
    public String getEstado() {
        // Si hacemos 5 (por ejemplo) intentos ok seguidos, ponemos los fallos a cero
        if (this.nintentosok == 5 ) {
            // Actualizamos el estado de fallos a cero
            this.nintentosfallidos = 0;
        }

        if (this.nintentosfallidos == 0) {
            return "CLOSED";
        } else if (this.nintentosfallidos >= this.limiteerror) {
            return "OPEN";
        } else {
            return  "HALF";
        }
    }

    public Integer getNintentosfallidos() {
        return nintentosfallidos;
    }

    public void setNintentosfallidos(Integer nintentosfallidos) {
        this.nintentosfallidos = nintentosfallidos;
    }

    public Integer getNintentosok() {
        return nintentosok;
    }

    public void setNintentosok(Integer nintentosok) {
        this.nintentosok = nintentosok;
    }

    public Integer getLimiteerror() {
        return limiteerror;
    }

    public void setLimiteerror(Integer limiteerror) {
        this.limiteerror = limiteerror;
    }

    public Integer getNintentosmax() {
        return nintentosmax;
    }

    public void setNintentosmax(Integer nintentosmax) {
        this.nintentosmax = nintentosmax;
    }

    public Integer getNumintentoactual() {
        return numintentoactual;
    }

    public void setNumintentoactual(Integer numintentoactual) {
        this.numintentoactual = numintentoactual;
    }

    @Override
    public String toString() {
        return "CircuitBreaker{" +
                "nintentosfallidos=" + nintentosfallidos +
                ", nintendosok=" + nintentosok +
                ", limiteerror=" + limiteerror +
                ", nintentosmax=" + nintentosmax +
                ", numintentoactual=" + numintentoactual +
                '}';
    }
}
