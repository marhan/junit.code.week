package junit.code.week;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class FizzBuzzParameterizedTest {

    @Parameters( name = "{0} leads to {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
                {4, "4"}});
    }

    private int parameter;
    private String expectedResult;

    public FizzBuzzParameterizedTest(int parameter, String expectedResult) {
        this.parameter = parameter;
        this.expectedResult = expectedResult;
    }

    @Test
    public void testAll() {

        FizzBuzz subject = new FizzBuzz();

        String result = subject.say(parameter);

        Assert.assertEquals(expectedResult, result);

    }
}
