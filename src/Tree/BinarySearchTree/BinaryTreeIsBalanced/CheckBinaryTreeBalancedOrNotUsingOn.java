package Tree.BinarySearchTree.BinaryTreeIsBalanced;

import Tree.Node;

/**
 * Created by igaurav on 6/4/2017.
 */
public class CheckBinaryTreeBalancedOrNotUsingOn {

    Node root;

    public boolean isBalanced(Node root) {
        return checkHeight(root) != Integer.MIN_VALUE;
    }

    private int checkHeight(Node root) {

        if (root == null) {
            return -1;
        }

        int leftHeight = checkHeight(root.left);
        if (leftHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int rightHeight = checkHeight(root.right);
        if (rightHeight == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        int heightDiff = leftHeight - rightHeight;
        if (Math.abs(heightDiff) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }


    public static void main(String[] args) {
        CheckBinaryTreeBalancedOrNotUsingOn tree = new CheckBinaryTreeBalancedOrNotUsingOn();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.right = new Node(5);
        tree.root.right.right.right = new Node(6);
        // tree.root.right.right.right.right= new Node(7);

        if (tree.isBalanced(tree.root)) {
            System.out.println("Tree is balanced");
        } else {
            System.out.println("Tree is not balanced");
        }
    }

}
