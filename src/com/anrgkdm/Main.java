package com.anrgkdm;

import com.anrgkdm.strategyPattern.correctApproach.StrategicDuck;
import com.anrgkdm.strategyPattern.correctApproach.displayBehaviours.GraphicalDisplay;
import com.anrgkdm.strategyPattern.correctApproach.displayBehaviours.TextualDisplay;
import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.JetFly;
import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.SimpleFly;
import com.anrgkdm.strategyPattern.correctApproach.flyingBehaviour.SlowFly;
import com.anrgkdm.strategyPattern.correctApproach.quackBehaviour.GenericQuack;
import com.anrgkdm.strategyPattern.correctApproach.quackBehaviour.NoQuack;
import com.anrgkdm.strategyPattern.correctApproach.quackBehaviour.SimpleQuack;
import com.anrgkdm.strategyPattern.wrongApproach.CityDuck;
import com.anrgkdm.strategyPattern.wrongApproach.CloudDuck;
import com.anrgkdm.strategyPattern.wrongApproach.Duck;
import com.anrgkdm.strategyPattern.wrongApproach.MountainDuck;

public class Main {

    public static void main(String[] args) {

        /** Problem with wrong approach is we will have to keep creating as many classes as required with the specific behaviours of quacking / flying / displaying
         *  and just copy - pest same methods to make reuse as below
         **/

        Duck cityDuck = new CityDuck();
        Duck cloudDuck = new CloudDuck();
        Duck mountainDuck = new MountainDuck();
        // Now if we want to have another different kind of duck say RubberDuck with some no flying behaviour but all other behaviours as that of City Duck
        // We will have to create another class for this. This will create class explosion

        // So with Strategic approach, we will not have to create any more classes, we can just create more instances of different kids of ducks with different behaviours

        StrategicDuck strategicCityDuck = new StrategicDuck(new GraphicalDisplay(), new SimpleFly(), new SimpleQuack());
        StrategicDuck strategicCloudDuck = new StrategicDuck(new TextualDisplay(), new SimpleFly(), new GenericQuack());
        StrategicDuck strategicMountainDuck = new StrategicDuck(new TextualDisplay(), new SlowFly(), new GenericQuack());
        StrategicDuck strategicRubberDuck = new StrategicDuck(new GraphicalDisplay(), new JetFly(), new NoQuack());
    }
}
