package org.example.pen;

import org.example.util.CONSTANTS;

public class Nib {
    int radius;

    public Nib() {
        this.radius= CONSTANTS.NIB_RADIUS;
    }
    public Nib(int radius) {
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }


}
