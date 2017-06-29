import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Paul Seo on 6/29/2017.
 */
public class P172_16 {
    public static void main(String[] args) {
        List<Integer> preOrder = new ArrayList<Integer>(Arrays.asList(8, 2, 6, null, null, 5, 1, null, null, null, 3, null, 4, null, 7, 9, null, null, null));
    }

    // Takes perfect binary tree and in each node, inputs rightSibling
    public static void computeRightSiblingTree(BinaryTreeNode<Integer> tree){
        // Left child (because it would be the parent's right child)
        BinaryTreeNode<Integer> leftTree = tree;
        while (leftTree != null && leftTree.getLeft() != null){
            lowerLevelSiblingTrees(leftTree);
            leftTree = leftTree.getLeft();
        }

        // Right child (parent's right left child)
    }

    public static void lowerLevelSiblingTrees(BinaryTreeNode<Integer> tree){

    }
}
