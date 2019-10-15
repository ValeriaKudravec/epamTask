package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.naturalstones.NaturalStones;
import Epam.Task2.necklace.models.naturalstones.Rareness;

import java.util.Scanner;

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
                .append(";\nRareness ")
                .append(getRareness())
                .append(";\nTransparency").append(getTransparency());
        return show.toString();
    }
    public static boolean isDianomd(String in){
        return "diamond".compareToIgnoreCase(in.split(";")[0])>0;
    }
    public static Diamond parseStringToDiamond (String inputString)throws ParseLineException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            Diamond diamond = new Diamond();
            scanner.next();
            diamond.setCost(Integer.parseInt(scanner.next()));
            diamond.setWeight(Integer.parseInt(scanner.next()));
            diamond.setHardness(Double.parseDouble(scanner.next()));
            diamond.setRareness(Rareness.parseRareness(scanner.next()));
            diamond.setTransparency(Integer.parseInt(scanner.next()));
            return diamond;
        }
        catch (Exception e){
            throw new ParseLineException();
        }
    }
}
