package Epam.task2.necklace.models.naturalstones;

import Epam.task2.necklace.models.Decor;

public abstract class NaturalStones extends Decor {
    private Rareness rareness;
    private double hardness;
    private int transparency;

    public double getHardness() {
        return hardness;
    }

    public int getTransparency() {
        return transparency;
    }

    public Rareness getRareness() {
        return rareness;
    }

    public void setHardness(double hardness) {
        this.hardness = hardness;
    }

    public void setRareness(Rareness rareness) {
        this.rareness = rareness;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }
}