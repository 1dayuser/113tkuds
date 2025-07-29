package finalexam;

import java.util.*;

public class F12_TreeDiameter {
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int v) {
            val = v;
        }
    }

    static int diameter = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> vals = new ArrayList<>();
            while (sc.hasNextInt()) {
                vals.add(sc.nextInt());
            }
            if (vals.isEmpty()) {
                System.out.println(0);
                return;
            }

            TreeNode root = buildTree(vals);
            diameter = 0;
            height(root);
        }

        System.out.println(diameter);
    }

    static TreeNode buildTree(List<Integer> vals) {
        if (vals.size() == 0 || vals.get(0) == -1)
            return null;

        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (i < vals.size()) {
            TreeNode curr = q.poll();
            if (curr == null)
                continue;

            if (i < vals.size()) {
                int lv = vals.get(i++);
                if (lv != -1) {
                    curr.left = new TreeNode(lv);
                    q.offer(curr.left);
                }
            }
            if (i < vals.size()) {
                int rv = vals.get(i++);
                if (rv != -1) {
                    curr.right = new TreeNode(rv);
                    q.offer(curr.right);
                }
            }
        }
        return root;
    }

    static int height(TreeNode node) {
        if (node == null)
            return 0;

        int leftH = height(node.left);
        int rightH = height(node.right);

        diameter = Math.max(diameter, leftH + rightH);

        return Math.max(leftH, rightH) + 1;
    }
}

/*
 * 輸入
 * 1 2 3 4 5 -1 -1 -1 -1 -1 -1
 * 
 * 輸出
 * 4
 */
