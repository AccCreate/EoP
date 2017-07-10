/**
 * Created by Paul Seo on 6/29/2017.
 */
public class P172_16 {
    public static void main(String[] args) {
        //      3
        //  2     5
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(3);
        root.setLeft(new BinaryTreeNode<Integer>(2));
        root.setRight(new BinaryTreeNode<Integer>(5));
        computeRightSiblingTree(root);
    }

    // Takes perfect binary tree and in each node, inputs rightSibling
    public static void computeRightSiblingTree(BinaryTreeNode<Integer> tree){
        // Left child 
        BinaryTreeNode<Integer> leftTree = tree;
        while (leftTree != null && leftTree.getLeft() != null){
            lowerLevelSiblingTrees(leftTree);
            leftTree = leftTree.getLeft();
        }

    }
    
    // Fill the rest of the level from the left 
    public static void lowerLevelSiblingTrees(BinaryTreeNode<Integer> tree){
    	BinaryTreeNode<Integer> treeLevel = tree;
    	while(treeLevel != null) {
    		treeLevel.getLeft().setRightSibling(treeLevel.getRight());
    		
    		if(treeLevel.getRightSibling() != null) {
    			treeLevel.getRight().setRightSibling(treeLevel.getRightSibling().getLeft());
    		}
    		treeLevel = treeLevel.getRightSibling();
    	}
    }
}
