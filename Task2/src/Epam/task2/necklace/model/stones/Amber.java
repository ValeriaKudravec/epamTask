package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.model.Decor;

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
        show.append("Emerald: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nType of pearl localities: ")
                .append(getSizeType());
        return show.toString();
    }
}
