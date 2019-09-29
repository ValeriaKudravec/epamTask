package Tests.java;

import epam.tasks.task1.validation.Validator;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestValidatorClass {
    Validator validator = new Validator();
    @Test
    public void isRightLine(){
        Assert.assertEquals(true, validator.validate("1.2 2.2 3.3 4.4 5.5 6.6"));
    }
    @Test
    public void isErrorLine(){
        Assert.assertEquals(false, validator.validate("1.d2 2.2 3.z3 4.a4 5.5 6.m6"));
    }
}
