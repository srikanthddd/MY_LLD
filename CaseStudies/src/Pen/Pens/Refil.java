package Pen.Pens;

public class Refil {

    private Ink ink;
    private Nib nib;
    private RefilType refilType;

    public Ink getInk() {
        return ink;
    }

    public void setInk(Ink ink) {
        this.ink = ink;
    }

    public Nib getNib() {
        return nib;
    }

    public void setNib(Nib nib) {
        this.nib = nib;
    }

    public RefilType getRefilType() {
        return refilType;
    }

    public void setRefilType(RefilType refilType) {
        this.refilType = refilType;
    }
}
