package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GearBox mcLaren = new GearBox(6);
        GearBox.Gear first = mcLaren.new Gear(1, 12.3);
//        GearBox.Gear second = new Gearbox.Gear(2, 15.4);
//        GearBox.Gear third = new GearBox.Gear(3, 17.8);
        System.out.println(first.driveSpeed(1000));
    }
}
