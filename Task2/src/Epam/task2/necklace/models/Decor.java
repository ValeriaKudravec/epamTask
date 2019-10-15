package Epam.task2.necklace.models;

import java.util.Comparator;

public abstract class Decor implements Comparator<Decor> {
    private int weight;
    private double cost;
    public int getWeight(){
        return this.weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public double getCost(){
        return this.cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    @Override
    public int compare(Decor a, Decor b){
        return a.weight-b.weight;
    }


}
