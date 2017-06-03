package StackAndQueue;

/**
 * Created by igaurav on 6/1/2017.
 */
class StackPushPopMin {

    Node min;
    Node top;

    void push(int data){
        Node newNode = new Node(data);
        newNode.next=top;
        top=newNode;

        //maintaining minimum value
        if(min!=null && min.data>top.data){
            min=top;
        }
    }

    Node pop(){
        if(top!=null){

            if(top==min){

            }

            Node temp = top;
            top=top.next;
            return temp;
        }
        return null;
    }

    Node getMin(){
        return min;
    }



    public static void main(String args[]){

        StackPushPopMin stackPushPopMin = new StackPushPopMin();
        stackPushPopMin.push(3);
        stackPushPopMin.push(5);
        stackPushPopMin.push(1);

        System.out.println("Min element");

    }

}

