package Tree.BinarySearchTree.BinaryTreeIsBinarySearchTreeOrNot;

import Tree.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by igaurav on 6/4/2017.
 */
public class BinaryTreeIsBinarySearchTreeUsingArray {

    Node root;

    boolean isBinarySearchTree(Node root){
        Queue<Integer> queue = new LinkedList();
        inorder(root, queue);
        int previous = queue.poll();
        boolean isBst =true;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            if(current <previous){
                isBst =false;
                return isBst;
            }
        }
        return isBst;
    }


    void inorder(Node root, Queue queue){
        if(root !=null) {
            inorder(root.left, queue);
            queue.add(root.data);
            inorder(root.right, queue);
        }
    }


    public static void main(String[] args) {
        BinaryTreeIsBinarySearchTreeUsingArray tree = new BinaryTreeIsBinarySearchTreeUsingArray();
        tree.root=new Node(3);
        tree.root.left=new Node(2);
        tree.root.right=new Node(4);
        tree.root.left.left= new Node(1);
        tree.root.right.right= new Node(5);

        if(tree.isBinarySearchTree(tree.root)){
            System.out.println("Is Binary Search Tree");
        }else{
            System.out.println("Is not Binary Search Tree");
        }
    }

}
