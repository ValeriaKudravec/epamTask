package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.model.naturalstones.NaturalStones;

public class Ruby extends NaturalStones {
    @Override
    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append("Ruby: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nHardness: ")
                .append(getHardness())
                .append(";\nRareness ")
                .append(getRareness())
                .append(";\nTransparency").append(getTransparency());
        return show.toString();
    }

}