public class DoubleLinkedNode<E> {

	public E data;
	public DoubleLinkedNode<E> prev;
	public DoubleLinkedNode<E> next;

	public DoubleLinkedNode(E data, DoubleLinkedNode<E> next,
			DoubleLinkedNode<E> prev) {

		this.data = data;
		this.next = next;
		this.prev = prev;

	}
}
