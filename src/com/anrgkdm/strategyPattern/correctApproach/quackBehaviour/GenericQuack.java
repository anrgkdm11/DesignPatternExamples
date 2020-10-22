package com.anrgkdm.strategyPattern.correctApproach.quackBehaviour;

public class GenericQuack implements IQuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Generic Display");
    }
}
