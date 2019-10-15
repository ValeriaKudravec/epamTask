package Epam.task2.necklace.necklacefactory;

import Epam.task2.necklace.models.ComparatorOfStones;
import Epam.task2.necklace.models.Decor;

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
