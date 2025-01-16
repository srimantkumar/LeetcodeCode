package BinaryTreeProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConstructBinaryTree {

    TreeNode root;

    ConstructBinaryTree() { root = null; }

    public static void main(String[] args) {
        ConstructBinaryTree node = new ConstructBinaryTree();

//        node.root = new TreeNode(5);
//        node.root.left = new TreeNode(4);
//        node.root.right = new TreeNode(8);
//        node.root.left.left = new TreeNode(11);
//        node.root.left.left.left = new TreeNode(7);
//        node.root.left.left.right = new TreeNode(6);
//        node.root.right.left = new TreeNode(13);
//        node.root.right.right = new TreeNode(4);
//        node.root.right.right.right = new TreeNode(1);

        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        System.out.println(node.preorderTraversal(node.buildTree(inorder, postorder)));

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null || inorder.length != postorder.length)
            return null;
        HashMap<Integer, Integer> hashMap = new HashMap<Integer,Integer>();
        for (int i=0;i<inorder.length;++i)
            hashMap.put(inorder[i], i);
        return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0,
                postorder.length-1,hashMap);
    }

    private TreeNode buildTreePostIn(int[] inorder, int inorderStart, int inorderEnd, int[] postorder, int postOrderStart, int postOrderEnd, HashMap<Integer,Integer> hashMap){
        if (postOrderStart>postOrderEnd || inorderStart>inorderEnd) return null;
        TreeNode root = new TreeNode(postorder[postOrderEnd]);
        int rootIndexOfInorder = hashMap.get(postorder[postOrderEnd]);
        TreeNode leftChild = buildTreePostIn(inorder, inorderStart, rootIndexOfInorder - 1,
                postorder, postOrderStart, postOrderStart + rootIndexOfInorder - inorderStart - 1, hashMap);
        TreeNode rightChild = buildTreePostIn(inorder,rootIndexOfInorder + 1, inorderEnd,
                postorder, postOrderStart + rootIndexOfInorder - inorderStart, postOrderEnd - 1, hashMap);
        root.left = leftChild;
        root.right = rightChild;
        return root;
    }

    List<Integer> preOrderList = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null) {
            preOrderList.add(root.val);
            if (root.left != null) {
                preorderTraversal(root.left);
            }
            if (root.right != null) {
                preorderTraversal(root.right);
            }
        }
        return preOrderList;
    }
}
