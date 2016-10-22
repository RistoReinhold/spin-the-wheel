package com.reinhold;

import java.util.Iterator;

/**
 * Created by ristor on 18.10.2016.
 */
public class Casino {
    private Wheel w;
    private int number;
    private int color;




    public Casino() {
        w= new Wheel();
    }

    public Results play(BetList betList){
        Number n = w.spin();
        Results resultList = new Results();
        Iterator iter = betList.betsIter();
        while(iter.hasNext()){
            Bet b = (Bet) iter.next();
            if (b.getBetType()==1){
                //ColorBet
                if(n.getColorCode()==b.getBetValue()){
                    Result r= new Result(b, n, true,2*b.getCash());
                    resultList.addResult(r);
                }else{
                    Result r= new Result(b, n, false,0);
                    resultList.addResult(r);
                }
            } else if (b.getBetType()==2){
                //Number bet
            }
        }
        return resultList;
    }


}
