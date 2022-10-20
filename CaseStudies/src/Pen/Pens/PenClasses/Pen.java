package Pen.Pens.PenClasses;

import Pen.Pens.Cap;
import Pen.Pens.Strategies.WriteStrategy;

public abstract class Pen {

    private WriteStrategy writeStrategy;
    private String name;
    private String brand;
    private double length;

    public Pen(){

    }

    public Pen(WriteStrategy writeStrategy){
        this.writeStrategy = writeStrategy;
    }

    public void getWriteStrategy() {
        this.writeStrategy.writeBehaviour();
    }

    public void setWriteStrategy(WriteStrategy writeStrategy) {
        this.writeStrategy = writeStrategy;
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

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Cap getCap() {
        return cap;
    }

    public void setCap(Cap cap) {
        this.cap = cap;
    }

    private Cap cap;


    public void write() {
        this.writeStrategy.writeBehaviour();
    }
}
