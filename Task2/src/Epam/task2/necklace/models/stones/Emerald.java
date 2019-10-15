package Epam.task2.necklace.models.stones;

import Epam.task2.necklace.models.naturalstones.NaturalStones;

public class Emerald extends NaturalStones {
    @Override
    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append("Emerald: ").append("\nCost: ")
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
