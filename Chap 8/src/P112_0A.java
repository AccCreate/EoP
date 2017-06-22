// Create Node
public class P112_0A<T> {
	protected T data;
	protected P112_0A<T> next;

	public P112_0A(T data, P112_0A<T> next) {
		this.data = data;
		this.next = next;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public P112_0A<T> getNext() {
		return next;
	}

	/**
	 * @param next
	 *            the next to set
	 */
	public void setNext(P112_0A<T> next) {
		this.next = next;
	}

	public static void main(String args[]) {
		System.out.println("works");
	}

	// Delete current node O(1) time
	public void deleteNode() {
		if (this.next != null) {
			this.data = next.data;
			this.next = next.next;
		} else {
			this.data = null;
			this.next = null;
		}

	}

}
