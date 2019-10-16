package tests.java;


import Epam.task2.necklace.model.Decor;
import Epam.task2.necklace.model.naturalstones.Rareness;
import Epam.task2.necklace.model.stones.*;
import Epam.task2.parser.Parser;
import Epam.task2.stonefactory.StoneFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StoneFactoryTest {

    @Test
    public void isRightReturnPearl(){
        Pearl pearl = new Pearl();
        pearl.setCost(160);
        pearl.setWeight(750);
        pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.SEA);
        Parser parser = new Parser();
        Assert.assertEquals(pearl, new StoneFactory()
                .makeStone(parser.parseLine("Pearl;160;750;SEA")));
    }
    @Test
    public void isRightReturnAmber(){
        Amber amber = new Amber();
        amber.setCost(160);
        amber.setWeight(750);
        amber.setSizeType(TypeOfAmber.BIG);
        Parser parser = new Parser();
        Assert.assertEquals(amber, new StoneFactory()
                .makeStone(parser.parseLine("amber;160;750;BIG")));
    }
    @Test
    public void isDontRightReturnDiamont(){
        Diamond diamond = new Diamond();
        diamond.setCost(160);
        diamond.setWeight(750);
        diamond.setHardness(8.3);
        diamond.setRareness(Rareness.RARE);
        diamond.setTransparency(87);
        Parser parser = new Parser();
        Assert.assertEquals(diamond, new StoneFactory()
                .makeStone(parser.parseLine("Diamond;160;750;8.3;RARE;87;")));
    }
    @Test
    public void isDontRightReturnEmerald(){
        Emerald emerald = new Emerald();
        emerald.setCost(160);
        emerald.setWeight(750);
        emerald.setHardness(8.3);
        emerald.setRareness(Rareness.RARE);
        emerald.setTransparency(87);
        Parser parser = new Parser();
        Assert.assertEquals(emerald, new StoneFactory()
                .makeStone(parser.parseLine("Emerald;160;750;8.3;RARE;87;")));
    }
    @Test
    public void isDontRightReturnRuby(){
        Ruby ruby = new Ruby();
        ruby.setCost(160);
        ruby.setWeight(750);
        ruby.setHardness(8.3);
        ruby.setRareness(Rareness.RARE);
        ruby.setTransparency(87);
        Parser parser = new Parser();
        Assert.assertEquals(ruby, new StoneFactory()
                .makeStone(parser.parseLine("ruby;160;750;8.3;RARE;87;")));
    }
    @Test
    public void isDontRightReturnSynteticDiamond(){
        SynteticDiamond synteticStone = new SynteticDiamond();
        synteticStone.setCost(160);
        synteticStone.setWeight(750);
        synteticStone.setHardness(8.3);
        synteticStone.setTransparency(87);
        Parser parser = new Parser();
        Assert.assertEquals(synteticStone, new StoneFactory()
                .makeStone(parser.parseLine("syntetic diamond;160;750;8.3;87;")));
    }
    @Test
    public void isDontRightReturnSynteticEmerald(){
        SynteticEmerald synteticStone = new SynteticEmerald();
        synteticStone.setCost(160);
        synteticStone.setWeight(750);
        synteticStone.setHardness(8.3);
        synteticStone.setTransparency(87);
        Parser parser = new Parser();
        Assert.assertEquals(synteticStone, new StoneFactory()
                .makeStone(parser.parseLine("syntetic emerald;160;750;8.3;87;")));
    }
    @Test
    public void isDontRightReturnSynteticRuby(){
        SynteticRuby synteticStone = new SynteticRuby();
        synteticStone.setCost(160);
        synteticStone.setWeight(750);
        synteticStone.setHardness(8.3);
        synteticStone.setTransparency(87);
        Parser parser = new Parser();
        Assert.assertEquals(synteticStone, new StoneFactory()
                .makeStone(parser.parseLine("syntetic ruby;160;750;8.3;87;")));
    }
}
