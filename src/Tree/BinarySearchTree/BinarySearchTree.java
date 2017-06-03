package Tree.BinarySearchTree;

import Tree.Node;

/**
 * Created by igaurav on 6/3/2017.
 */
public class BinarySearchTree {

    Node root;

    BinarySearchTree(){
        root=null;
    }

    void insert(int data){
        root = insertRec(root,data);
    }

    Node insertRec(Node node ,int data){
        if(node == null){
            node = new Node(data);
            return node;
        }else if(node.data >data){
            node.left = insertRec(node.left, data);
        }else if(node.data <data){
            node.right = insertRec(node.right,data);
        }
        return node;
    }

    public void inorder(){
        inorderRec(root);
    }

    public void inorderRec(Node root){
        if(root != null){
            inorderRec(root.left);
            System.out.println(root.data);
            inorderRec(root.right);
        }
    }


    public static void main(String args[]){
        BinarySearchTree binarySearchTree= new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(30);
        binarySearchTree.insert(20);
        binarySearchTree.insert(40);
        binarySearchTree.insert(70);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);

        binarySearchTree.inorder();

    }

}
