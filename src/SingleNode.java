public class SingleNode<E> {

	public E data;
	public SingleNode<E> next;

	public SingleNode(E data, SingleNode<E> next) {
		this.data = data;
		this.next = next;
	}
}
