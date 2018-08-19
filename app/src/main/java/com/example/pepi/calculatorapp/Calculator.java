package com.example.pepi.calculatorapp;

/**
 * Created by pepi_ on 08/19/2018.
 */

public class Calculator {

    private double first,second;

    public void setFirst(double first) {
        this.first = first;
    }

    public void setSecond(double second) {
        this.second = second;
    }

    public double Adition(){

        return first+second;
    }

    public double Subtraction(){

        return first-second;
    }

    public double Multiplication(){

        return first*second;
    }

    public double Division() throws Exception {

        if(second == 0)
        {
            throw new Exception("Nuk lejohet pjestimi me zero");
        }

        return first/second;
    }

    public double Mod(){

        if(second == 0)
            return 1;

        double amount=1;

        for(int i=1;i<=(int) second;i++){
            amount=amount*first;
        }

        return amount;
    }


}
