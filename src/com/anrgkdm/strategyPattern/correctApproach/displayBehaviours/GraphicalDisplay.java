package com.anrgkdm.strategyPattern.correctApproach.displayBehaviours;

import com.anrgkdm.strategyPattern.correctApproach.displayBehaviours.IDisplayBehaviour;

public class GraphicalDisplay implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Graphical Display");
    }
}
