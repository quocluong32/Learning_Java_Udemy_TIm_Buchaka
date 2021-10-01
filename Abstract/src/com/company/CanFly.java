package com.company;

public interface CanFly {
    void fly();
    default void eat() {
        System.out.println("lalala");
    }

}
