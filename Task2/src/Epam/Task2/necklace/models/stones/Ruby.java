package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.models.naturalstones.NaturalStones;

public class Ruby extends NaturalStones {
    @Override
    public String toString(){
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
    public static boolean isRuby(String in){
        return "ruby".compareToIgnoreCase(in.split(";")[0])>0;
    }

}
