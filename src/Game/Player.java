package com.reinhold;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ristor on 18.10.2016.
 */
public abstract class Player {
    public int money;
    public int betSize;
    public Casino casino;
    public Results lastResults;
    public List<Results> resultsList;

    public Player(int money, int betSize) {
        this.money = money;
        this.betSize = betSize;
        resultsList = new ArrayList<Results>();

    }

    public abstract void play();
    public int makeABet(){
        try {
            if(money-betSize>0){
                money=money-betSize;
                return betSize;
            }else{
                Exception e = new Exception();

                throw e;


            }
        } catch (Exception e) {
            System.out.println(" Not enough money to make a bet");
            return 0;
        }
    }

    public void getSituation(){
        Iterator iter = lastResults.resultsIter();
        while(iter.hasNext())
            System.out.println(iter.next().toString());
        }
        System.out.println(money);
    }


}
