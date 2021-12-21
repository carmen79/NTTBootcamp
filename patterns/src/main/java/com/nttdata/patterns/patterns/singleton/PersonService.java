package com.nttdata.patterns.patterns.singleton;

public class PersonService {
    private static PersonService instance;

    private PersonService() {

    }

    public static PersonService getInstance() {
        if (instance == null) {
            instance = new PersonService();
        }
        return instance;
    }
}
