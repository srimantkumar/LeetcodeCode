package BinaryTreeProblems;

public class SumPath {
    TreeNode root;

    SumPath() {
        root = null;
    }

    public static void main(String[] args) {
        SumPath node = new SumPath();
        node.root = new TreeNode(5);
        node.root.left = new TreeNode(4);
        node.root.right = new TreeNode(8);
        node.root.left.left = new TreeNode(11);
        node.root.left.left.left = new TreeNode(7);
        node.root.left.left.right = new TreeNode(6);
        node.root.right.left = new TreeNode(13);
        node.root.right.right = new TreeNode(4);
        node.root.right.right.right = new TreeNode(1);

        System.out.println(node.hasPathSum(node.root, 22));

    }

//    public boolean hasPathSum(TreeNode root, int sum) {
//        if (root == null) return false;
//
//        if (root.left == null && root.right == null && sum - root.val == 0) return true;
//
//        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
//    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null && root.val == targetSum) return true;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}
