class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class BinaryTree {
    TreeNode root;

    public int sum(TreeNode node) {
        if (node == null) return 0;
        return node.value + sum(node.left) + sum(node.right);
    }

    public int findMax(TreeNode node) {
        if (node == null) return Integer.MIN_VALUE;
        int leftMax = findMax(node.left);
        int rightMax = findMax(node.right);
        return Math.max(node.value, Math.max(leftMax, rightMax));
    }

    public int findMin(TreeNode node) {
        if (node == null) return Integer.MAX_VALUE;
        int leftMin = findMin(node.left);
        int rightMin = findMin(node.right);
        return Math.min(node.value, Math.min(leftMin, rightMin));
    }

    public int countLeaves(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

    public int depth(TreeNode node) {
        if (node == null) return 0;
        return 1 + Math.max(depth(node.left), depth(node.right));
    }
}

public class TreeStatistics {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(7);
        tree.root.right.left = new TreeNode(15);
        tree.root.right.right = new TreeNode(25);

        System.out.println("節點總和: " + tree.sum(tree.root));
        System.out.println("最大值: " + tree.findMax(tree.root));
        System.out.println("最小值: " + tree.findMin(tree.root));
        System.out.println("葉節點數: " + tree.countLeaves(tree.root));
        System.out.println("樹的深度: " + tree.depth(tree.root));
    }
}
