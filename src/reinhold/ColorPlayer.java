package com.reinhold;

/**
 * Created by ristor on 18.10.2016.
 */
public class ColorPlayer extends Player{

    public ColorPlayer(int money, int betSize) {
        super(money, betSize);
    }

    @Override
    public void play() {
        Bet b = new ColorBet(1, makeABet());
        BetList bList = new BetList();
        bList.addBet(b);
        Results results = casino.play(bList);
        resultsList.add(results);
        lastResults=results;


    }
}
