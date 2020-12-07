package com.test.puck;

import com.test.puck.Angle.Angles;
import com.test.puck.Instrments.Instrument;
import com.test.puck.Orbs.Orb;

public class Application {

    private Angles angles;
    private Orb orb;

    public Application(Instrument factory){
        angles = factory.instrumentAngles();
        orb = factory.instrumentOrb();
    }

    public void perimeter(){
        angles.perimeter();
        orb.perimeter();
    }

    public void square(){
        angles.square();
        orb.square();
    }

}
