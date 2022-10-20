package Pen.Pens.PenClasses;

import Pen.Pens.Refil;
import Pen.Pens.Strategies.WriteStrategy;

public class GelPen extends Pen {

    private Refil refil;

    public GelPen(WriteStrategy writeStrategy){
        super(writeStrategy);
    }

    public Refil getRefill() {
        return refil;
    }

    public void setRefill(Refil refil) {
        this.refil = refil;
    }

}
