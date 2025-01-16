package Recursion;

public class BinaryTreeMaxDepth {

    TreeNode root;

    public static void main(String[] args) {
        BinaryTreeMaxDepth node = new BinaryTreeMaxDepth();
        node.root = new TreeNode(7);
        node.root.left = new TreeNode(5);
        node.root.right = new TreeNode(9);
        node.root.left.left = new TreeNode(3);
        node.root.left.right = new TreeNode(6);
        node.root.left.right.left = new TreeNode(5);
        node.root.right.left = new TreeNode(4);
        node.root.right.right = new TreeNode(3);
        node.root.right.left.right = new TreeNode(5);
        System.out.println(maxDepth(node.root));
    }

    public static int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
