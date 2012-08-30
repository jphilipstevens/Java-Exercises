public class SinglyLinkeList<E>
{
    Node<E> start;

    public SinglyLinkeList()
    {
        this.start = null;
    }

    public void add(E newData)
    {
        if (start == null)
        {
            start = new Node<E>(newData, null);
        }
        else
        {
            Node<E> cache = this.start; // store a reference to the current
            // start
            // node
            while (cache.next != null)
            {
                cache = cache.next;
            }

            cache.next = new Node<E>(newData, null);
        }
    }

    public E getFront()
    {
        return this.start.data; // return the front object's data
    }
}