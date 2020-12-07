package com.test.puck.Angle;

import com.test.puck.Input;

import static com.test.puck.Input.onetext;

public class Cube implements Angles{
    int areo = onetext;


    @Override
    public void perimeter() {
        System.out.println("Периметр равен" + 12 * areo);
    }

    @Override
    public void square() {
        System.out.println("Площядь равна :" + 6 * (areo^2));

    }
}
