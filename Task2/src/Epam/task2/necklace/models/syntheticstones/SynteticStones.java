package Epam.task2.necklace.models.syntheticstones;

import Epam.task2.necklace.models.Decor;

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

