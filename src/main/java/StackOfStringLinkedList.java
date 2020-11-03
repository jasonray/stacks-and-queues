public class StackOfStringLinkedList implements StackOfStrings {

    private Node first;

    private class Node {
        String item;
        Node next;
    }

    @Override
    public void StackOfStrings() {
        this.first = null;
    }

    @Override
    public void push(String item) {
        Node newNode = new Node();
        newNode.item = item;

        Node old = first;
        first = newNode;
        first.next = old;
    }

    @Override
    public String pop() {
        String item = first.item;
        first = first.next;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return (first == null);
    }
}
