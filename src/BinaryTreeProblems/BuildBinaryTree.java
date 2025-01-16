package BinaryTreeProblems;

import java.util.HashMap;

public class BuildBinaryTree {
    TreeNode root;

    BuildBinaryTree() { root = null; }

    public static void main(String[] args) {
        BuildBinaryTree node = new BuildBinaryTree();

        int[] inorder = {9,3,15,20,7};
        int[] preorder = {3,9,20,15,7};

        System.out.println(node.buildTree(preorder, inorder).val);

    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length != inorder.length)
            return null;

        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            hashMap.put(inorder[i], i);
        }

        return buildTreeHelper(inorder, 0, inorder.length, preorder, 0, preorder.length, hashMap);
    }

    private TreeNode buildTreeHelper(int[] inorder, int inorderStartIndex, int inorderEndIndex, int[] preorder, int preorderStartIndex, int preorderEndIndex, HashMap<Integer, Integer> hashMap) {
        if ((inorderStartIndex > inorderEndIndex) || (preorderStartIndex > preorderEndIndex))
            return null;
        TreeNode root = new TreeNode(preorder[preorderStartIndex]);
        int rootIndex = hashMap.get(preorder[preorderStartIndex]);
        TreeNode leftNode = buildTreeHelper(inorder, inorderStartIndex, rootIndex - 1, preorder, rootIndex + 1,rootIndex + rootIndex - 1, hashMap);
        TreeNode rightNode = buildTreeHelper(inorder, rootIndex + 1, inorderEndIndex, preorder, rootIndex + rootIndex, preorderEndIndex, hashMap);

        root.left = leftNode;
        root.right = rightNode;

        return root;
    }

}
