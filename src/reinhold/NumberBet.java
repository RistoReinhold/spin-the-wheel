package com.reinhold;

/**
 * Created by ristor on 18.10.2016.
 */
public class NumberBet  extends Bet {
    private int bet;

    public NumberBet(int bet, int cash) {
        this.bet = bet;
        this.setCash(cash);
    }


    @Override
    public int getBetType() {
        return 2;
    }

    @Override
    public int getBetValue() {
        return bet;
    }
}
