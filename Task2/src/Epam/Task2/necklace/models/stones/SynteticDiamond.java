package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.models.syntheticstones.SynteticStones;

public class SynteticDiamond extends SynteticStones {
    @Override
    public String toString(){
        StringBuilder show = new StringBuilder();
        show.append("Syntetic Diamond: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nHardness: ")
                .append(getHardness())
                .append(";\nTransparency").append(getTransparency());
        return show.toString();
    }
    public static boolean isSynteticDiamond(String in){
        return "Syntetic diamond".compareToIgnoreCase(in.split(";")[0])>0;
    }

}
