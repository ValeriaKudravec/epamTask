package Epam.task2.necklace.model.naturalstones;

import Epam.task2.necklace.model.Decor;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NaturalStones)) return false;
        if (!super.equals(o)) return false;
        NaturalStones that = (NaturalStones) o;
        return Double.compare(that.getHardness(), getHardness()) == 0 &&
                getTransparency() == that.getTransparency() &&
                getRareness() == that.getRareness()&& getWeight() == getWeight() &&
                Double.compare(getCost(), getCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRareness(), getHardness(), getTransparency());
    }
}
