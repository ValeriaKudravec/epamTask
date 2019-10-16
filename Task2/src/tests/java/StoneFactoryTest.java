package tests.java;


import Epam.task2.necklace.model.Decor;
import Epam.task2.necklace.model.stones.Pearl;
import Epam.task2.necklace.model.stones.TypeOfPearlLocalities;
import Epam.task2.parser.Parser;
import Epam.task2.stonefactory.StoneFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoneFactoryTest {

    @Test
    public void isRightReturnListOfStones(){
        Pearl pearl = new Pearl();
        pearl.setCost(160);
        pearl.setWeight(750);
        pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.SEA);
        Parser parser = new Parser();
        Decor we = new StoneFactory().makeStone(parser.parseLine("Pearl;160;750;SEA"));
        System.out.println(we);
        Assert.assertEquals(pearl, new StoneFactory()
                .makeStone(parser.parseLine("Pearl;160;750;SEA")));
    }
}
