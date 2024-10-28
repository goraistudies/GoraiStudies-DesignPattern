package com.goraistudies.designpatterns.singleton;

public class EarlyInitialization {

    /**
     * 1. Declare a static variable that holds the object of this class.
     * 2. Declare the constructor as private.
     * 3. Create a static factory method and declare as public.
     *
     */

    private static final EarlyInitialization instance = new EarlyInitialization();


    private EarlyInitialization() {

    }

    public static EarlyInitialization getInstance() {

        return instance;
    }

}
