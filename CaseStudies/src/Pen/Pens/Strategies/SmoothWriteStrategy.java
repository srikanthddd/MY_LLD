package Pen.Pens.Strategies;

public class SmoothWriteStrategy implements WriteStrategy{
    @Override
    public void writeBehaviour() {
        System.out.println("Writing smoothly");
    }
}
