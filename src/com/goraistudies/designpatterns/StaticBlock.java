package com.goraistudies.designpatterns;

public class StaticBlock {

    /**
     * 1. Declare a static variable that holds the object of this class.
     * 2. Declare the constructor as private.
     * 3. Create a static factory method and declare as public.
     *
     */

    private static StaticBlock instance = null;

    private StaticBlock() {

    }

    static {
        try {
            instance = new StaticBlock();
        } catch (Exception ex) {

            throw new RuntimeException("Error occurred during the object creation {}", ex);
        }

    }

    public static StaticBlock getInstance() {

        return instance;
    }
}
