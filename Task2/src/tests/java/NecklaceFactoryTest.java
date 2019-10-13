package tests.java;

import Epam.Task2.necklacefactory.NecklaceFactory;
import Epam.Task2.stones.Decor;
import Epam.Task2.stones.naturalstones.NaturalStones;
import Epam.Task2.stones.stones.pearl.Pearl;
import Epam.Task2.stones.stones.pearl.TypeOfPearlLocalities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NecklaceFactoryTest {

    public List<String> list;
    public List<Decor> listOfStones;
    @BeforeMethod
    public void inicialize(){
        List<String> list = new ArrayList<>();
        list.add("Pearl;160;750;SEA;");
        list.add("Pearl;120;250;SEA;");
        list.add("Emergfnekrv;3ac;140;1.4;COMMON;98;");
        list.add("Diamond;300;150;1.3;RARER;97;");
        this.list = list;
        List<Decor> decorList = new ArrayList<>();
        Pearl pearl = new Pearl();
        pearl.setCost(160);
        pearl.setWeight(750);
        pearl.setTypeOfPearlLocalities(TypeOfPearlLocalities.SEA);
        Pearl pearl1 = new Pearl();
        pearl1.setCost(120);
        pearl1.setWeight(250);
        pearl1.setTypeOfPearlLocalities(TypeOfPearlLocalities.SEA);
        decorList.add(pearl);
        decorList.add(pearl1);
        this.listOfStones = decorList;

    }
    @Test
    public void isRightReturnListOfStones(){
        for(int i = 0; i < listOfStones.size(); i++){
            Assert.assertEquals(listOfStones.get(i), new NecklaceFactory().makeListOfStones(list) );
        }
    }
}
