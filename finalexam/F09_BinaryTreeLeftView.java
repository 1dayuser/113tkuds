package finalexam;

import java.util.*;

public class F09_BinaryTreeLeftView {

    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int v) {
            val = v;
            left = right = null;
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            List<Integer> vals = new ArrayList<>();
            while (sc.hasNextInt()) {
                vals.add(sc.nextInt());
            }

            if (vals.size() == 0) {
                System.out.println("LeftView:");
                return;
            }

            TreeNode root = buildTree(vals);
            List<Integer> leftView = getLeftView(root);

            System.out.print("LeftView:");
            for (int v : leftView) {
                System.out.print(" " + v);
            }
        }

        System.out.println();
    }

    static TreeNode buildTree(List<Integer> vals) {
        if (vals.get(0) == -1)
            return null;

        TreeNode root = new TreeNode(vals.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int i = 1;
        while (i < vals.size()) {
            TreeNode curr = queue.poll();
            if (curr == null)
                continue;

            if (i < vals.size()) {
                int leftVal = vals.get(i++);
                if (leftVal != -1) {
                    curr.left = new TreeNode(leftVal);
                    queue.offer(curr.left);
                }
            }

            if (i < vals.size()) {
                int rightVal = vals.get(i++);
                if (rightVal != -1) {
                    curr.right = new TreeNode(rightVal);
                    queue.offer(curr.right);
                }
            }
        }

        return root;
    }

    static List<Integer> getLeftView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
            return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();

                if (i == 0) {
                    res.add(node.val);
                }

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
        }

        return res;
    }
}

/*
 * 輸入
 * 1 2 3 4 5 -1 7 -1 -1 6 -1 -1 -1 -1 -1
 * 
 * 輸出
 * LeftView: 1 2 4 6
 */
