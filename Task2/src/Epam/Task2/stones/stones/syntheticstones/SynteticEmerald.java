package Epam.Task2.stones.stones.syntheticstones;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.syntheticstones.SynteticStones;

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
    public static SynteticEmerald parseStringToEmerald (String inputString)throws DontParseException {
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
            throw new DontParseException();
        }
    }
}
