package Epam.Task2.validation;

import Epam.Task2.necklace.models.naturalstones.Rareness;
import Epam.Task2.necklace.models.stones.*;

import java.util.Scanner;

public class Validator {
    public static boolean validate(String line) {
        try (Scanner scanner = new Scanner(line).useDelimiter(";")) {
            switch (line.split(";")[0].toLowerCase()) {
                case "diamond": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Rareness.parseRareness(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                case "emerald": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Rareness.parseRareness(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                case "ruby": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Rareness.parseRareness(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                case "pearl": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    TypeOfPearlLocalities.parsePearlLocalities(scanner.next());

                    return true;
                }
                case "syntetic diamond": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                case "syntetic emerald": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                case "syntetic ruby": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                case "amber": {
                    scanner.next();
                    Integer.parseInt(scanner.next());
                    Integer.parseInt(scanner.next());
                    Double.parseDouble(scanner.next());
                    Integer.parseInt(scanner.next());
                    return true;
                }
                default: {
                    return false;
                }
            }
        } catch (Exception e){
            return false;
        }
    }
}
