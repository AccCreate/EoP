
public class IsListPalindrome {
	// java.util.* has been imported for this problem.
	// You don't need any other imports.
	

	public Boolean isListPalindrome(ListNode head) {
	    if(head == null || (head.next == null)) return true;
	    
	    Stack<Integer> stack = new Stack<Integer>();
	    //stack.push(head.data);
	    
	    ListNode sPointer = head;
	    ListNode fPointer = head;
	    while(fPointer != null && fPointer.next != null && fPointer.next.next != null){
	        stack.push(sPointer.data);   
	        sPointer = sPointer.next;
	        fPointer = fPointer.next.next;
	    }
	    stack.push(sPointer.data);
	    
	    if(fPointer.next == null){
	        sPointer = sPointer.next;
	        stack.pop();
	    }

	    while(!stack.isEmpty()){
	        if(stack.pop() != sPointer.data){
	            return false;
	        }
	        sPointer = sPointer.next;
	    }
	    
	    
	    return true;

	}

	// 3 2 1 1 2 3
	// s: 3 f: 3
	// k: 3 s: 2 f: 1
	// k: 3 2 s: 1 f: 2

}
