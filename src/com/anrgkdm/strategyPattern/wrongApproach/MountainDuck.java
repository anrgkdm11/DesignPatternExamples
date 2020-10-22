package com.anrgkdm.strategyPattern.wrongApproach;

public class MountainDuck extends Duck {
    @Override
    public void fly() {
        System.out.println("Slow Flying");
    }

    @Override
    public void display(){
        System.out.println("Textual Display");
    }
}
