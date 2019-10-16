package test.java.necklace.necklacefactory;

import Epam.task2.necklace.model.Decor;
import Epam.task2.necklace.necklacefactory.NecklaceFactory;
import Epam.task2.parser.Parser;
import Epam.task2.necklace.stonefactory.StoneFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NecklaceFactoryTest {
    @Test
    public void isRigttAddstones(){
        NecklaceFactory necklaceFactory = new NecklaceFactory();
        StoneFactory stoneFactory = new StoneFactory();
        Parser parser = new Parser();
        Decor pearl = stoneFactory.makeStone(parser.parseLine("Pearl;160;750;SEA;"));
        List<Decor> decorList = new ArrayList<>();
        decorList.add(pearl);
        necklaceFactory.add(pearl);
        Assert.assertEquals(decorList,necklaceFactory.getNecklace());
    }
}
