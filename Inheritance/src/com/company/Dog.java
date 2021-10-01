package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog() {
    }

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
        this.teeth = teeth;
    }

    private void chew() {
        System.out.println("Dog chew");
    }

    @Override
    public void eat() {
        super.eat();
        chew();
    }

    public void walk() {
        System.out.println("Dog walk");
        move(5);
    }

    public void run() {
        System.out.println("Dog run");
        move(10);
    }

    private void moveLeg(int speed) {
        System.out.println("Dog.movedLegs() called");
    }

    @Override
    public void move(int spped) {
        System.out.println("Dog.move() called");
        moveLeg(spped);
        super.move(spped);
    }

    public int getEyes() {
        return eyes;
    }

    public int getLegs() {
        return legs;
    }

    public int getTail() {
        return tail;
    }

    public int getTeeth() {
        return teeth;
    }

    public String getCoat() {
        return coat;
    }
}
