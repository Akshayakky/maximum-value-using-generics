import org.junit.Assert;
import org.junit.Test;

public class FindMaximumTestCases {
    //Test Cases For Integer Values
    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(3, 2, 1);
        Integer max = (Integer) findMaximum.testMaximum();
        Assert.assertEquals((Integer) 3, max);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(2, 3, 1);
        Integer max = (Integer) findMaximum.testMaximum();
        Assert.assertEquals((Integer) 3, max);
    }

    @Test
    public void givenThreeIntegers_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(1, 2, 3);
        Integer max = (Integer) findMaximum.testMaximum();
        Assert.assertEquals((Integer) 3, max);
    }

    //Test Cases For Float Values
    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(3.1f, 2.4f, 1.3f);
        Float max = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 3.1f, max);
    }

    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(2.4f, 3.1f, 1.3f);
        Float max = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 3.1f, max);
    }

    @Test
    public void givenThreeFloats_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum(1.3f, 2.4f, 3.1f);
        Float max = (Float) findMaximum.testMaximum();
        Assert.assertEquals((Float) 3.1f, max);
    }

    //Test Cases For String Values
    @Test
    public void givenThreeStrings_WhenMaximumFoundAtPosition1_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("3", "2", "1");
        String maximum = (String) findMaximum.testMaximum();
        Assert.assertEquals("3", maximum);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFoundAtPosition2_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("2", "3", "1");
        String maximum = (String) findMaximum.testMaximum();
        Assert.assertEquals("3", maximum);
    }

    @Test
    public void givenThreeStrings_WhenMaximumFoundAtPosition3_ThenReturnMaximum() {
        FindMaximum findMaximum = new FindMaximum("1", "2", "3");
        String maximum = (String) findMaximum.testMaximum();
        Assert.assertEquals("3", maximum);
    }
}