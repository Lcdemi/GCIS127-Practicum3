package practicum3;

public class NodeDeque<E> implements Deque<E> {
    private DoubleNode<E> front;
    private DoubleNode<E> back;
    private int size;
    
    public NodeDeque() {
        this.front = null;
        this.back = null;
        this.size = 0;
    }

    @Override
    public void addFirst(E value) {
        DoubleNode<E> newNode = new DoubleNode<E>(value);
        newNode.setNext(front);
        newNode.setPrevious(null);
        front = newNode;
        if(back == null) {
            back = front;
        }
        size++;
    }

    @Override
    public void addLast(E value) {
        DoubleNode<E> newNode = new DoubleNode<E>(value);
        newNode.setPrevious(back);
        newNode.setNext(null);
        back = newNode;
        if(front == null) {
            front = back;
        }
        size++;
    }

    @Override
    public E peekFirst() {
        return front.getValue();
    }

    @Override
    public E peekLast() {
        return back.getValue();
    }

    @Override
    public E removeFirst() {
        E value = front.getValue();
        front = front.getNext();
        size--;
        return value;
    }

    @Override
    public E removeLast() {
        E value = back.getValue();
        back = back.getPrevious();
        size--;
        return value;
    }

    @Override
    public int size() {
        return this.size;
    }
    
}
