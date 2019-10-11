package Epam.Task2.stones.naturalstones;

import Epam.Task2.exeption.DontParseException;

public enum Rareness{
    RARE,
    AVERAGE,
    COMMON;
    public static Rareness parseRareness (String string)throws DontParseException {
        switch (string.toLowerCase()){
            case "rare":{return RARE;}
            case "averange":{return AVERAGE;}
            case "common":{return COMMON;}
            default:throw new DontParseException();
        }
    }
}
