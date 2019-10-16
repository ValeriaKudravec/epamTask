package test.java.necklace.parser;

import Epam.task2.parser.Parser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ParserTest {
    @Test
    public void isRightParse(){
        String[] array = {"Pearl","160","750","SEA"};
        Parser parser = new Parser();
        Assert.assertEquals(array,parser.parseLine("Pearl;160;750;SEA;"));
    }
}
