package com.anrgkdm.strategyPattern.correctApproach.displayBehaviours;

import com.anrgkdm.strategyPattern.correctApproach.displayBehaviours.IDisplayBehaviour;

public class TextualDisplay implements IDisplayBehaviour {

    @Override
    public void display() {
        System.out.println("Textual Display");
    }
}
