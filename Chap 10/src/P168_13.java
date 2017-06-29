import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class P168_13 {

    public static void main(String[] args) {
        List<Integer> preOrder = new ArrayList<Integer>(Arrays.asList(8, 2, 6, null, null, 5, 1, null, null, null, 3, null, 4, null, 7, 9, null, null, null));

        BinaryTreeNode<Integer> tree1 = reconstructPreOrderTree(preOrder);
        BinaryTreeNode<Integer> tree2 = reconstructPreOrderTree2(preOrder);
    }

    // Solution from EoP O(n) time complexity
    public static Integer subTreeIdx;
    public static BinaryTreeNode<Integer> reconstructPreOrderTree (List<Integer> preOrder){
        subTreeIdx = 0;
        return reconstructPreOrderSubTree(preOrder);
    }
    public static BinaryTreeNode<Integer> reconstructPreOrderSubTree (List <Integer> preOrder){
        Integer value = preOrder.get(subTreeIdx);
        ++subTreeIdx;
        if(value == null){
            return null;
        }
        BinaryTreeNode<Integer> leftSubTree = reconstructPreOrderSubTree(preOrder);
        BinaryTreeNode<Integer> rightSubTree = reconstructPreOrderSubTree(preOrder);
        return new BinaryTreeNode<>(leftSubTree, rightSubTree, value);
    }

    // Why not .next() instead since .get for LinkedList is O(n) instead of O(1)?
    // This is waste of time complexity if object is a LinkedList
    public static BinaryTreeNode<Integer> reconstructPreOrderTree2(List<Integer> preOrder){
        Iterator<Integer> iterator = preOrder.iterator();
        return reconstructPreOrderSubTree2(iterator);
    }

    public static BinaryTreeNode reconstructPreOrderSubTree2(Iterator<Integer> iterator){
        if(!iterator.hasNext())
            return null;
        Integer value = iterator.next();
        BinaryTreeNode<Integer> leftSubTree = reconstructPreOrderSubTree2(iterator);
        BinaryTreeNode<Integer> rightSubTree = reconstructPreOrderSubTree2(iterator);
        return new BinaryTreeNode<>(leftSubTree, rightSubTree, value);
    }

}
