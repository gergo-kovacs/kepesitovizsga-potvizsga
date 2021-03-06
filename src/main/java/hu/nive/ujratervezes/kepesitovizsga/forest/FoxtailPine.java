package hu.nive.ujratervezes.kepesitovizsga.forest;

public class FoxtailPine extends Tree{
    public FoxtailPine() {
        super();
    }

    public FoxtailPine(int height) {
        super(height);
    }

    @Override
    public int getHeight() {
        return super.getHeight();
    }

    @Override
    protected void irrigate() {
        this.height +=1;
    }

    @Override
    public String toString() {
        return "FoxtailPine";
    }
}
