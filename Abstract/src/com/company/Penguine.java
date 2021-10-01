package com.company;

public class Penguine extends Bird{
    public Penguine(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly();
        System.out.println("I'm not very good at flying.");
    }
}
