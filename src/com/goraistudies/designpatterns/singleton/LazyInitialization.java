package com.goraistudies.designpatterns.singleton;

public class LazyInitialization {

    private static LazyInitialization instance = null;

    /**
     * 1. Declare a static variable that holds the object of this class.
     * 2. Declare the constructor as private.
     * 3. Create a static factory method and declare as public.
     *
     */

    // Constructor
    private LazyInitialization() {

    }

    /**
     * This method should be public
     * It will call the constructor and create an object of this class
     * @return instance of this class.
     */
    public static LazyInitialization getInstance() {

        if (instance == null) {
            instance = new LazyInitialization();
        }

        return instance;
    }
}
