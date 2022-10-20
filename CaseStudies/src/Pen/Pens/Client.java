package Pen.Pens;

import Pen.Pens.PenClasses.BallPen;
import Pen.Pens.PenClasses.GelPen;
import Pen.Pens.PenClasses.Pen;
import Pen.Pens.Strategies.HardWriteStrategy;
import Pen.Pens.Strategies.SmoothWriteStrategy;

public class Client {
    public static void main(String[] args) {

        Pen genPen = new GelPen(new SmoothWriteStrategy());
        Pen ballPen = new BallPen(new HardWriteStrategy());

        genPen.write();
        ballPen.write();
    }
}
