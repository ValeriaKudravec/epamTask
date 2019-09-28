package epam.task1.actionClass;

import java.util.ArrayList;
import java.util.List;

public class Find {
    List<Double> array;
    public Find(List<Double> newArray){
        array = new ArrayList<>(newArray.size()-1);
        this.array.addAll(newArray);
    }
    public double findMin(double element){
        double min = array.get(0);
        for (double item:array) {
            if (item < min){
                min = item;
            }
        }
        return min;
    }
    public double findMax(double element){
        double max = array.get(0);
        for (double item:array) {
            if (item > max){
                max = item;
            }
        }
        return max;
    }
}