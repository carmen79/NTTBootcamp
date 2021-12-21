package com.car.circuitbreaker;

public class CircuitBreaker {

    private Integer nintentosfallidos;
    private Integer  nintendosok;
    private Integer limiteerror;
    private Integer nintentosmax;
    private Integer numintentoactual;

    public CircuitBreaker(Integer nintentosfallidos, Integer nintendosok, Integer limiteerror, Integer nintentosmax, Integer numintentoactual) {
        this.nintentosfallidos = nintentosfallidos;
        this.nintendosok = nintendosok;
        this.limiteerror = limiteerror;
        this.nintentosmax = nintentosmax;
        this.numintentoactual = numintentoactual;
    }

    public String getEstado() {
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

    public Integer getNintendosok() {
        return nintendosok;
    }

    public void setNintendosok(Integer nintendosok) {
        this.nintendosok = nintendosok;
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
                ", nintendosok=" + nintendosok +
                ", limiteerror=" + limiteerror +
                ", nintentosmax=" + nintentosmax +
                ", numintentoactual=" + numintentoactual +
                '}';
    }
}
