package BinaryTreeProblems;

import java.util.*;

public class LevelOrderTraversal {
    TreeNode root;
    LevelOrderTraversal() {root = null;}

    List mainList = new ArrayList<>();

    public static void main(String[] args) {
        LevelOrderTraversal node  = new LevelOrderTraversal();

        node.root = new TreeNode(1);
        node.root.left = new TreeNode(2);
        node.root.right = new TreeNode(3);
        node.root.left.left = new TreeNode(4);
        node.root.left.right = new TreeNode(5);
        node.root.right.left = new TreeNode(6);
        node.root.right.right = new TreeNode(7);
        node.root.left.left.left = new TreeNode(8);
        node.root.left.left.right = new TreeNode(9);
        node.root.left.right.left = new TreeNode(10);
        node.root.left.right.left.right = new TreeNode(11);
        node.root.left.right.left.right.left = new TreeNode(19);

        node.printLevelOrder();
        System.out.println(node.mainList);

        //System.out.println(node.LevelOrder(node.root));
//        node.max_Depth(node.root, 1);
//        System.out.println(node.answer);
    }

    /* Using Queue Data Structure */
    // Time Complexity : O(N)
    List LevelOrder(TreeNode root) {
        List result = new ArrayList<>();
        if (root == null)
            return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> subList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
                subList.add(temp.val);
            }
            result.add(subList);
        }
        return result;
    }

    /* -------------------------------------- */


    /* Naive Approach by figuring out the height */
    // Time Complexity : O(N * N)
    // Function to print level order traversal of tree
    void printLevelOrder()
    {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printCurrentLevel(root, i);
            mainList.add(new ArrayList<>(list));
            list.clear();
        }
    }

    List<Integer> list = new ArrayList<>();
    // Print nodes at the current level
    void printCurrentLevel(TreeNode root, int level)
    {
        if (root == null)
            return;
        if (level == 1) {
            //System.out.print(root.val + " ");
            list.add(root.val);
        }
        else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }

    // Bottom-Up Approach to find the height of the tree
    int height(TreeNode root)
    {
        if (root == null)
            return 0;
        else {

            // Compute height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    //Top-Bottom Approach to find the height of the tree
    int answer = 0;
    void max_Depth(TreeNode root, int depth) {
        if (root == null)
            return;
        if (root.left == null && root.right == null) {
            answer = Math.max(answer, depth);
        }
        max_Depth(root.left, depth+1);
        max_Depth(root.right, depth+1);
    }

    /*----------------------------------*/

}


/*
    static public List<List<Integer>> levelOrder(TreeNode root) {
        List list = new ArrayList<>();
        List<Integer> treeList = preorderTraversal(root);

        int j = 0;
        for (int i = 0;  j < treeList.size(); i++) {
            List<Integer> temp = new ArrayList<>();
            for (j = i; j < Math.pow(2, i); j++) {
                temp.add(treeList.get(j));
            }
            list.add(temp);
        }
        return list;
    }

    static public List<Integer> preorderTraversal(TreeNode root) {
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
*/
