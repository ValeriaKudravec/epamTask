package tests.java;


import Epam.task2.necklace.models.Decor;
import Epam.task2.necklace.models.stones.Pearl;
import Epam.task2.necklace.models.stones.TypeOfPearlLocalities;
import Epam.task2.stoneFactory.StoneFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoneFactoryTest {

    @Test
    public void isRightReturnListOfStones(){
        Pearl pearl = new Pearl();
        pearl.setCost(160);
        pearl.setWeight(750);
        pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.SEA);
        Decor we = new StoneFactory().makeStone("Pearl;160;750;SEA");
        System.out.println(we);
        Assert.assertEquals(pearl, new StoneFactory().makeStone("Pearl;160;750;SEA"));
    }
}
