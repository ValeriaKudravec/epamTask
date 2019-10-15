package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.syntheticstones.SynteticStones;

import java.util.Scanner;

public class SynteticEmerald extends SynteticStones {
    @Override
    public String toString(){
        StringBuilder show = new StringBuilder();
        show.append("Syntetic Emerald: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nHardness: ")
                .append(getHardness())
                .append(";\nTransparency").append(getTransparency());
        return show.toString();
    }
    public static boolean isSynteticEmerald(String in){
        return "Syntetic emerald".compareToIgnoreCase(in.split(";")[0])>0;
    }
    public static SynteticEmerald parseStringToEmerald (String inputString)throws ParseLineException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter("; ")) {
            SynteticEmerald synteticEmerald = new SynteticEmerald();
            scanner.next();
            synteticEmerald.setCost(Integer.parseInt(scanner.next()));
            synteticEmerald.setWeight(Integer.parseInt(scanner.next()));
            synteticEmerald.setHardness(Double.parseDouble(scanner.next()));
            synteticEmerald.setTransparency(Integer.parseInt(scanner.next()));
            return synteticEmerald;
        }
        catch (Exception e){
            throw new ParseLineException();
        }
    }
}
