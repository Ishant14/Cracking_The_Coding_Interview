package Tree.BinarySearchTree.BinaryTreeIsBalanced;

import Tree.Node;

/**
 * Created by igaurav on 6/4/2017.
 */
public class CheckBinaryTreeBalancedOrNot {

    Node root;

    private int getHeight(Node root){
        if(root ==null){
            return -1;
        }
        return Math.max(getHeight(root.left),getHeight(root.right))+1;
    }


    public boolean isBalanced(Node root){
        if(root==null){
            return true ;
        }

        int heghtDiff = getHeight(root.left)-getHeight(root.right);
        if(Math.abs(heghtDiff) > 1){
            return false;
        }else{
            return isBalanced(root.left) && isBalanced(root.right);
        }

    }

    public static void main(String[] args) {
        CheckBinaryTreeBalancedOrNot tree = new CheckBinaryTreeBalancedOrNot();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.right.right= new Node(5);
        tree.root.right.right.right= new Node(6);
        tree.root.right.right.right.right= new Node(7);

        if(tree.isBalanced(tree.root)){
            System.out.println("Tree is balanced");
        }else {
            System.out.println("Tree is not balanced");
        }

    }

}
