package Epam.task2.necklace.models.stones;

import Epam.task2.necklace.models.Decor;

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
}
