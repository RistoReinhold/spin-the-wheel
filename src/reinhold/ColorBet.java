package com.reinhold;

/**
 * Created by ristor on 18.10.2016.
 */
public class ColorBet extends Bet {


    private int bet;

    public ColorBet(int bet, int cash) {
        this.bet = bet;
        this.setCash(cash);
    }

    @Override
    public int getBetType() {
        return 1;
    }

    @Override
    public int getBetValue() {
        return bet;
    }
}
