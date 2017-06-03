package linkedList.RemoveDuplicatesFromUnsortedLinkedList;

import linkedList.Node;

import java.util.HashSet;

/**
 * Created by igaurav on 5/31/2017.
 */

public class RemoveDuplicateUsingHashSet {

    public static void removeDuplicates(Node root){
        HashSet<Integer> set = new HashSet<Integer>();
        Node temp=root;
        Node previous = null;
        while(temp!=null){
            if(set.contains(temp.data)){
                previous.next=temp.next;
            }else{
                set.add(temp.data);
                previous=temp;
            }
            temp=temp.next;
        }
    }

    public static void printList(Node root){
        Node temp=root;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }


    public static void main(String args[]){
        Node root = new Node(1);
        root.next = new Node(3);
        //root.next.next=new Node(3);
        root.next.next=new Node(2);
        root.next .next.next = new Node(1);
        root.next.next.next.next= new Node(5);
        removeDuplicates(root);
        printList(root);
    }

}
