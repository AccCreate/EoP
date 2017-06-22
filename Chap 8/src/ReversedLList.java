public class ReversedLList {
	public static LList<Character>.Node<Character> reverseLList(LList<Character>.Node<Character> head) {
		LList<Character>.Node<Character> prev = null, curr = head;
		while (curr != null) {
			LList<Character>.Node<Character> temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public static void reverseLList(LList<Character>.Node<Character> head, int count) {
		LList<Character>.Node<Character> prev = null, curr = head;
		for (int i = 0; i < count; ++i) {
			LList<Character>.Node<Character> temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}
	}

	public static void main(String[] args) {

	}
}
