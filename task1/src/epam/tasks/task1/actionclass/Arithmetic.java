package epam.tasks.task1.actionclass;

import java.util.ArrayList;
import java.util.List;

public class Arithmetic {
    List<Double> array;
    public Arithmetic(List<Double> newArray){
        array = new ArrayList<>(newArray.size()-1);
        this.array.addAll(newArray);
    }
    public double mean(){
        double sum = 0;
        for(int i = 0; i < array.size(); i++){
            sum+=array.get(i);
        }
        return sum/array.size();
    }
    public double sum(){
        double sum = 0;
        for (double item:array) {
            sum+=item;
        }
        return sum;
    }
}