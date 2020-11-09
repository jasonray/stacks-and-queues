import java.util.Iterator;
import java.util.NoSuchElementException;

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
        if (item == null) throw new IllegalArgumentException();

        Node oldFirst = this.first;

        Node node = new Node();
        node.item = item;
        node.next = oldFirst;

        this.first = node;
    }

    // add the item to the back
    public void addLast(Item item) {
        if (item == null) throw new IllegalArgumentException();

        if (first == null) {
            this.addFirst(item);
        } else {
            Node node = new Node();
            node.item = item;
            node.next = null;

            Node iterator = first;
            while (iterator.next != null) {
                iterator = iterator.next;
            }
            iterator.next = node;
        }
    }

    // remove and return the item from the front
    public Item removeFirst() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Node oldFirst = first;
        Item item = oldFirst.item;
        this.first = oldFirst.next;

        return item;
    }

    // remove and return the item from the back
    public Item removeLast() {
        if (first == null) {
            throw new NoSuchElementException();
        }

        Node iterator = this.first;

        Node prev = null;
        while (iterator.next != null) {
            prev = iterator;
            iterator = iterator.next;
        }

        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }

        return iterator.item;
    }

    // return an iterator over items in order from front to back
    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() { /* not supported */ }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    // unit testing (required)
    public static void main(String[] args) {
        Deque<String> d = new Deque<String>();
        System.out.println("is deque empty: " + d.isEmpty());

        System.out.println("add item to front of deque " + "banana");
        d.addFirst("banana");

        System.out.println("add item to front of deque " + "apple");
        d.addFirst("apple");

        System.out.println("add item to back of deque " + "cantaloupe");
        d.addLast("cantaloupe");

        System.out.println("is deque empty: " + d.isEmpty());

        for (String item : d) {
            System.out.println("for each item:" + item);
        }

        System.out.println("is deque empty: " + d.isEmpty());

        System.out.println("remove item from front: " + d.removeFirst());

        System.out.println("remove item from back: " + d.removeLast());

        System.out.println("remove item from back: " + d.removeLast());

        System.out.println("is deque empty: " + d.isEmpty());
    }
}
