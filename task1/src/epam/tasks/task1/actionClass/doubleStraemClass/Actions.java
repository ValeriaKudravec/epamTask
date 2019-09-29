package epam.tasks.task1.actionClass.doubleStraemClass;

import java.util.*;
import java.util.stream.DoubleStream;

public class Actions {
    double[] array;
    public Actions(List<Double> newArray){
        array = new double[newArray.size()];
        for(int i = 0; i < newArray.size(); i++){
            array[i] = newArray.get(i);
        }
    }
    public double[] sort(){
       return  DoubleStream.of(array).sorted().toArray();
    }
    public double max(){
        return DoubleStream.of(array).max().getAsDouble();
    }
    public double min(){
        return DoubleStream.of(array).min().getAsDouble();
    }
    public double sum(){
       return DoubleStream.of(array).sum();
    }
    public double[] filter(double a){
       return DoubleStream.of(array).filter(item->item>a).toArray();
    }
    public List<Double> gerArray(){
        List<Double> arr = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            arr.add(array[i]);
        }
        return arr;
    }
}
