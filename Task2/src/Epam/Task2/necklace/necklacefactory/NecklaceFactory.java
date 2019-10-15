package Epam.Task2.necklace.necklacefactory;

import Epam.Task2.necklace.exeption.ParseLineException;
import Epam.Task2.necklace.models.ComparatorOfStones;
import Epam.Task2.necklace.models.Decor;
import Epam.Task2.necklace.models.stones.Amber;
import Epam.Task2.necklace.models.stones.Diamond;
import Epam.Task2.necklace.models.stones.Emerald;
import Epam.Task2.necklace.models.stones.Ruby;
import Epam.Task2.necklace.models.stones.Pearl;
import Epam.Task2.necklace.models.stones.SynteticDiamond;
import Epam.Task2.necklace.models.stones.SynteticEmerald;
import Epam.Task2.necklace.models.stones.SynteticRuby;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NecklaceFactory {
   List<Decor> necklace;
   public NecklaceFactory(){
       necklace=new ArrayList<>();
   }
   public void add(Decor newStone){
       necklace.add(newStone);
   }
    public void sort(){
        if(necklace!=null){necklace.sort(new ComparatorOfStones());}
    }
    public List<Decor> filter(){
        return necklace.stream().filter(item->(item.getCost())>70&&(item.getCost()<300)
                &&(item.getWeight()<300&&item.getWeight()>150)).collect(Collectors.toList());
    }
    public List<Decor> getNecklace(){
       return necklace;
    }
}
