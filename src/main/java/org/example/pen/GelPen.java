package org.example.pen;

import org.example.Enums.ClosingType;
import org.example.Enums.PenType;
import org.example.Interfaces.Refillable;

public class GelPen extends Pen implements Refillable {
    Refill refill;
    Nib nib;
    Ink ink;
    public GelPen(String name, String brand, float price, PenType penType, ClosingType closeType) {
        super(name,brand,price,penType,closeType);
        nib=new Nib(4);
        ink=new Ink("Red");
        refill=new Refill(nib,ink);
    }

    @Override
    public void write() {
        System.out.println("GelPen Pen is opening by "+this.closeType);
    }

    @Override
    public void open() {
        System.out.println("GelPen Pen is closing by "+this.closeType);
    }

    @Override
    public void close() {

    }

}
