package com.reinhold;

/**
 * Created by ristor on 18.10.2016.
 */
public class Result {
    private Bet b;
    private Number n;
    private boolean win;
    private int winAmount;
    //0 - lose
    //1 - win

    public Result(Bet b, Number n, boolean win, int winAmount) {
        this.b = b;
        this.n = n;
        this.win = win;
        this.winAmount = winAmount;
    }

    public Bet getB() {
        return b;
    }

    public Number getN() {
        return n;
    }

    public boolean isWin() {
        return win;
    }

    public int getWinAmount() {
        return winAmount;
    }
}
