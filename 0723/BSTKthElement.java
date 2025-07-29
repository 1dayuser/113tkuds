class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class BST {
    TreeNode root;

    public void insert(int val) {
        root = insertRecursive(root, val);
    }

    private TreeNode insertRecursive(TreeNode node, int val) {
        if (node == null) return new TreeNode(val);
        if (val < node.val)
            node.left = insertRecursive(node.left, val);
        else if (val > node.val)
            node.right = insertRecursive(node.right, val);
        return node;
    }

    private int count = 0;
    private int result = -1;

    public int findKthSmallest(int k) {
        count = 0;
        result = -1;
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null || count >= k) return;

        inorder(node.left, k);
        count++;
        if (count == k) {
            result = node.val;
            return;
        }
        inorder(node.right, k);
    }
}

public class BSTKthElement {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {20, 10, 30, 5, 15, 25, 35};
        for (int v : values) {
            tree.insert(v);
        }

        int k = 3;
        int kthSmallest = tree.findKthSmallest(k);
        System.out.println("第 " + k + " 小的元素是: " + kthSmallest);
    }
}
