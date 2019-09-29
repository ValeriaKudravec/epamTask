package Tests.java;

import epam.tasks.task1.actionclass.Arithmetic;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArithmeticClass {
    List<Double> arr;
    Arithmetic arithmetic;
    public TestArithmeticClass(){
        List<Double> arr = new ArrayList<>();
        for(int i = 1;i < 5; i++){
            arr.add((double)i);
        }
        arithmetic = new Arithmetic(arr);
    }
    @Test
    public void isRightSum(){
       Assert.assertEquals(10, arithmetic.sum());
    }
    @Test
    public void isRightMean(){
        Assert.assertEquals(2.5, arithmetic.mean());
    }
}
