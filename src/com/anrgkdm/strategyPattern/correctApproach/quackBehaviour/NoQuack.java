package com.anrgkdm.strategyPattern.correctApproach.quackBehaviour;

import com.anrgkdm.strategyPattern.correctApproach.quackBehaviour.IQuackBehaviour;

public class NoQuack implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("I Am Mute !!!");
    }
}
