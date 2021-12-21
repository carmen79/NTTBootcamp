package com.car;

import com.car.model.Person;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Person p = Person.getInstance();

        System.out.println(p);

        Person p2 = Person.getInstance();
        System.out.println(p);
    }
}
