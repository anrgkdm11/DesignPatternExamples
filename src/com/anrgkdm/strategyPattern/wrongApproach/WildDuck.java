package com.anrgkdm.strategyPattern.wrongApproach;

public class WildDuck extends Duck{

    @Override
    public void display(){
        System.out.println("Textual Display");
    }

    @Override
    public void fly(){
        System.out.println("Simply Flying");
    }
}
