package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
       FootBallPlayer joe = new FootBallPlayer("Joe");
       BaseBallPlayer pat = new BaseBallPlayer("Pat");
       SoccerPlayer beckham = new SoccerPlayer("Beckham");

       Team<BaseBallPlayer> adelaideCrows = new Team<>("Adelaide Crows");
//       adelaideCrows.addPlayer(joe);
       adelaideCrows.addPlayer(pat);
//       adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());
    }
}
