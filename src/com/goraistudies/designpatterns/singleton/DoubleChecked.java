package com.goraistudies.designpatterns.singleton;

public class DoubleChecked {

    private static DoubleChecked instance = null;

    /**
     * 1. Declare a static variable that holds the object of this class.
     * 2. Declare the constructor as private.
     * 3. Create a static factory method and declare as public.
     *
     */

    // Constructor
    private DoubleChecked() {

    }

    /**
     * This method should be public
     * It will call the constructor and create an object of this class
     * @return instance of this class.
     *
     *  Complete method execution time is 5ms
     *  Bussiness logic execution time is 3 ms
     *  and instance creation time is 2 ms
     */
    public static DoubleChecked getInstance() {

        // You have some bussiness logic

        if (instance == null) {

            synchronized (DoubleChecked.class) {
                if (instance == null) {
                    instance = new DoubleChecked();
                }

            }

        }

        return instance;
    }
}
