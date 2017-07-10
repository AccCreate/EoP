public class BinaryTreeNode<T> {
    public BinaryTreeNode left;
    public BinaryTreeNode right;
    public T value;
    public BinaryTreeNode rightSibling;

    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, T value) {
        this.left = left;
        this.right = right;
        this.value = value;

    }

    /**
     *
     */
    public BinaryTreeNode(T value) {
        left = null;
        right = null;
        this.value = value;
    }

    /**
     * @return the left
     */
    public BinaryTreeNode getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public BinaryTreeNode getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }

    /**
     * @return the value
     */
    public T getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(T value) {
        this.value = value;
    }

    public BinaryTreeNode getRightSibling() {
        return rightSibling;
    }

    public void setRightSibling(BinaryTreeNode rightSibling) {
        this.rightSibling = rightSibling;
    }
}
