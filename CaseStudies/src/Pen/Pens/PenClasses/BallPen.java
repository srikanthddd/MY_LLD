package Pen.Pens.PenClasses;

import Pen.Pens.Refil;
import Pen.Pens.Strategies.WriteStrategy;

public class BallPen extends Pen {

    public BallPen(WriteStrategy writeStrategy){
        super(writeStrategy);
    }
    private Refil refil;

    public Refil getRefill() {
        return refil;
    }

    public void setRefill(Refil refil) {
        this.refil = refil;
    }

}
