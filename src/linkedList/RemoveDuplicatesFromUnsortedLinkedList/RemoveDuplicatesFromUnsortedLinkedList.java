package linkedList.RemoveDuplicatesFromUnsortedLinkedList;

import linkedList.Node;

public class RemoveDuplicatesFromUnsortedLinkedList {

    public static void removeDuplicates(Node root){
        Node temp1=root;
        while(temp1!=null){
            int data = temp1.data;
            Node temp2 = null;
            if(temp1.next!=null){
                temp2=temp1.next;
            }
            while(temp2!=null){
                if(data==temp2.data){
                  if(temp2.next!=null){
                      temp2.data=temp2.next.data;
                      temp2.next=temp2.next.next;
                      temp2=temp2.next;
                  }else{
                      temp2=null;
                  }
                }
            }
            temp1=temp1.next;
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
        root.next = new Node(1);
        //root.next.next=new Node(1);
        /*root.next.next=new Node(2);
        root.next .next.next = new Node(1);
        root.next.next.next.next= new Node(5);*/
        removeDuplicates(root);
        printList(root);
    }

}
