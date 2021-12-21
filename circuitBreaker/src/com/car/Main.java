package com.car;

import com.car.circuitbreaker.CircuitBreaker;

public class Main {

    public static void main(String[] args) {
        CircuitBreaker cb = new CircuitBreaker(0, 0, 15, 15, 0);

        System.out.println("Estado INICIAL de CB: " + cb.getEstado());
        for (int i = 0; i < 20; i++) {
            cb.retry();
            System.out.println("Estado de CB: " + cb.getEstado());
        }
    }
}
