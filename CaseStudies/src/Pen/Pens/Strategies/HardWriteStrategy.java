package Pen.Pens.Strategies;

public class HardWriteStrategy implements WriteStrategy{
    @Override
    public void writeBehaviour() {
        System.out.println("Writing hardly");
    }
}
