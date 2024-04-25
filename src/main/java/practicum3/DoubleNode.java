package practicum3;

/**
 * A doubly-linked node. It stores a value and has links to the next and 
 * previous nodes in the sequence (either or both of which may be null).
 */
public class DoubleNode<E> {
    /**
     * The value stored in this node.
     */
    private E value;

    /**
     * The previous node in the sequence (may be null).
     */
    private DoubleNode<E> previous;

    /**
     * The next node in the sequence (may be null).
     */
    private DoubleNode<E> next;

    /**
     * Creates a new double node with the specified value.
     * 
     * @param value The value stored in the new node.
     */
    public DoubleNode(E value) {
        this.value = value;
        this.previous = null;
        this.next = null;
    }

    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }

    public DoubleNode<E> getPrevious() {
        return previous;
    }

    /**
     * Sets the previous node in the sequence to the specified value. If the 
     * node is not null, this method will also set its previous to this node.
     * 
     * If a previous node already exists, the connection will be broken (set to 
     * null).
     * 
     * @param node The new previous node.
     */
    public void setPrevious(DoubleNode<E> node) {
        if(previous != null) {
            previous.next = null;
        }
        previous = node;
        if(previous != null) {
            previous.next = this;
        }
    }

    public DoubleNode<E> getNext() {
        return next;
    }

    /**
     * Sets the next node in the sequence to the specified value. If the node 
     * is not null, this method will also set its next to this node.
     * 
     * If a next node already exists, the connection will be broken (set to 
     * null).
     * 
     * @param node The new previous node.
     */
    public void setNext(DoubleNode<E> n) {
        if(next != null) {
            next.previous = null;
        }
        next = n;
        if(next != null) {
            next.previous = this;
        }
    }

    @Override
    public String toString() {
        return this.value + " <-> " + this.next;
    }
}
