package com.reinhold;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ristor on 18.10.2016.
 */
public class Number {


    private int value;
    //0 roheline
    //1 punane
    //2 must
    private int colorCode;
    private Map<Integer,Integer> colorMatrix= new HashMap<Integer, Integer>();


    public Number(int value) {
        colorMatrix.put(0,0);
        colorMatrix.put(1,1);
        colorMatrix.put(2,2);
        colorMatrix.put(3,1);
        colorMatrix.put(4,2);
        colorMatrix.put(5,1);
        colorMatrix.put(6,2);
        colorMatrix.put(7,1);
        colorMatrix.put(8,2);
        colorMatrix.put(9,1);
        colorMatrix.put(10,2);
        colorMatrix.put(11,2);
        colorMatrix.put(12,1);
        colorMatrix.put(13,2);
        colorMatrix.put(14,1);
        colorMatrix.put(15,2);
        colorMatrix.put(16,1);
        colorMatrix.put(17,2);
        colorMatrix.put(18,1);
        colorMatrix.put(19,1);
        colorMatrix.put(20,2);
        colorMatrix.put(21,1);
        colorMatrix.put(22,2);
        colorMatrix.put(23,1);
        colorMatrix.put(24,2);
        colorMatrix.put(25,1);
        colorMatrix.put(26,2);
        colorMatrix.put(27,1);
        colorMatrix.put(28,2);
        colorMatrix.put(29,2);
        colorMatrix.put(30,1);
        colorMatrix.put(31,2);
        colorMatrix.put(32,1);
        colorMatrix.put(33,2);
        colorMatrix.put(34,1);
        colorMatrix.put(35,2);
        colorMatrix.put(36,1);
        this.value = value;
        this.colorCode=colorMatrix.get(value);
    }
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getColorCode() {
        return colorCode;
    }

    public String getColor(){
        try {
            if(colorCode==0){
                return "green";
            }else if(colorCode==1){
                return "red";
            }else if(colorCode==2){
                return "black";
            }else {
                Exception e = new Exception();
                throw e;
            }
        }catch (Exception e) {
            System.out.print("Wrong colorCode exception!");
            return "";
        }
    }

    public String toString(){
        return "Nr " + value + " Color is " + getColor();
    }
}
