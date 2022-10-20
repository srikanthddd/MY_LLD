package Pen.Pens.PenClasses;

import Pen.Pens.Ink;
import Pen.Pens.Nib;
import Pen.Pens.Strategies.WriteStrategy;

public class FountainPen extends Pen {

    private Nib nib;
    private Ink ink;

    public FountainPen(WriteStrategy writeStrategy){
        super(writeStrategy);
    }
}
