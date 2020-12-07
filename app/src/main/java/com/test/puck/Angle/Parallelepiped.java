package com.test.puck.Angle;

import static com.test.puck.Input.onetext;
import static com.test.puck.Input.twotext;

public class Parallelepiped implements Angles{
    int areo = onetext;
    int treo = twotext;

    @Override
    public void perimeter() {
        System.out.println("Периметр равен" + 4 * ((2 * areo)+treo));
    }

    @Override
    public void square() {
        System.out.println("Площядь равна :" + 2*(2*(areo * treo) + (areo ^2)));
    }
}
