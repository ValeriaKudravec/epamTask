package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.syntheticstones.SynteticStones;

import java.util.Scanner;

public class SynteticRuby extends SynteticStones {
    @Override
    public String toString(){
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
    public static boolean isSynteticRuby(String in){
        return "Syntetic ruby".compareToIgnoreCase(in.split(";")[0])>0;
    }
    public static SynteticRuby parseStringToSynteticRuby (String inputString)throws ParseLineException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter("; ")) {
            SynteticRuby synteticRuby = new SynteticRuby();
            scanner.next();
            synteticRuby.setCost(Integer.parseInt(scanner.next()));
            synteticRuby.setWeight(Integer.parseInt(scanner.next()));
            synteticRuby.setHardness(Double.parseDouble(scanner.next()));
            synteticRuby.setTransparency(Integer.parseInt(scanner.next()));
            return synteticRuby;
        }
        catch (Exception e){
            throw new ParseLineException();
        }
    }
}
