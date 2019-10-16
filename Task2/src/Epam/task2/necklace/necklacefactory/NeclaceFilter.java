package Epam.task2.necklace.necklacefactory;

import Epam.task2.necklace.model.Decor;

import java.util.List;
import java.util.stream.Collectors;

public class NeclaceFilter {
    public List<Decor> filterByCost(NecklaceFactory necklace, int minCost, int maxCost){
        return necklace.getNecklace().stream().
                filter(item->(item.getCost())>minCost&&(item.getCost()<maxCost))
                .collect(Collectors.toList());
    }
    public List<Decor> filterByCost(NecklaceFactory necklace, int maxCost){
        return necklace.getNecklace().stream().
                filter(item->(item.getCost()<maxCost))
                .collect(Collectors.toList());
    }
    public List<Decor> filterByWeight(NecklaceFactory necklace, int minWeight, int maxWeight){
        return necklace.getNecklace().stream().
                filter(item->(item.getWeight())>minWeight&&(item.getWeight()<maxWeight))
                .collect(Collectors.toList());
    }
    public List<Decor> filterByWeight(NecklaceFactory necklace, int maxWeight){
        return necklace.getNecklace().stream().
                filter(item->(item.getWeight()<maxWeight))
                .collect(Collectors.toList());
    }
    public List<Decor>
    filter(NecklaceFactory necklace, int minCost, int maxCost, int minWeight, int maxWeight){
        return necklace.getNecklace().stream().
                filter(item->(item.getCost()>minCost&&item.getCost()<maxCost)
                        &&item.getWeight()>minWeight&&(item.getWeight()<maxWeight))
                .collect(Collectors.toList());
    }
}
