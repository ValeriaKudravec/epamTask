package Epam.Task2.stones.stones.pearl;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.Decor;
import Epam.Task2.stones.naturalstones.Rareness;
import Epam.Task2.stones.stones.naturalstones.Diamond;

import java.util.Scanner;

public class Pearl extends Decor {
    private TypeOfPearlLocalities typeOfPearlLocalities;

    public TypeOfPearlLocalities getTypeOfPearlLocalities() {
        return typeOfPearlLocalities;
    }

    public void setTypeOfPearlLocalities(TypeOfPearlLocalities typeOfPearlLocalities) {
        this.typeOfPearlLocalities = typeOfPearlLocalities;
    }
    @Override
    public String toString(){
        StringBuilder show = new StringBuilder();
        show.append("Emerald: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
               .append(";\nType of pearl localities: ")
                .append(getTypeOfPearlLocalities());
        return show.toString();
    }
    public static boolean isPearl(String in){
        return "pearl".compareToIgnoreCase(in.split(";")[0])>0;
    }
    public static Pearl parseStringToPearl (String inputString)throws DontParseException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            Pearl pearl = new Pearl();
            scanner.next();
            pearl.setCost(Integer.parseInt(scanner.next()));
            pearl.setWeight(Integer.parseInt(scanner.next()));
            pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.parsePearlLocalities(scanner.next()));
            return pearl;
        }
        catch (Exception e){
            throw new DontParseException();
        }
    }
}
