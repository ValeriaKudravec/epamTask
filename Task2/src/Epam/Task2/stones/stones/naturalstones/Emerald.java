package Epam.Task2.stones.stones.naturalstones;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.naturalstones.NaturalStones;
import Epam.Task2.stones.naturalstones.Rareness;

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
    public static Emerald parseStringToEmerald (String inputString)throws DontParseException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            Emerald emerald = new Emerald();
            scanner.next();
            emerald.setCost(Integer.parseInt(scanner.next()));
            emerald.setWeight(Integer.parseInt(scanner.next()));
            emerald.setHardness(Double.parseDouble(scanner.next()));
            emerald.setRareness(Rareness.parseRareness(scanner.next()));
            emerald.setTransparency(Integer.parseInt(scanner.next()));
            return emerald;
        }
        catch (Exception e){
            throw new DontParseException();
        }
    }
}
