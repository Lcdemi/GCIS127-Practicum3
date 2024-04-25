package practicum3;

import java.util.LinkedList;
import java.util.List;

public class ListDeque<E> implements Deque<E> {
    private List<E> elements;

    public ListDeque() {
        this.elements = new LinkedList<>();
    }

    @Override
    public void addFirst(E value) {
        elements.add(0, value);
    }

    @Override
    public void addLast(E value) {
        elements.add(value);
    }

    @SuppressWarnings("unchecked")
    @Override
    public E peekFirst() {
        if(elements.size() > 0) {
            return elements.get(0);
        } else {
            return (E) "List is Empty";
        }
    }

    @Override
    public E peekLast() {
        return elements.get(size()-1);
    }

    @Override
    public E removeFirst() {
        E value = elements.get(0);
        elements.remove(0);
        return value;
    }

    @Override
    public E removeLast() {
        E value = elements.get(size()-1);
        elements.remove(size()-1);
        return value;
    }

    @Override
    public int size() {
        return elements.size();
    }
    
}
