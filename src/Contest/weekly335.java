package Contest;

import java.util.Arrays;

import Tree.TreeNode;

public class weekly335 {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 2, 1, 3, 7, 4, 6 };
        TreeNode root = TreeNode.buildTree(arr);
        System.out.println(kthLargestLevelSum(root, 2));
    }

    public int passThePillow(int n, int time) {
        return time / (n - 1) % 2 == 0 ? 1 + time % (n - 1) : n - time % (n - 1);
    }

    public static long kthLargestLevelSum(TreeNode root, int k) {
        long res = 0;
        int height = TreeNode.getHeight(root);
        System.out.println(height);
        if (k > height)
            return -1;
        long[] count = new long[height];// need to get height of the tree
        loopTree(root, 0, count);
        Arrays.sort(count);
        res = count[count.length - k];
        return res;
    }

    public static void loopTree(TreeNode root, int level, long[] count) {
        if (root == null) {
            return;
        }
        count[level] += root.val;
        loopTree(root.left, level + 1, count);
        loopTree(root.right, level + 1, count);

    }

    public int findValidSplit(int[] nums) {
        int res = 0;

        return res;
    }

}
