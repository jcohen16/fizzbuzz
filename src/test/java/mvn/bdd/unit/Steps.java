package mvn.bdd.unit;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import mvn.bdd.unit.FizzBuzz;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class Steps {

    private List<Integer> currInts = null;

    @Given("^I submit the values '(.*)'$")
    public void submitValues(String values){
        String[] valueArray = values.split("; ");
        List<Integer> ints = new ArrayList<>();
        for(int i=0; i<valueArray.length; i++) {
            Integer intValue = null;

            String value = valueArray[i];
            if(!value.equals("NULL")){
                intValue = Integer.parseInt(value);
            }

            ints.add(intValue);
        }
        currInts = ints;
    }

    @Given("^I submit an empty list$")
    public void submitEmptyList(){
        currInts = new ArrayList<>();
    }

    @Given("^I submit a null list$")
    public void submitNullList(){
        // do nothing, list is already null
    }

    @Then("^fizzbuzz should return the result '(.*)'$")
    public void validateResult(String expectedResult){
        String actualResult = FizzBuzz.processInts(currInts);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("^fizzbuzz should throw an exception$")
    public void validateException(){
        String result = null;
        Exception caught = null;
        try {
            result = FizzBuzz.processInts(currInts);
        } catch (Exception e){
            caught = e;
        }
        Assert.assertNotNull("Exception did not occur, result was " + result, caught);
    }
}
