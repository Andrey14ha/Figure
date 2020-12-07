package com.test.puck.Orbs;

import static com.test.puck.Input.onetext;


public class Ball implements Orb{
    int radius = onetext;

    @Override
    public void perimeter() {
        System.out.println("Периметр равен" + 2*(Math.PI + radius));
    }

    @Override
    public void square() {
        System.out.println("Площядь равна" + 4 * (Math.PI +(radius ^2)));
    }
}
