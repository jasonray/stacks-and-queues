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

    @Test
    public void pushPopFromFrontIsEmpty() {
        Deque<String> d = new Deque<String>();
        assertTrue(d.isEmpty());
        d.addFirst("apple");
        assertFalse(d.isEmpty());
        assertEquals("apple", d.removeFirst());
        assertTrue(d.isEmpty());
    }

    @Test
    public void pushPopFromFrontSize0() {
        Deque<String> d = new Deque<String>();
        assertEquals(0, d.size());
        d.addFirst("apple");
        assertEquals(1, d.size());
        assertEquals("apple", d.removeFirst());
        assertEquals(0, d.size());
    }

    @Test
    public void pushToFrontRemoveFront() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        d.addFirst("banana");
        d.addFirst("cantaloupe");

        assertEquals("cantaloupe", d.removeFirst());
        assertEquals("banana", d.removeFirst());
        assertEquals("apple", d.removeFirst());
    }

    @Test
    public void pushToFrontRemoveBack() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        assertEquals("apple", d.removeLast());
    }

    @Test
    public void pushToFrontRemoveBackTwoItems() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        d.addFirst("banana");
        assertEquals("apple", d.removeLast());
        assertEquals("banana", d.removeLast());
    }

    @Test
    public void pushToFrontRemoveBackThreeItems() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        d.addFirst("banana");
        d.addFirst("cantaloupe");

        assertEquals("apple", d.removeLast());
        assertEquals("banana", d.removeLast());
        assertEquals("cantaloupe", d.removeLast());
    }

    @Test
    public void addLastPopLast() {
        Deque<String> d = new Deque<String>();
        d.addLast("apple");
        assertEquals("apple", d.removeLast());
    }

    @Test
    public void addLastPopFirst() {
        Deque<String> d = new Deque<String>();
        d.addLast("apple");
        assertEquals("apple", d.removeFirst());
    }

    @Test
    public void addLastPopLastMultiple() {
        Deque<String> d = new Deque<String>();
        d.addFirst("apple");
        d.addFirst("banana");
        d.addLast("cantaloupe");

        assertEquals("cantaloupe", d.removeLast());
        assertEquals("apple", d.removeLast());
        assertEquals("banana", d.removeLast());
    }
}