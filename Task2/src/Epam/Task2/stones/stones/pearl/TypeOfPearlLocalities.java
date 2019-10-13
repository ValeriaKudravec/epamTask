package Epam.Task2.stones.stones.pearl;

import Epam.Task2.exeption.DontParseException;

public enum TypeOfPearlLocalities {
    SEA,
    RIVER;
    public static TypeOfPearlLocalities parsePearlLocalities (String string)throws DontParseException {
        switch (string.toLowerCase()){
            case "sea":{return SEA;}
            case "river":{return RIVER;}
            default:throw new DontParseException();
        }
    }
}
