package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.model.Decor;

import java.util.Objects;

public class Pearl extends Decor {
    private TypeOfPearlLocalities typeOfPearlLocalities;

    public TypeOfPearlLocalities getTypeOfPearlLocalities() {
        return typeOfPearlLocalities;
    }

    public void setTypeOfPearlLocalities(TypeOfPearlLocalities typeOfPearlLocalities) {
        this.typeOfPearlLocalities = typeOfPearlLocalities;
    }

    @Override
    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append("Pearl: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nType of pearl localities: ")
                .append(getTypeOfPearlLocalities());
        return show.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pearl)) return false;
        if (!super.equals(o)) return false;
        Pearl pearl = (Pearl) o;
        return getTypeOfPearlLocalities() == pearl.getTypeOfPearlLocalities()
                &&getWeight() == getWeight() &&
                Double.compare(getCost(), getCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypeOfPearlLocalities());
    }
}
