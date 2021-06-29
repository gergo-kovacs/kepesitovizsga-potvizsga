package hu.nive.ujratervezes.kepesitovizsga.forest;

public class WhitebarkPine extends Tree{

    public WhitebarkPine() {
        super();
    }

    public WhitebarkPine(int height) {
        super(height);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    protected void irrigate() {
    this.height += 2;
    }

    @Override
    public String toString() {
        return "WhitebarkPine";
    }
}
