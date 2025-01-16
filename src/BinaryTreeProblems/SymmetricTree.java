package BinaryTreeProblems;

import java.util.*;

public class SymmetricTree {

    TreeNode root;
    SymmetricTree() {root = null;}

    public static void main(String[] args) {
        SymmetricTree node = new SymmetricTree();

        node.root = new TreeNode(1);
        node.root.left = new TreeNode(2);
        node.root.right = new TreeNode(2);
        node.root.left.left = new TreeNode(3);
        node.root.left.right = new TreeNode(4);
        node.root.left.right.left = new TreeNode(5);
        node.root.right.left = new TreeNode(4);
        node.root.right.right = new TreeNode(3);
        node.root.right.left.right = new TreeNode(5);


        System.out.println(node.isSymmetric(node.root));
    }

    public boolean isSymmetric(TreeNode root) {
        return root==null || isSymmetricHelp(root.left, root.right);
    }

    private boolean isSymmetricHelp(TreeNode left, TreeNode right){
        if(left==null || right==null)
            return left==right;
        if(left.val!=right.val)
            return false;
        return isSymmetricHelp(left.left, right.right) && isSymmetricHelp(left.right, right.left);
    }

    public boolean isSymmetricIterative(TreeNode root) {
        if(root==null)  return true;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left, right;
        if(root.left!=null){
            if(root.right==null) return false;
            stack.push(root.left);
            stack.push(root.right);
        }
        else if(root.right!=null){
            return false;
        }

        while(!stack.empty()){
            if(stack.size()%2!=0)   return false;
            right = stack.pop();
            left = stack.pop();
            if(right.val!=left.val) return false;

            if(left.left!=null){
                if(right.right==null)   return false;
                stack.push(left.left);
                stack.push(right.right);
            }
            else if(right.right!=null){
                return false;
            }

            if(left.right!=null){
                if(right.left==null)   return false;
                stack.push(left.right);
                stack.push(right.left);
            }
            else if(right.left!=null){
                return false;
            }
        }

        return true;
    }

}
