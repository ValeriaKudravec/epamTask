package task1.actionClass;

import java.util.ArrayList;
import java.util.List;

public class Sorts {
    List<Double> array;
    public Sorts(List<Double> newArray){
        array = new ArrayList<>(newArray.size()-1);
        this.array.addAll(newArray);
    }
    public void bubbleSort(){
        for(int index = 0; index < array.size(); index++){
            for(int secondIndex = index; secondIndex < array.size(); secondIndex++ ){
                if(array.get(index)>array.get(secondIndex)){
                    swap(index, secondIndex);
                }
            }
        }
    }
    private void swap(int a, int b){
        double tmp = array.get(a);
       array.set(a, array.get(b));
       array.set(b, tmp);
    }
    public List<Double> gerArray(){
        return array;
    }
    public void quickSort(int left, int right){
        int l = left;
        int r = right;
        double middle = array.get((l+r)/2);
        while (l <= r)
        {
            while (array.get(l) < middle)
                l++;
            while (array.get(r) > middle)
                r--;
            if (l <= r)
                swap (l++, r--);
        }
        if (left < r)
            quickSort (left, r);
        if (right > l)
            quickSort (l, right);
    }
    public void insertionSort(){
        for (int i = 0; i < array.size(); i++)
        {
            double key = array.get(i);
            int j = i;
            while ((j > 0) && (array.get(j - 1) > key))
            {
                swap(j - 1, j);
                j--;
            }
            array.set(j,key);
        }
    }
}
