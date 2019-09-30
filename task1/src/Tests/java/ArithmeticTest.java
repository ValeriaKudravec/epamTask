package Tests.java;

import epam.tasks.task1.action.Arithmetic;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticTest {
    private List<Double> arr;
    private Arithmetic arithmetic;
   @BeforeMethod
   public void inicial(){
       arithmetic = new Arithmetic();
       arr = new ArrayList<>();
       for(int i = 1;i < 5; i++){
           arr.add((double)i);
       }
   }

    @Test
    public void isRightSum(){
        Assert.assertEquals(10, arithmetic.sum(arr));
    }
    @Test
    public void isRightMean(){
        Assert.assertEquals(2.5, arithmetic.mean(arr));
    }

    @Test
    public void isRightFindMax(){
        Assert.assertEquals(4, arithmetic.findMax(arr));
    }
    @Test
    public void isRightFindMin(){
        Assert.assertEquals(1, arithmetic.findMin(arr));
    }
}