import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DequeTest {

    @Test
    public void initDequeOfString() {
        Deque<String> d = new Deque<String>();
    }

    @Test
    public void newDequeIsEmpty() {
        Deque<String> d = new Deque<String>();
        assertTrue(d.isEmpty());
    }

    @Test
    public void newDequeSize0() {
        Deque<String> d = new Deque<String>();
        assertEquals(0, d.size());
    }

    @Test
    public void addFirstItemIsNotEmpty() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        assertFalse(d.isEmpty());
    }
}