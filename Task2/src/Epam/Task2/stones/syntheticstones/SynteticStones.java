package Epam.Task2.stones.syntheticstones;

import Epam.Task2.stones.Decor;

public abstract class SynteticStones extends Decor {
    private double hardness;
    private int transparency;
    public double getHardness() {
        return hardness;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}

