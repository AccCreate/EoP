import java.util.Stack;

// Check Palindrome in Single Linked List
public class P128_11{
    public static void main(String args[]){
        LList<Character> lStart = new LList<Character>();
        lStart.push('a');
        lStart.push('b');
        lStart.push('c');

        lStart.push('c');
        lStart.push('b');
        lStart.push('a');
        System.out.println(isPalindrome1(lStart));
        System.out.println(isPalindrome2(lStart));

    }


    // O(n) memory
    // Use a stack
    // Slow pointer and fast pointer
    public static boolean isPalindrome1(LList<Character> lStart){
        if(lStart == null)
            return true;

        Stack<LList<Character>.Node<Character>> halfStack = new Stack<LList<Character>.Node<Character>>();
        LList<Character>.Node<Character> fPointer = lStart.head;
        LList<Character>.Node<Character> sPointer = lStart.head;

        while(sPointer != null && sPointer.next != null){
            halfStack.add(fPointer);
            sPointer = sPointer.next.next;
            fPointer = fPointer.next;
        }

        if(sPointer != null){
            fPointer = fPointer.next;
        }
        while(!halfStack.isEmpty() && fPointer != null){
            char rip = halfStack.pop().data;
            if (rip != fPointer.data){
                return false;
            }
            fPointer = fPointer.next;
        }
        return true;
    }

    // Reverse second half of linked list (Palindrome)
    // O(1) memory and O(n) time
    public static boolean isPalindrome2(LList<Character> lStart){
        if (lStart == null) return true;

        LList<Character>.Node<Character> fPointer = lStart.head;
        LList<Character>.Node<Character> sPointer = lStart.head;
        while (sPointer != null && sPointer.next != null){
            sPointer = sPointer.next.next;  
            fPointer = fPointer.next;
        }       

        LList<Character>.Node<Character> firstHalfLetter = lStart.head;

        LList<Character>.Node<Character> secondHalfLetter = ReversedLList.reverseLList(fPointer);

        int count = 0; 
        while (firstHalfLetter != null && secondHalfLetter != null){
            if (firstHalfLetter.getData() != secondHalfLetter.getData())
                return false;
            firstHalfLetter = firstHalfLetter.next;
            secondHalfLetter = secondHalfLetter.next;
            count++;
        }

        //        ReversedLList.reverseLList(fPointer, 2);
        return true;
    }
}
