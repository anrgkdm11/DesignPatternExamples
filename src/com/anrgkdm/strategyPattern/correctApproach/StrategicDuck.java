package com.anrgkdm.strategyPattern.correctApproach;

import com.anrgkdm.strategyPattern.correctApproach.displayBehaviours.IDisplayBehaviour;
import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.IFlyBehaviour;
import com.anrgkdm.strategyPattern.correctApproach.quackBehaviour.IQuackBehaviour;

public class StrategicDuck {

    private IDisplayBehaviour displayBehaviour;
    private IFlyBehaviour flyBehaviour;
    private IQuackBehaviour quackBehaviour;

    public StrategicDuck(IDisplayBehaviour displayBehaviour, IFlyBehaviour flyBehaviour, IQuackBehaviour quackBehaviour) {
        this.displayBehaviour = displayBehaviour;
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }
}
