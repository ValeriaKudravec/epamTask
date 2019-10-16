package Epam.task2.necklace.model.syntheticstones;

import Epam.task2.necklace.model.Decor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SynteticStones)) return false;
        if (!super.equals(o)) return false;
        SynteticStones that = (SynteticStones) o;
        return Double.compare(that.getHardness(), getHardness()) == 0 &&
                getTransparency() == that.getTransparency()&&getWeight() == getWeight() &&
                Double.compare(getCost(), getCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHardness(), getTransparency());
    }
}

