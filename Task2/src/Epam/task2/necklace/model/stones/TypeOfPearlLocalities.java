package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.exeption.ParseLineException;

public enum TypeOfPearlLocalities {
    SEA,
    RIVER;
    public static TypeOfPearlLocalities parsePearlLocalities (String string)throws ParseLineException {
        switch (string.toLowerCase()){
            case "sea":{
                return SEA;}
            case "river":{return RIVER;}
            default:throw new ParseLineException();
        }
    }
}
