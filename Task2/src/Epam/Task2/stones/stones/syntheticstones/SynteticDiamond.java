package Epam.Task2.stones.stones.syntheticstones;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.syntheticstones.SynteticStones;

import java.util.Scanner;

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
    public static SynteticDiamond parseStringToSynteticDiamond (String inputString)throws DontParseException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            SynteticDiamond synteticDiamond = new SynteticDiamond();
            scanner.next();
            synteticDiamond.setCost(Integer.parseInt(scanner.next()));
            synteticDiamond.setWeight(Integer.parseInt(scanner.next()));
            synteticDiamond.setHardness(Double.parseDouble(scanner.next()));
            synteticDiamond.setTransparency(Integer.parseInt(scanner.next()));
            return synteticDiamond;
        }
        catch (Exception e){
            throw new DontParseException();
        }
    }
}
