package finalexam;

import java.util.*;

public class F10_BSTRangeSum {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int v) {
            val = v;
            left = right = null;
        }
    }

    static int sum = 0;
    static int L, R;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> vals = new ArrayList<>();
            while (sc.hasNextInt()) {
                vals.add(sc.nextInt());
            }

            if (vals.size() < 3) {
                System.out.println(0);
                return;
            }
            R = vals.remove(vals.size() - 1);
            L = vals.remove(vals.size() - 1);

            TreeNode root = buildTree(vals);
            sum = 0;
            rangeSumBST(root);
        }

        System.out.println(sum);
    }

    static TreeNode buildTree(List<Integer> vals) {
        if (vals.size() == 0 || vals.get(0) == -1)
            return null;

        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int i = 1;

        while (i < vals.size()) {
            TreeNode cur = q.poll();
            if (cur == null)
                continue;

            if (i < vals.size()) {
                int lv = vals.get(i++);
                if (lv != -1) {
                    cur.left = new TreeNode(lv);
                    q.offer(cur.left);
                }
            }
            if (i < vals.size()) {
                int rv = vals.get(i++);
                if (rv != -1) {
                    cur.right = new TreeNode(rv);
                    q.offer(cur.right);
                }
            }
        }
        return root;
    }

    static void rangeSumBST(TreeNode root) {
        if (root == null)
            return;

        if (root.val > L) {
            rangeSumBST(root.left);
        }

        if (root.val >= L && root.val <= R) {
            sum += root.val;
        }

        if (root.val < R) {
            rangeSumBST(root.right);
        }
    }
}

/*
 * 輸入
 * 10 5 15 3 7 13 18 -1 -1 -1 -1 -1 -1 6 14
 * 5 15
 * 
 * 輸出
 * 59
 */
