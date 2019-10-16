package Epam.task2.necklace.model;

import java.util.Comparator;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Decor)) return false;
        Decor decor = (Decor) o;
        return getWeight() == decor.getWeight() &&
                Double.compare(decor.getCost(), getCost()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getCost());
    }
}
