package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.naturalstones.NaturalStones;
import Epam.Task2.necklace.models.naturalstones.Rareness;

import java.util.Scanner;

public class Emerald extends NaturalStones {
    @Override
    public String toString(){
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
    public static boolean isEmerald(String in){
        return "emerald".compareToIgnoreCase(in.split(";")[0])>0;
    }

}
