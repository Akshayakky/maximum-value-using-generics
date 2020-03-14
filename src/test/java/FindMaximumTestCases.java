import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases {
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum();
        Integer max = findMaximum.findMaximumInteger(3, 2, 1);
        Assert.assertEquals((Integer) 3, max);
    }
}