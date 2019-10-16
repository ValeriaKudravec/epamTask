package Epam.task2.necklace.necklacefactory;

import Epam.task2.necklace.stonecomparator.ComparatorOfStones;

public class NecklaceSorter {
    public void sort(NecklaceFactory necklace){
        necklace.getNecklace().sort(new ComparatorOfStones());
    }
}
