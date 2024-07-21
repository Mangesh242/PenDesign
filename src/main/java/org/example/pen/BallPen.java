package org.example.pen;

import org.example.Enums.ClosingType;
import org.example.Enums.PenType;
import org.example.Interfaces.Refillable;

public class BallPen extends Pen implements Refillable {
    Refill refill;
    Nib nib;
    Ink ink;

    public BallPen(String name, String brand, float price, PenType penType, ClosingType closingType){
        super(name,brand,price,penType,closingType);
        nib=new Nib();
        ink=new Ink();
        refill=new Refill(nib,ink);
    }
    @Override
    public void write() {
        System.out.println("BallPen Pen is opening by "+this.closeType);
    }

    @Override
    public void open() {
        System.out.println("BallPen Pen is closing by "+this.closeType);
    }

    @Override
    public void close() {

    }
}
