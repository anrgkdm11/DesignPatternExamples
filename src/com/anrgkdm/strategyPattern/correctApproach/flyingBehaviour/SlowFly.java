package com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour;

import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.IFlyBehaviour;

public class SlowFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Slow Flying");
    }
}
