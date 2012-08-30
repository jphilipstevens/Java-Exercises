public class ReverseSingleLinkedList
{

    public static void main(String[] args)
    {
        SingleNode<Integer> head = new SingleNode<Integer>(0, null);
        SingleNode<Integer> cur = head;
        for (int i = 1; i < 5; i++)
        {
            cur.next = new SingleNode<Integer>(i, null);
            cur = cur.next;
        }

        SingleNode<Integer> currentNode = head;
        SingleNode<Integer> nextNode = head.next;
        SingleNode<Integer> prev = null;

        while (nextNode != null)
        {
            currentNode.next = prev;
            prev = currentNode;
            currentNode = nextNode;
            nextNode = nextNode.next;
        }

        head = currentNode;
        head.next = prev;
    }
}
