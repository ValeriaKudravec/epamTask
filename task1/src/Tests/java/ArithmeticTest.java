package Tests.java;

import epam.tasks.task1.action.Arithmetic;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticTest {
    List<Double> arr;
    Arithmetic arithmetic;
   @BeforeSuite
   private void inicial(){
       arithmetic = new Arithmetic();
   }

    @Test
    public void isRightSum(){
        List<Double> arr = new ArrayList<>();
        for(int i = 1;i < 5; i++){
            arr.add((double)i);
        }
        Assert.assertEquals(10, arithmetic.sum(arr));
    }
    @Test
    public void isRightMean(){
        List<Double> arr = new ArrayList<>();
        for(int i = 1;i < 5; i++){
            arr.add((double)i);
        }
        Assert.assertEquals(2.5, arithmetic.mean(arr));
    }

    @Test
    public void isRightFindMax(){
        List<Double> arr = new ArrayList<>();
        for(int i = 1;i < 5; i++){
            arr.add((double)i);
        }
        Assert.assertEquals(4, arithmetic.findMax(arr));
    }
    @Test
    public void isRightFindMin(){
        List<Double> arr = new ArrayList<>();
        for(int i = 1;i < 5; i++){
            arr.add((double)i);
        }
        Assert.assertEquals(1, arithmetic.findMin(arr));
    }
}