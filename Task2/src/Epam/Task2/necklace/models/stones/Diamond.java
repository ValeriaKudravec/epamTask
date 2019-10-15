package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.models.naturalstones.NaturalStones;

public class Diamond extends NaturalStones {
    public void polishDiamont(){
        System.out.println("Diamont is polish");
    }
    @Override
    public String toString(){
        StringBuilder show = new StringBuilder();
        show.append("Diamond: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nHardness: ")
                .append(getHardness())
                .append(";\nRareness: ")
                .append(getRareness())
                .append(";\nTransparency: ").append(getTransparency());
        return show.toString();
    }
    public static boolean isDianomd(String in){
        return "diamond".compareToIgnoreCase(in.split(";")[0])>0;
    }

}
