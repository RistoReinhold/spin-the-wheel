package com.reinhold;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ristor on 18.10.2016.
 */
public class BetList {
    private List<Bet> list;

    public BetList() {
        list= new ArrayList<Bet>();
    }


    public void addBet(Bet b){
        list.add(b);
    }

    public Iterator betsIter(){
        return list.iterator();
    }


}
