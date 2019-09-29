package epam.tasks.task1.actionclass;

import java.util.ArrayList;
import java.util.List;

public class Find {
    List<Double> array;
    public Find(List<Double> newArray){
        array = new ArrayList<>(newArray.size()-1);
        this.array.addAll(newArray);
    }
    public double findMin(){
        double min = array.get(0);
        for (double item:array) {
            if (item < min){
                min = item;
            }
        }
        return min;
    }
    public double findMax(){
        double max = array.get(0);
        for (double item:array) {
            if (item > max){
                max = item;
            }
        }
        return max;
    }
}