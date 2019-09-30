package epam.tasks.task1.action;

import java.util.List;

public class Arithmetic {

    public double mean(List<Double> array){
        double sum = 0;
        for(int i = 0; i < array.size(); i++){
            sum+=array.get(i);
        }
        return sum/array.size();
    }
    public double sum(List<Double> array){
        double sum = 0;
        for (double item:array) {
            sum+=item;
        }
        return sum;
    }
    public double findMin(List<Double> array){
        double min = array.get(0);
        for (double item:array) {
            if (item < min){
                min = item;
            }
        }
        return min;
    }
    public double findMax(List<Double> array){
        double max = array.get(0);
        for (double item:array) {
            if (item > max){
                max = item;
            }
        }
        return max;
    }
    public void bubbleSort(List<Double> array){
        for(int index = 0; index < array.size(); index++){
            for(int secondIndex = index; secondIndex < array.size(); secondIndex++ ){
                if(array.get(index)>array.get(secondIndex)){
                    swap(array, index, secondIndex);
                }
            }
        }
    }
    private void swap(List<Double> array, int a, int b){
        double tmp = array.get(a);
        array.set(a, array.get(b));
        array.set(b, tmp);
    }

    public void quickSort(List<Double> array, int left, int right){
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
                swap (array, l++, r--);
        }
        if (left < r)
            quickSort (array,left, r);
        if (right > l)
            quickSort (array,l, right);
    }
    public void insertionSort(List<Double> array){
        for (int i = 0; i < array.size(); i++)
        {
            double key = array.get(i);
            int j = i;
            while ((j > 0) && (array.get(j - 1) > key))
            {
                swap(array,j - 1, j);
                j--;
            }
            array.set(j,key);
        }
    }
}