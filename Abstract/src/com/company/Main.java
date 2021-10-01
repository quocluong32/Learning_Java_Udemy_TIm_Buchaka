package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Yorkie");
        dog.eat();
        dog.breathe();

        Bird bird = new Parrot("Parrot");
        bird.eat();
        bird.breathe();
        bird.fly();

        Penguine penguine = new Penguine("Emperor");
        penguine.fly();
    }
}
