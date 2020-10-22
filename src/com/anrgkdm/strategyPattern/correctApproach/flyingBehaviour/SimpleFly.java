package com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour;

import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.IFlyBehaviour;

public class SimpleFly implements IFlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Simply Flying");
    }
}
