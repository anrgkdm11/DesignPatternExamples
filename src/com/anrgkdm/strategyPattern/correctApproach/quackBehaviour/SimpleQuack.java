package com.anrgkdm.strategyPattern.correctApproach.quackBehaviour;

import com.anrgkdm.strategyPattern.correctApproach.quackBehaviour.IQuackBehaviour;

public class SimpleQuack implements IQuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Simple Quack");
    }
}
