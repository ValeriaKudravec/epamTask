package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.model.syntheticstones.SynteticStones;

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
