import java.util.ArrayList;

class TreeNode {
    int value;
    TreeNode left, right;

    TreeNode(int val) {
        this.value = val;
    }
}

class BST {
    TreeNode root;

    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode node, int value) {
        if (node == null) return new TreeNode(value);
        if (value < node.value)
            node.left = insertRecursive(node.left, value);
        else if (value > node.value)
            node.right = insertRecursive(node.right, value);
        return node;
    }

    public ArrayList<Integer> rangeQuery(int min, int max) {
        ArrayList<Integer> result = new ArrayList<>();
        rangeQueryHelper(root, min, max, result);
        return result;
    }

    private void rangeQueryHelper(TreeNode node, int min, int max, ArrayList<Integer> result) {
        if (node == null) return;

        if (node.value > min)
            rangeQueryHelper(node.left, min, max, result);

        if (node.value >= min && node.value <= max)
            result.add(node.value);

        if (node.value < max)
            rangeQueryHelper(node.right, min, max, result);
    }
}

public class BSTRangeQuery {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] values = {20, 10, 30, 5, 15, 25, 35};
        for (int val : values) {
            tree.insert(val);
        }

        int min = 12, max = 27;
        ArrayList<Integer> result = tree.rangeQuery(min, max);
        System.out.println("範圍 [" + min + ", " + max + "] 內的節點值: " + result);
    }
}
