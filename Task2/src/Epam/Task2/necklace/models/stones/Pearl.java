package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.Decor;

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
        show.append("Pearl: ").append("\nCost: ")
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
    public static Pearl parseStringToPearl (String inputString)throws ParseLineException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            Pearl pearl = new Pearl();
            scanner.next();
            pearl.setCost(Integer.parseInt(scanner.next()));
            pearl.setWeight(Integer.parseInt(scanner.next()));
            pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.parsePearlLocalities(scanner.next()));
            return pearl;
        }
        catch (Exception e){
            throw new ParseLineException();
        }
    }
}
