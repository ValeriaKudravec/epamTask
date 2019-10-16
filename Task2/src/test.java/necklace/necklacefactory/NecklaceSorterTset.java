package test.java.necklace.necklacefactory;

import Epam.task2.necklace.model.Decor;
import Epam.task2.necklace.necklacefactory.NecklaceFactory;
import Epam.task2.necklace.necklacefactory.NecklaceSorter;
import Epam.task2.parser.Parser;
import Epam.task2.necklace.stonefactory.StoneFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NecklaceSorterTset {
    @Test
    public void isRightSort(){
        List<Decor> decorList = new ArrayList<>();
        StoneFactory stoneFactory = new StoneFactory();
        NecklaceFactory necklaceFactory = new NecklaceFactory();
        Parser parser = new Parser();
        Decor diamont = stoneFactory.makeStone(parser.parseLine("Diamond;300;150;1.3;RARE;97;"));
        decorList.add(diamont);
        Decor pearl = stoneFactory.makeStone(parser.parseLine("Pearl;120;250;SEA;"));
        decorList.add(pearl);
        necklaceFactory.add(pearl);
        necklaceFactory.add(diamont);
        NecklaceSorter necklaceSorter = new NecklaceSorter();
        necklaceSorter.sort(necklaceFactory);
        Assert.assertEquals(decorList, necklaceFactory.getNecklace());
    }
}
