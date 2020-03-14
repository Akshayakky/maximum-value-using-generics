import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases {
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
}