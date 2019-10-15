package Epam.Task2.necklace.models.stones;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.Decor;

import java.util.Scanner;

public class Amber extends Decor {
    private TypeOfAmber sizeType;

    public TypeOfAmber getSizeType() {
        return sizeType;
    }

    public void setSizeType(TypeOfAmber sizeType) {
        this.sizeType = sizeType;
    }
    @Override
    public String toString(){
        StringBuilder show = new StringBuilder();
        show.append("Emerald: ").append("\nCost: ")
                .append(getCost())
                .append(";\nWeight: ")
                .append(getWeight())
                .append(";\nType of pearl localities: ")
                .append(getSizeType());
        return show.toString();
    }
    public static boolean isPearl(String in){
        return "pearl".compareToIgnoreCase(in.split(";")[0])>0;
    }
    public static Amber parseStringToAmber (String inputString)throws ParseLineException {
        try(Scanner scanner = new Scanner(inputString).useDelimiter(";")) {
            Amber amber = new Amber();
            scanner.next();
            amber.setCost(Integer.parseInt(scanner.next()));
            amber.setWeight(Integer.parseInt(scanner.next()));
            amber.setSizeType(TypeOfAmber.parseTypeOfAmber(scanner.next()));
            return amber;
        }
        catch (Exception e){
            throw new ParseLineException();
        }
    }
}
