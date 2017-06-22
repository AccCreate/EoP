import java.util.*;

class P132_0 {
    public static void main(String args[]) {
        LinkedList<Integer> linkedNode = new LinkedList<Integer>();
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(24);
        linkedNode.push(23);
		reverseLinkedList(linkedNode);
	}


	public static void reverseLinkedList(LinkedList<Integer> linkedNode) {
        Deque<Integer> deq = new LinkedList<Integer>();
        while (! linkedNode.isEmpty()){
            deq.addFirst(linkedNode.pop());
        }

        while (! deq.isEmpty()){
            System.out.println(deq.poll());

        }

    }
}
