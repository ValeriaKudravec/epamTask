package Epam.task2.necklace.models.naturalstones;

import Epam.task2.necklace.exeption.ParseLineException;

public enum Rareness{
    RARE,
    AVERAGE,
    COMMON;
    public static Rareness parseRareness (String string)throws ParseLineException {
        switch (string.toLowerCase()){
            case "rare":{return RARE;}
            case "averange":{return AVERAGE;}
            case "common":{return COMMON;}
            default:throw new ParseLineException();
        }
    }
}
