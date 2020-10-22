package com.anrgkdm.strategyPattern.wrongApproach;

public class CityDuck extends Duck {

    @Override
    public void display(){
        System.out.println("Graphical Display");
    }

    @Override
    public void fly(){
        System.out.println("Simply Flying");
    }
}
