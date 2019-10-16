package Epam.task2.necklace.necklacefactory;

import Epam.task2.necklace.model.Decor;

import java.util.ArrayList;
import java.util.List;

public class NecklaceFactory {
   List<Decor> necklace;
   public NecklaceFactory(){
       necklace=new ArrayList<>();
   }
   public void add(Decor newStone){
       necklace.add(newStone);
   }
    public List<Decor> getNecklace(){
       return necklace;
    }
}
