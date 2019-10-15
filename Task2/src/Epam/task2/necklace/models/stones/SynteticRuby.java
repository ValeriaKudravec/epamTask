package Epam.task2.necklace.models.stones;

import Epam.task2.necklace.models.syntheticstones.SynteticStones;

public class SynteticRuby extends SynteticStones {
    @Override
    public String toString() {
        StringBuilder show = new StringBuilder();
        show.append("Syntetic Ruby: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nHardness: ")
                .append(getHardness())
                .append(";\nTransparency").append(getTransparency());
        return show.toString();
    }
}
