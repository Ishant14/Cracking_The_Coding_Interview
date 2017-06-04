package Tree.BinarySearchTree;

import Tree.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by igaurav on 6/3/2017.
 */
public class LinkedListFromBinarySearchTreeDepthsNode {

    Node root;

    public void printLevelOrder() {

        Queue<Node> queue = new LinkedList<Node>();
        List<Integer> list = new ArrayList<Integer>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            while(!queue.isEmpty()){

            }

            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }

        }
    }

    public static void main(String[] args) {
        LinkedListFromBinarySearchTreeDepthsNode tree = new LinkedListFromBinarySearchTreeDepthsNode();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.right.right= new Node(5);

        System.out.println("Level order traversal of binary search tree :-");
        tree.printLevelOrder();
    }

}
