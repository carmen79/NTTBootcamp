package com.car;

import com.car.circuitbreaker.CircuitBreaker;

public class Main {

    public static void main(String[] args) {
        CircuitBreaker cb = new CircuitBreaker(10, 5, 15, 15, 3);

        System.out.println("Estado de CB: " + cb.getEstado());
    }
}
