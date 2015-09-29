package junit.code.week;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz subject = new FizzBuzz();

    @Test
    public void whenOneIsGivenThanOneIsReturned() {

        String result = subject.say(1);

        assertEquals("1", result);
    }

    @Test
    public void whenTwoIsGivenThenTwoIsReturned() {

        String result = subject.say(2);

        assertEquals("2", result);
    }

    @Test
    public void whenThreeIsGivenThenFizzIsReturned() {

        String result = subject.say(3);

        assertEquals("Fizz", result);
    }
}
