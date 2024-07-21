package org.example.pen;

public class Refill {
    Nib nib;
    Ink ink;

    public Refill(Nib nib, Ink ink) {
        this.nib = nib;
        this.ink = ink;
    }
    public Nib getNib() {
        return nib;
    }

    public Ink getInk() {
        return ink;
    }

}
