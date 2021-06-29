package hu.nive.ujratervezes.kepesitovizsga.forest;

public abstract class Tree {
    protected int height;

    public Tree() {
        this.height=0;
    }

    public Tree(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    protected void irrigate(){};

}
