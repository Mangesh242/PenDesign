package org.example.pen;

import org.example.Enums.ClosingType;
import org.example.Enums.PenType;

public abstract class Pen {

    String name;
    String brand;
    float price;
    PenType penType;
    ClosingType closeType;

    @Override
    public String toString() {
        return "Pen : "+this.name+" "+this.brand+" "+this.price+" "+this.penType;
    }

    public Pen(String name, String brand, float price, PenType penType, ClosingType closeType) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.penType = penType;
        this.closeType = closeType;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public PenType getPenType() {
        return penType;
    }

    public void setPenType(PenType penType) {
        this.penType = penType;
    }

    public ClosingType getCloseType() {
        return closeType;
    }

    public void setCloseType(ClosingType closeType) {
        this.closeType = closeType;
    }

    public abstract void write();
    public abstract void open();
    public abstract void close();

}
