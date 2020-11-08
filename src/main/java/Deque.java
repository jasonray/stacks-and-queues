import java.util.Iterator;

public class Deque<Item> implements Iterable<Item> {

    private Node first = null;

    private class Node {
        Item item;
        Node next;
    }

    // construct an empty deque
    public Deque() {
    }

    // is the deque empty?
    public boolean isEmpty() {
        return first == null;
    }

    // return the number of items on the deque
    public int size() {
        int count = 0;
        Node iterator = first;
        while (iterator != null) {
            count++;
            iterator = iterator.next;
        }

        return count;
    }

    // add the item to the front
    public void addFirst(Item item) {
        Node oldFirst = this.first;

        Node node = new Node();
        node.item = item;
        node.next = oldFirst;

        this.first = node;
    }

    // add the item to the back
    public void addLast(Item item) {
    }

    // remove and return the item from the front
    public Item removeFirst() {
        Node oldFirst = first;
        Item item = oldFirst.item;
        this.first = oldFirst.next;

        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        return null;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return null;
    }

    // unit testing (required)
    public static void main(String[] args) {
    }
}
