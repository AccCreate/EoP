import java.util.*;

public class P128_11A {
    public static void main (String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(23);
        linkedList.add(24);
        linkedList.add(52);
        linkedList.add(22);
        Collections.reverse(linkedList);
        for (int c : linkedList)
            System.out.println(c); 

    }

    public static boolean isPalindrome(){
        return false;
    }
}