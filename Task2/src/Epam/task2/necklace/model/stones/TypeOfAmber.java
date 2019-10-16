package Epam.task2.necklace.model.stones;

import Epam.task2.necklace.exeption.ParseLineException;

public enum TypeOfAmber {
    SMALL,
    MEDIUM,
    BIG;
    public static TypeOfAmber parseTypeOfAmber (String string)throws ParseLineException {
        switch (string.toLowerCase()){
            case "small":{return SMALL;}
            case "medium":{return MEDIUM;}
            case "big":{return BIG;}
            default:throw new ParseLineException();
        }
    }
}

