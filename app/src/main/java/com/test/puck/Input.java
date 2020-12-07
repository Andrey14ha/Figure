package com.test.puck;

import com.test.puck.Angle.Angles;
import com.test.puck.Angle.Cube;
import com.test.puck.Angle.Parallelepiped;
import com.test.puck.Orbs.Ball;
import com.test.puck.Orbs.Orb;

public class Input {

    private static Cube cube;
    private static Ball ball;
    private static Parallelepiped parallelepiped;
    public static int onetext;
    public static int twotext;

    static int[] text = {2, 2};

    public Object input() {
        int length = text.length;
        if (length == 1) {
            onetext = text[0];
            return ball;
        }
        if (length == 2 && text[0] == text[1]) {
            onetext = text[0];
            return cube;
        }
        if (length == 2 && text[0] != text[1]){
            onetext = text[0];
            twotext = text[1];
            return parallelepiped;
        }

        return null;
    }


}
