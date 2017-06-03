package Tree.BinarySearchTree;

import Tree.Node;

/**
 * Created by igaurav on 6/3/2017.
 */
public class BinarySearchTreeWithMinimalHeight {

    Node createMinimalBst(int array[]) {
        return createMinimalBst(array, 0, array.length - 1);
    }

    private Node createMinimalBst(int[] array, int start, int end) {
        if (end < start ) {
            return null;
        }
        int mid = (start + end) / 2;
        Node node = new Node(array[mid]);
        node.left = createMinimalBst(array,start,mid-1);
        node.right = createMinimalBst(array,mid+1,end);
        return node;
    }

    public int findHeight(Node root){
        if(root ==null){
            return 0;
        }

        if(root.left==null && root.right ==null){
            return 0;
        }
        int leftHeight= 1+ findHeight(root.left);
        int rightHeight =1+ findHeight(root.right);

        if(leftHeight>rightHeight){
            return leftHeight;
        }else{
            return rightHeight;
        }
    }

    public void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTreeWithMinimalHeight tree = new BinarySearchTreeWithMinimalHeight();
        int array[]={1,2,3,4,5};
        Node root = tree.createMinimalBst(array);
        tree.inorder(root);
        System.out.println("\nHeight of binary tree :"+tree.findHeight(root));

    }

}
