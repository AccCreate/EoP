public class BinaryTree {
    public static BinaryTreeNode treeNode;


    public BinaryTree(Object value){
        treeNode = new BinaryTreeNode(value);
    }

    public class BinaryTreeNode {
        private BinaryTreeNode left;
        private BinaryTreeNode right;
        private Object value;

        public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, Object value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        /**
         *
         */
        public BinaryTreeNode(Object value) {
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
        public Object getValue() {
            return value;
        }

        /**
         * @param value the value to set
         */
        public void setValue(Object value) {
            this.value = value;
        }

    }
}