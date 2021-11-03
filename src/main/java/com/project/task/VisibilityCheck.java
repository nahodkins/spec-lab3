package com.project.task;

public class VisibilityCheck {

    private MyClass myClass;

    public void checkVisibility() {
        // Private variable is visible only inside the class where it was declared
//        myClass.integer = 3;

        // Protected variable is visible in the same-package classes or in the extended ones
        myClass.aChar = 'a';

        // Public variable is visible in the every project classes
        myClass.aDouble = 5.5;
    }
}
