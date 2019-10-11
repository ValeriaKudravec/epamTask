package Epam.Task2.stones.stones.amber;

import Epam.Task2.exeption.DontParseException;
import Epam.Task2.stones.naturalstones.Rareness;

public enum TypeOfAmber {
    SMALL,
    MEDIUM,
    BIG;
    public static TypeOfAmber parseTypeOfAmber (String string)throws DontParseException {
        switch (string.toLowerCase()){
            case "small":{return SMALL;}
            case "medium":{return MEDIUM;}
            case "big":{return BIG;}
            default:throw new DontParseException();
        }
    }
}

