package Epam.Task2.necklacefactory;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.Decor;
import Epam.Task2.stones.stones.amber.Amber;
import Epam.Task2.stones.stones.naturalstones.Diamond;
import Epam.Task2.stones.stones.naturalstones.Emerald;
import Epam.Task2.stones.stones.naturalstones.Ruby;
import Epam.Task2.stones.stones.pearl.Pearl;
import Epam.Task2.stones.stones.syntheticstones.SynteticDiamond;
import Epam.Task2.stones.stones.syntheticstones.SynteticEmerald;
import Epam.Task2.stones.stones.syntheticstones.SynteticRuby;

import java.util.ArrayList;
import java.util.List;

public class NecklaceFactory {
    public List<Decor> makeListOfStones(List<String> stonesString){
        List<Decor> listOfStones = new ArrayList<>();
        try {
            for (int i = 0; i < stonesString.size(); i++) {
                switch (stonesString.get(i).split("'")[0].toLowerCase()) {
                    case "diamond": {
                        Diamond diamond = Diamond.parseStringToDiamond(stonesString.get(i));
                        listOfStones.add(diamond);
                        break;
                    }
                    case "emerald": {
                        Emerald emerald = Emerald.parseStringToEmerald(stonesString.get(i));
                        listOfStones.add(emerald);
                        break;
                    }
                    case "ruby": {
                        Ruby ruby = Ruby.parseStringToRuby(stonesString.get(i));
                        listOfStones.add(ruby);
                        break;
                    }
                    case "pearl": {
                        Pearl pearl = Pearl.parseStringToPearl(stonesString.get(i));
                        listOfStones.add(pearl);
                        break;
                    }
                    case "syntetic eiamond": {
                        SynteticDiamond synteticDiamond = SynteticDiamond.
                                parseStringToSynteticDiamond(stonesString.get(i));
                        listOfStones.add(synteticDiamond);
                        break;
                    }
                    case "syntetic emerald": {
                        SynteticEmerald synteticEmerald = SynteticEmerald.
                                parseStringToEmerald(stonesString.get(i));
                        listOfStones.add(synteticEmerald);
                        break;
                    }
                    case "syntetic ruby": {
                        SynteticRuby synteticRuby = SynteticRuby.
                                parseStringToSynteticRuby(stonesString.get(i));
                        listOfStones.add(synteticRuby);
                        break;
                    }
                    case "amber": {
                        Amber amber = Amber.parseStringToAmber(stonesString.get(i));
                        listOfStones.add(amber);
                        break;
                    }
                    default: {
                        break;
                    }
                }
            }

        }catch (DontParseException e){
                System.out.println("You input error information ");
            }
        return listOfStones;
    }
}
