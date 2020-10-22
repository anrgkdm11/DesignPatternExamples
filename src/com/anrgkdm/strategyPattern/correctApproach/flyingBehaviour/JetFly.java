package com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour;

import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.IFlyBehaviour;

public class JetFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying Super Fast With Jet Engine");
    }
}
