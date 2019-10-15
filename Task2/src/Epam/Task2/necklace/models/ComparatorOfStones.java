package Epam.Task2.necklace.models;

import java.util.Comparator;

public  class ComparatorOfStones implements Comparator<Decor> {
    @Override
    public int compare(Decor o1, Decor o2) {
        if(o1.getWeight()==o2.getWeight()){
            return (int)(o1.getCost() - o2.getCost());
        }
        return (o1.getWeight()-o2.getWeight());
    }
}
