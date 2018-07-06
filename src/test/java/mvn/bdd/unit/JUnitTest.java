package mvn.bdd.unit;

import mvn.bdd.unit.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JUnitTest {

    @Test
    public void intsOneToTwenty(){
        List<Integer> ints = new ArrayList();
        for(int i=1; i <=20; i++) {
            ints.add(i);
        }

        String expectedResult = "1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17 fizz 19 buzz";
        String actualResult = FizzBuzz.processInts(ints);
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void intsTwentyToOne(){
        List<Integer> ints = new ArrayList();
        for(int i=20; i >= 1; i--) {
            ints.add(i);
        }

        String expectedResult = "buzz 19 fizz 17 16 fizzbuzz 14 13 fizz 11 buzz fizz 8 7 fizz buzz 4 fizz 2 1";
        String actualResult = FizzBuzz.processInts(ints);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void listWithAllMultiples(){
        List<Integer> ints = Arrays.asList(new Integer[]{3, 5, 6, 10, 15});
        String expectedResult = "fizz buzz fizz buzz fizzbuzz";
        String actualResult = FizzBuzz.processInts(ints);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void listWithNoMultiples(){
        List<Integer> ints = Arrays.asList(new Integer[]{1, 2, 4, 7, 8, 11});
        String expectedResult = "1 2 4 7 8 11";
        String actualResult = FizzBuzz.processInts(ints);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void emptyList(){
        List<Integer> ints = new ArrayList();
        String expectedResult = "";
        String actualResult = FizzBuzz.processInts(ints);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void nullList(){
        List<Integer> ints = null;
        String result = null;
        Exception caught = null;
        try {
            result = FizzBuzz.processInts(ints);
        } catch (Exception e){
            caught = e;
        }
        Assert.assertNotNull("Exception did not occur, result was " + result, caught);
    }

    @Test
    public void nullEntryInList(){
        List<Integer> ints = new ArrayList();
        for(int i=5; i >= 1; i--) {
            ints.add(i);
        }
        ints.add(null);
        String result = null;
        Exception caught = null;
        try {
            result = FizzBuzz.processInts(ints);
        } catch (Exception e){
            caught = e;
        }
        Assert.assertNotNull("Exception did not occur, result was " + result, caught);
    }
}
