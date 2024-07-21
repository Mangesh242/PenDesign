package org.example.pen;

import org.example.Enums.ClosingType;
import org.example.Enums.PenType;

public class FountainPen extends Pen {
    Nib nib;
    Ink ink;
    public FountainPen(String name, String brand, float price, PenType penType, ClosingType closeType) {
        super(name,brand,price,penType,closeType);
        nib=new Nib(4);
        ink=new Ink("Blue");
    }
    @Override
    public void write() {
        System.out.println("Fountain Pen is writing.");
    }

    @Override
    public void open() {
        System.out.println("Fountain Pen is opening by "+this.closeType);
    }

    @Override
    public void close() {
        System.out.println("Fountain Pen is closing by "+this.closeType);
    }
}
