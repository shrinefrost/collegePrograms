class Node {
    int data;
    Node next;
    Node(int data){
        this.data =data;
        next = null;
    }
}

class Stack{
    Node top =null; 

    public void push(int data){
        if(top ==null){
            Node newNode = new Node(data);
            top = newNode;

        }

        else{
            Node newNode =new Node(data);
            newNode.next =top;
            top = newNode;
        }
    }
    public void pop(){
        if(top ==null) {
            System.out.println("nothing to pop");
        }
        else{
            Node temp = top.next;
            top.next = null;
            top = temp;
        }
    }

    public void peek(){
        if(top==null) System.out.println("stack is empty");
        else{
            System.out.println("top most element is:" + top.data);
        }
    }

    public void tranverse(){
        if(top==null) System.out.println("stack is empty");
        else{
            Node temp =top;
            while(temp!=null){
                System.out.print(temp.data);
                if(temp.next!=null) System.out.print("->");
                temp=temp.next;
            }
            System.out.println();
        }
    }


}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack box = new Stack();

        box.push(10);
        box.push(20);
        box.push(30);
        box.push(40);
        box.push(50);
        box.push(60);
        
        box.tranverse();
        //System.out.println();
        box.peek();

        box.pop();
        box.tranverse();
        box.peek();
        box.pop();
        box.tranverse();
        box.peek();

        box.push(70);
        box.tranverse();


    



    }
    
}
