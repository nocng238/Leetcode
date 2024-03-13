package Contest;

import Tree.TreeNode;
import java.util.*;
public class weekly434 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,2,2,3,3,1};
        // System.out.println(minIncrements(7,arr));
        // int a = 1;
        // increte(a);
        // System.out.println(a);
    }
    static public int[] colorTheArray(int n, int[][] queries) {
        int[] res = new int[queries.length];
    int[] painted = new int[n];
    int curentAnswer = 0;
    int index = 0;
    for (int[] query : queries) {
      if (query[0] > 0) {
        if (painted[query[0]] != query[1] && painted[query[0] - 1] == query[1])
          curentAnswer++;
        if (painted[query[0]] != 0) {
          if (painted[query[0] - 1] == painted[query[0]] && query[1] != painted[query[0]])
            curentAnswer--;
        }
      }
      if (query[0] < n - 1) {
        if (painted[query[0]] != query[1] && painted[query[0] + 1] == query[1])
          curentAnswer++;
        if (painted[query[0]] != 0) {
          if (painted[query[0] + 1] == painted[query[0]] && query[1] != painted[query[0]])
            curentAnswer--;
        }
      }
      painted[query[0]] = query[1];
      res[index] = curentAnswer;
      index++;
    }
    return res;
    }
    // more cleaner
    public int[] colorTheArray2(int n, int[][] queries) {
        int cnt = 0;

        int [] current = new int [n];
        int [] ans = new int [queries.length];

        for(int i=0; i<queries.length; i++){
            int color = queries[i][1];
            int ind = queries[i][0];

            if(current[ind] != 0 && ind > 0 && current[ind-1] == current[ind]) cnt--;
            if(current[ind] != 0 && ind + 1 < n && current[ind+1] == current[ind]) cnt--;

            current[ind] = color;
             
            if(ind > 0 && current[ind-1] == color) cnt++;
            if(ind + 1 < n && current[ind+1] == color) cnt++;

            ans[i] = cnt;
        }

        return ans;
    }
    static public int minIncrements(int n, int[] cost) {
        int res = 0;
        TreeNode root = TreeNode.buildTree(cost);
        res = countMinIncrements(root, res);

        return res;
    }
    public static int countMinIncrements(TreeNode root,int current) {
        if(root == null || root.left == null || root.right == null){
            return 0;
        }
        return Math.abs(root.left.val - root.right.val)+ countMinIncrements(root.left, current) + countMinIncrements(root.right, current);
        
    }
    public static void increte (int current){
        current++;
        return;
    }
    public static void inorder(Node root)
    {
        if (root == null) {
            return;
        }
 
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
 
    // Function to build a binary tree from the given parent array
    public Node insertLevelOrder(int[] arr, int i)
    {
          Node root = null;
        // Base case for recursion
        if (i < arr.length) {
            root = new Node(arr[i]);
 
            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);
 
            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
}
class Node {
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
