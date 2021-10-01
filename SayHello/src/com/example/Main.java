package com.example;

// The simple demo to demonstrate deadlocks with 2 threads calling 2 objects not in orders.
public class Main {

    public static void main(String[] args) {
	// write your code here
        PolitePersion jane = new PolitePersion("Jane");
        PolitePersion john = new PolitePersion("John");

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(john);

            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(jane);

            }
        }).start();
    }

    static class PolitePersion {
        private final String name;

        public PolitePersion(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePersion person) {
            System.out.format("%s : %s has said hello to me!%n", this.name, person.getName() );
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePersion person) {
            System.out.format("%s : %s has said back to me!%n", this.name, person.getName());
        }
    }
}
