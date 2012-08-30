public class ReverseDoubleLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DoubleLinkedNode<Integer> head = new DoubleLinkedNode<Integer>(0, null,
				null);
		DoubleLinkedNode<Integer> cur = head;
		DoubleLinkedNode<Integer> next = null;
		for (int i = 1; i < 5; i++) {
			cur.next = new DoubleLinkedNode<Integer>(i, null, cur);
			cur.next.prev = cur;
			cur = cur.next;
		}
		System.out.println("done");

		DoubleLinkedNode<Integer> prev = null;
		cur = head;
		next = cur.next;

		while (next != null) {
			// switch the pointers
			cur.next = prev;
			cur.prev = next;

			// crawl to next element
			prev = cur;
			cur = next;
			next = next.next;
		}

		cur.next = prev;
		cur.prev = next;
		head = cur;

		printRsult(head);

	}

	private static void printRsult(DoubleLinkedNode<Integer> head) {
		DoubleLinkedNode<Integer> cur = head;
		while (cur != null) {
			System.out.print(cur.data + " ");
			cur = cur.next;
		}
		System.out.println();

	}

}
