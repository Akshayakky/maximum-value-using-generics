import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases {
    //Test Cases For Integer Values
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.findMaximumInteger(3, 2, 1);
        Assert.assertEquals((Integer) 3, max);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.findMaximumInteger(2, 3, 1);
        Assert.assertEquals((Integer) 3, max);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.findMaximumInteger(1, 2, 3);
        Assert.assertEquals((Integer) 3, max);
    }

    //Test Cases For Float Values
    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Float max = findMaximum.findMaximumFloat(3.1f, 2.4f, 1.3f);
        Assert.assertEquals((Float) 3.1f, max);
    }

    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Float max = findMaximum.findMaximumFloat(2.4f, 3.1f, 1.3f);
        Assert.assertEquals((Float) 3.1f, max);
    }

    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Float max = findMaximum.findMaximumFloat(1.3f, 2.4f, 3.1f);
        Assert.assertEquals((Float) 3.1f, max);
    }
}