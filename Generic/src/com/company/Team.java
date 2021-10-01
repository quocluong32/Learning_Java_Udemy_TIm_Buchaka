package com.company;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + "is already on this team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + "has been added for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirSroce) {
        if (ourScore > theirSroce) {
            won++;
        } else if (ourScore == theirSroce) {
            tied++;
        } else {
            lost++;
        }
        played++;
        if(opponent != null) {
            opponent.matchResult(null, theirSroce, ourScore);
        }
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}
