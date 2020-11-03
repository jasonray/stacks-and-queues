import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackOfStringLinkedListTest {
    private StackOfStrings stackFactory() {
        return new StackOfStringLinkedList();
    }

    @Test
    public void newStackIsEmpty() {
        StackOfStrings stack = stackFactory();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushOneIsNotEmpty() {
        StackOfStrings stack = stackFactory();
        stack.push("hello");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushOnePopOneIsEmpty() {
        StackOfStrings stack = stackFactory();
        stack.push("hello");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushPopReturnsCorrectItem() {
        StackOfStrings stack = stackFactory();
        stack.push("hello");
        assertEquals("hello", stack.pop());
    }
}