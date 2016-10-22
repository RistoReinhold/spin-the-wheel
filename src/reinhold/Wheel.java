package com.reinhold;

import java.util.Random;

/**
 * Created by ristor on 18.10.2016.
 */
public class Wheel {
    public Number spin(){
        Random r = new Random();
        //r.setSeed(System.currentTimeMillis());
        Number n = new Number(r.nextInt(36));
        return n;
    }
}
