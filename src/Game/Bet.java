package com.reinhold;

/**
 * Created by ristor on 18.10.2016.
 */
public abstract class Bet {
    private int cash;
    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }


    public abstract int getBetType();
    public abstract int getBetValue();

}
