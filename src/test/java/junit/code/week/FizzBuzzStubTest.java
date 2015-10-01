package junit.code.week;

import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;

@RunWith(EasyMockRunner.class)
public class FizzBuzzStubTest {

    @Mock
    private Input stub;

    @TestSubject
    private FizzBuzz subject = new FizzBuzz();

    @Test
    public void whenThreeIsGivenThanFizzIsReturned() {

        expect(stub.getInput()).andStubReturn(3);

        replay(stub);

        String result = subject.say(stub);

        assertEquals("Fizz", result);
    }
}
