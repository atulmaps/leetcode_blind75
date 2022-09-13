package tree;

public class TreeProblems {

    //Maximum Depth of Binary Tree

    public static int maxDepth(TreeNode root) {

        if(root == null) {
            return 0;
        }
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return Math.max(l, r) + 1;
    }
}
