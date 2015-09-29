package junit.code.week;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FizzBuzzParameterizedTest {

    @Parameters(name = "{0} leads to {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, "1"},
                {2, "2"},
                {3, "Fizz"},
                {4, "4"},
                {5, "Buzz"},
                {6, "Fizz"},
                {7, "7"}});
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

        assertEquals(expectedResult, result);

    }
}
