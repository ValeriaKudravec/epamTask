package task1;

import task1.actionClass.Sorts;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Double> array = new ArrayList<>();
        for(int i = 5; i >= 0; i--){
            array.add(1.0*i);
        }
        Sorts sorts = new Sorts(array);
        sorts.insertionSort();
        sorts.gerArray().forEach(item->System.out.print(item + " "));
    }
}
