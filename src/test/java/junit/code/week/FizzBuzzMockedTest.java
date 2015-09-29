package junit.code.week;

import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.easymock.EasyMock.expect;
import static org.easymock.EasyMock.replay;
import static org.junit.Assert.assertEquals;

@RunWith(EasyMockRunner.class)
public class FizzBuzzMockedTest {

    @Mock
    private Whizz mock;

    @TestSubject
    private FizzBuzz subject = new FizzBuzz(mock);

    @Test
    public void whenSevenIsGivenThanWhizzIsReturned() {

        expect(mock.sayWhizz()).andReturn("Whizz");

        replay(mock);

        String result = subject.say(7);

        assertEquals("Whizz", result);
    }
}
