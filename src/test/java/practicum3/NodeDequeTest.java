package practicum3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class NodeDequeTest {
    /**
     * Private helper method that makes and returns a deque to test.
     * 
     * @return The deque to test in this unit test.
     */
    private Deque<String> makeEmptyDeque() {
        return new NodeDeque<>();
    }

    @Test
    public void create() {
        // setup

        // invoke
        Deque<String> deque = makeEmptyDeque();

        // analyze
        assertNotNull(deque);
        assertEquals(0, deque.size());
    }

    @Test
    public void addFirstOne() {
        // setup
        String value = "abc";
        Deque<String> deque = makeEmptyDeque();

        // invoke
        deque.addFirst(value);

        // analyze
        assertEquals(value, deque.peekFirst());
        assertEquals(value, deque.peekLast());
        assertEquals(1, deque.size());
    }

    @Test
    public void addFirstMultiple() {
        // setup
        String[] values = { "dog", "cat", "bird" };
        Deque<String> deque = makeEmptyDeque();

        // invoke
        deque.addFirst(values[0]);
        deque.addFirst(values[1]);
        deque.addFirst(values[2]);

        // analyze
        assertEquals(values[2], deque.peekFirst());
        assertEquals(values[0], deque.peekLast());
        assertEquals(3, deque.size());
    }

    @Test
    public void addLastOne() {
        // setup
        String value = "dog";
        Deque<String> deque = makeEmptyDeque();

        // invoke
        deque.addLast(value);

        // analyze
        assertEquals(value, deque.peekFirst());
        assertEquals(value, deque.peekLast());
        assertEquals(1, deque.size());
    }

    @Test
    public void addLastMultiple() {
        // setup
        String[] values = { "123", "456", "789" };
        Deque<String> deque = makeEmptyDeque();

        // invoke
        deque.addLast(values[0]);
        deque.addLast(values[1]);
        deque.addLast(values[2]);

        // analyze
        assertEquals(values[0], deque.peekFirst());
        assertEquals(values[2], deque.peekLast());
        assertEquals(3, deque.size());
    }

    @Test
    public void addFirstAndLast() {
        // setup
        String first = "butter";
        String last = "cup";
        Deque<String> deque = makeEmptyDeque();

        // invoke
        deque.addFirst(first);
        deque.addLast(last);

        // analyze
        assertEquals(first, deque.peekFirst());
        assertEquals(last, deque.peekLast());
        assertEquals(2, deque.size());
    }

    @Test
    public void removeFirstOnly() {
        // setup
        String value = "woof";
        Deque<String> deque = makeEmptyDeque();
        deque.addFirst(value);

        // invoke
        String actual = deque.removeFirst();

        // analyze
        assertEquals(value, actual);
        assertEquals(0, deque.size());
    }

    @Test
    public void removeLastOnly() {
        // setup
        String value = "meow";
        Deque<String> deque = makeEmptyDeque();
        deque.addLast(value);

        // invoke
        String actual = deque.removeLast();

        // analyze
        assertEquals(value, actual);
        assertEquals(0, deque.size());
    }
}
