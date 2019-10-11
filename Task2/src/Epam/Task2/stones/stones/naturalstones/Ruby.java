package Epam.Task2.stones.stones.naturalstones;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.naturalstones.NaturalStones;
import Epam.Task2.stones.naturalstones.Rareness;

import java.util.Scanner;

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
    public static Ruby parseStringToRuby (String inputString)throws DontParseException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            Ruby ruby = new Ruby();
            scanner.next();
            ruby.setCost(Integer.parseInt(scanner.next()));
            ruby.setWeight(Integer.parseInt(scanner.next()));
            ruby.setHardness(Double.parseDouble(scanner.next()));
            ruby.setRareness(Rareness.parseRareness(scanner.next()));
            ruby.setTransparency(Integer.parseInt(scanner.next()));
            return ruby;
        }
        catch (Exception e){
            throw new DontParseException();
        }
    }
}
