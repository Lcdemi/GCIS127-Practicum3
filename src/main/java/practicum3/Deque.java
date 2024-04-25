package practicum3;

public interface Deque<E> {
    public void addFirst(E value);
    public void addLast(E value);
    public E peekFirst();
    public E peekLast();
    public E removeFirst();
    public E removeLast();
    public int size();
}
