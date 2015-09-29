package junit.code.week;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void whenOneGivenThanOneIsReturned() {

        FizzBuzz subject = new FizzBuzz();

        String result = subject.say(1);

        assertEquals("1", result);
    }
}
