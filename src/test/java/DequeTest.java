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

    @Test
    public void addFirstItemSize1() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        assertEquals(1, d.size());
    }

    @Test
    public void addFirstItemTwiceSize2() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        d.addFirst("banana");
        assertEquals(2, d.size());
    }

    @Test
    public void pushPopFromFront() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        assertEquals("apple", d.removeFirst());
    }
}