package epam.tasks.task1.actionClass.doubleStraemClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class Actions {
    double[] array;
    public Actions(List<Double> newArray){
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
    public double[] asjdn(double a){
       return DoubleStream.of(array).filter(item->item>a).toArray();
    }
}
