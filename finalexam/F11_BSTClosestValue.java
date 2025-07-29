package finalexam;

import java.util.*;

public class F11_BSTClosestValue {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int v) {
            val = v;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> vals = new ArrayList<>();
            while (sc.hasNextInt()) {
                vals.add(sc.nextInt());
            }
            if (vals.size() < 2) {
                System.out.println("No tree or target");
                return;
            }

            int T = vals.remove(vals.size() - 1);
            TreeNode root = buildTree(vals);

            int closest = findClosestValue(root, T);
            System.out.println(closest);
        }
    }

    static TreeNode buildTree(List<Integer> vals) {
        if (vals.isEmpty() || vals.get(0) == -1)
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

    static int findClosestValue(TreeNode root, int target) {
        int closest = root.val;
        TreeNode node = root;

        while (node != null) {
            int diffCurrent = Math.abs(node.val - target);
            int diffClosest = Math.abs(closest - target);

            if (diffCurrent < diffClosest || (diffCurrent == diffClosest && node.val < closest)) {
                closest = node.val;
            }

            if (target < node.val) {
                node = node.left;
            } else if (target > node.val) {
                node = node.right;
            } else {
                return node.val;
            }
        }

        return closest;
    }
}

/*
 * 輸入
 * 10 5 15 3 7 13 18 -1 -1 -1 -1 -1 -1
 * 12
 * 
 * 輸出
 * 13
 */
