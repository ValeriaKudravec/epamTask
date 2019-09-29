package Tests.java;


import epam.tasks.task1.actionclass.Find;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class TestFindClass {
    List<Double> arr;
    Find find;
    public TestFindClass(){
        List<Double> arr = new ArrayList<>();
        for(int i = 1;i < 5; i++){
            arr.add((double)i);
        }
        find = new Find(arr);
    }
    @Test
    public void isRightFindMax(){
        Assert.assertEquals(4, find.findMax());
    }
    @Test
    public void isRightFindMin(){
        Assert.assertEquals(1, find.findMin());
    }
}
