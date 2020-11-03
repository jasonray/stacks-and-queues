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
}