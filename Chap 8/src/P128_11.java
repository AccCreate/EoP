import java.util.Stack;

// Check Palindrome in Single Linked List
public class P128_11{
    public static void main(String args[]){
        System.out.println("nope"); 
    }

    // O(n) memory
    // Use a stack
    // Slow pointer and fast pointer
    public static boolean isPalindrome(LList<Character> lStart){
        Stack<LList<Character>> halfStack = new Stack<LList<Character>>();
        LList<Character>.Node<Character> fPointer = lStart.head;
        LList<Character>.Node<Character> sPointer = lStart.head; 
        //while(LList.next != null && LList.next.next != null){
        //halfStack.add(fPointer);
        //sPointer = sPointer.next.next;
        //fPointer = fPointer.next;
        //}
        sPointer = sPointer.next.next;
        fPointer = fPointer.next;
        return false;
    }
}

