package com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour;

public class GenericFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Generic Fly");
    }
}
