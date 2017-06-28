public class Traversal {
    public static void main(String[] args) {
        BinaryTreeNode tree = new BinaryTreeNode(1);
        tree.setLeft(new BinaryTreeNode(2));
        tree.setRight(new BinaryTreeNode(3));
        tree.getLeft().setLeft(new BinaryTreeNode(4));
        tree.getLeft().setRight(new BinaryTreeNode(5));
        tree.getRight().setLeft(new BinaryTreeNode(6));
        tree.getRight().setRight(new BinaryTreeNode(7));


        // O(n) since it traverses everywhere in terms of time
        // log(n) in terms of memory space cause it uses stack 
        inOrder(tree);
        System.out.println(""); 
        preOrder(tree);
        System.out.println(""); 
        postOrder(tree);
        System.out.println(""); 
        allOrder(tree);
    }

    public static void allOrder(BinaryTreeNode tree){
        if(tree != null){
            // Pre
            System.out.println("Pre " + tree.getValue()); 
            allOrder(tree.getLeft());

            // Post
            System.out.println("Post " + tree.getValue()); 
            allOrder(tree.getRight());

            // In
            System.out.println("In " + tree.getValue()); 
        }
    }

    // Left Mid Right
    public static void inOrder(BinaryTreeNode tree) {
        if (tree == null)
            return;
        inOrder(tree.getLeft());
        System.out.println(tree.getValue());
        inOrder(tree.getRight());
    }

    // Mid Left Right
    public static void preOrder(BinaryTreeNode tree) {
        if (tree == null)
            return;
        System.out.println(tree.getValue());
        preOrder(tree.getLeft());
        preOrder(tree.getRight());
    }

    // Left Right Mid
    public static void postOrder(BinaryTreeNode tree) {
        if (tree == null)
            return;
        postOrder(tree.getLeft());
        postOrder(tree.getRight());
        System.out.println(tree.getValue()); 
    }
}
