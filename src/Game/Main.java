package com.reinhold;

public class Main {

    public static void main(String[] args) {
	    Wheel w = new Wheel();
        for(int i=0; i<100; i++){
            Number n = w.spin();
            System.out.println(n.toString());
        }
    }
}
