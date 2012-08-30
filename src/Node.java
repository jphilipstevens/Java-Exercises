public class Node<E>
{
    public E data; // the data stored in this node

    public Node<E> next; // store a reference to the next node in this
                         // singlylinkedlist

    public Node(E data, Node<E> next)
    {
        this.data = data;
        this.next = next;
    }
}