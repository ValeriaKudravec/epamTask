package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.model.Decor;

import java.util.Objects;

public class Amber extends Decor {
    private TypeOfAmber sizeType;

    public TypeOfAmber getSizeType() {
        return sizeType;
    }

    public void setSizeType(TypeOfAmber sizeType) {
        this.sizeType = sizeType;
    }

    @Override
    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append("amber: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nType of pearl localities: ")
                .append(getSizeType());
        return show.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amber)) return false;
        if (!super.equals(o)) return false;
        Amber amber = (Amber) o;
        return getSizeType() == amber.getSizeType()&&getWeight() == getWeight() &&
                Double.compare(getCost(), getCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSizeType());
    }
}
