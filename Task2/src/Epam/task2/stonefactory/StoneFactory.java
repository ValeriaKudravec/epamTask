package Epam.task2.stonefactory;

import Epam.task2.necklace.exeption.ParseLineException;
import Epam.task2.necklace.model.Decor;
import Epam.task2.necklace.model.naturalstones.Rareness;
import Epam.task2.necklace.model.stones.*;

public class StoneFactory {
    public Decor makeStone(String[] resourseParseLine) {
        try {
            switch (resourseParseLine[0].toLowerCase()) {
                case "diamond": {
                    Diamond diamond = new Diamond();
                    diamond.setCost(Integer.parseInt(resourseParseLine[1]));
                    diamond.setWeight(Integer.parseInt(resourseParseLine[2]));
                    diamond.setHardness(Double.parseDouble(resourseParseLine[3]));
                    diamond.setRareness(Rareness.parseRareness(resourseParseLine[4]));
                    diamond.setTransparency(Integer.parseInt(resourseParseLine[5]));
                    return diamond;
                }
                case "emerald": {
                    Emerald emerald = new Emerald();
                    emerald.setCost(Integer.parseInt(resourseParseLine[1]));
                    emerald.setWeight(Integer.parseInt(resourseParseLine[2]));
                    emerald.setHardness(Double.parseDouble(resourseParseLine[3]));
                    emerald.setRareness(Rareness.parseRareness(resourseParseLine[4]));
                    emerald.setTransparency(Integer.parseInt(resourseParseLine[5]));
                    return emerald;
                }
                case "ruby": {
                    Ruby ruby = new Ruby();
                    ruby.setCost(Integer.parseInt(resourseParseLine[1]));
                    ruby.setWeight(Integer.parseInt(resourseParseLine[2]));
                    ruby.setHardness(Double.parseDouble(resourseParseLine[3]));
                    ruby.setRareness(Rareness.parseRareness(resourseParseLine[4]));
                    ruby.setTransparency(Integer.parseInt(resourseParseLine[5]));
                    return ruby;
                }
                case "pearl": {
                    Pearl pearl = new Pearl();
                    pearl.setCost(Integer.parseInt(resourseParseLine[1]));
                    pearl.setWeight(Integer.parseInt(resourseParseLine[2]));
                    pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.
                            parsePearlLocalities(resourseParseLine[3]));
                    return pearl;
                }
                case "syntetic diamond": {
                    SynteticDiamond synteticDiamond = new SynteticDiamond();
                    synteticDiamond.setCost(Integer.parseInt(resourseParseLine[1]));
                    synteticDiamond.setWeight(Integer.parseInt(resourseParseLine[2]));
                    synteticDiamond.setHardness(Double.parseDouble(resourseParseLine[3]));
                    synteticDiamond.setTransparency(Integer.parseInt(resourseParseLine[4]));
                    return synteticDiamond;
                }
                case "syntetic emerald": {
                    SynteticEmerald synteticEmerald = new SynteticEmerald();
                    synteticEmerald.setCost(Integer.parseInt(resourseParseLine[1]));
                    synteticEmerald.setWeight(Integer.parseInt(resourseParseLine[2]));
                    synteticEmerald.setHardness(Double.parseDouble(resourseParseLine[3]));
                    synteticEmerald.setTransparency(Integer.parseInt(resourseParseLine[4]));
                    return synteticEmerald;
                }
                case "syntetic ruby": {
                    SynteticRuby synteticRuby = new SynteticRuby();
                    synteticRuby.setCost(Integer.parseInt(resourseParseLine[1]));
                    synteticRuby.setWeight(Integer.parseInt(resourseParseLine[2]));
                    synteticRuby.setHardness(Double.parseDouble(resourseParseLine[3]));
                    synteticRuby.setTransparency(Integer.parseInt(resourseParseLine[4]));
                    return synteticRuby;
                }
                case "amber": {
                    Amber amber = new Amber();
                    amber.setCost(Integer.parseInt(resourseParseLine[1]));
                    amber.setWeight(Integer.parseInt(resourseParseLine[2]));
                    amber.setSizeType(TypeOfAmber.parseTypeOfAmber(resourseParseLine[3]));
                    return amber;
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
