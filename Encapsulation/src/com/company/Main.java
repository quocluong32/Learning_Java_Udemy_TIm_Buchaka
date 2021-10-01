package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*Player player = new Player();
        player.name = "Tim";
        player.health = 100;
        player.weapon = "Sword";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining health is: " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth(damage);
        System.out.println("Remaining health is: " + player.healthRemaining());*/

        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "sword");
        System.out.println("Initial health is: " + player.getHitPoints());
    }


}
