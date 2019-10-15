package Epam.Task2.stoneFactory;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.Decor;
import Epam.Task2.necklace.models.naturalstones.Rareness;
import Epam.Task2.necklace.models.stones.*;
import Epam.Task2.validation.Validator;

import java.util.Scanner;

public class StoneFactory {
    public Decor makeStone(String resourseLine) {
        try(Scanner scanner = new Scanner(resourseLine).useDelimiter(";")) {
            switch (resourseLine.split(";")[0].toLowerCase()) {
                case "diamond": {
                    Diamond diamond = new Diamond();
                    scanner.next();
                    diamond.setCost(Integer.parseInt(scanner.next()));
                    diamond.setWeight(Integer.parseInt(scanner.next()));
                    diamond.setHardness(Double.parseDouble(scanner.next()));
                    diamond.setRareness(Rareness.parseRareness(scanner.next()));
                    diamond.setTransparency(Integer.parseInt(scanner.next()));
                    return diamond;
                }
                case "emerald": {
                    Emerald emerald = new Emerald();
                    scanner.next();
                    emerald.setCost(Integer.parseInt(scanner.next()));
                    emerald.setWeight(Integer.parseInt(scanner.next()));
                    emerald.setHardness(Double.parseDouble(scanner.next()));
                    emerald.setRareness(Rareness.parseRareness(scanner.next()));
                    emerald.setTransparency(Integer.parseInt(scanner.next()));
                    return emerald;
                }
                case "ruby": {
                    Ruby ruby = new Ruby();
                    scanner.next();
                    ruby.setCost(Integer.parseInt(scanner.next()));
                    ruby.setWeight(Integer.parseInt(scanner.next()));
                    ruby.setHardness(Double.parseDouble(scanner.next()));
                    ruby.setRareness(Rareness.parseRareness(scanner.next()));
                    ruby.setTransparency(Integer.parseInt(scanner.next()));
                    return ruby;
                }
                case "pearl": {
                    Pearl pearl = new Pearl();
                    scanner.next();
                    pearl.setCost(Integer.parseInt(scanner.next()));
                    pearl.setWeight(Integer.parseInt(scanner.next()));
                    pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.
                            parsePearlLocalities(scanner.next()));
                    return pearl;
                }
                case "syntetic diamond": {
                    SynteticDiamond synteticDiamond = new SynteticDiamond();
                    scanner.next();
                    synteticDiamond.setCost(Integer.parseInt(scanner.next()));
                    synteticDiamond.setWeight(Integer.parseInt(scanner.next()));
                    synteticDiamond.setHardness(Double.parseDouble(scanner.next()));
                    synteticDiamond.setTransparency(Integer.parseInt(scanner.next()));
                    return synteticDiamond;
                }
                case "syntetic emerald": {
                    SynteticEmerald synteticEmerald = new SynteticEmerald();
                    scanner.next();
                    synteticEmerald.setCost(Integer.parseInt(scanner.next()));
                    synteticEmerald.setWeight(Integer.parseInt(scanner.next()));
                    synteticEmerald.setHardness(Double.parseDouble(scanner.next()));
                    synteticEmerald.setTransparency(Integer.parseInt(scanner.next()));
                    return synteticEmerald;
                }
                case "syntetic ruby": {
                    SynteticRuby synteticRuby = new SynteticRuby();
                    scanner.next();
                    synteticRuby.setCost(Integer.parseInt(scanner.next()));
                    synteticRuby.setWeight(Integer.parseInt(scanner.next()));
                    synteticRuby.setHardness(Double.parseDouble(scanner.next()));
                    synteticRuby.setTransparency(Integer.parseInt(scanner.next()));
                    return synteticRuby;
                }
                case "amber": {
                    SynteticRuby synteticRuby = new SynteticRuby();
                    scanner.next();
                    synteticRuby.setCost(Integer.parseInt(scanner.next()));
                    synteticRuby.setWeight(Integer.parseInt(scanner.next()));
                    synteticRuby.setHardness(Double.parseDouble(scanner.next()));
                    synteticRuby.setTransparency(Integer.parseInt(scanner.next()));
                    return synteticRuby;
                }
                default: {
                    break;
                }
            }
            return null;
        }
        catch (Exception e){
            throw new ParseLineException();
        }
    }
}
