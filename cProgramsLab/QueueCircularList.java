class Node {
    int data;
    Node next;
    Node(int data){
        this.data =data;
        next = null;
    }
}

class Queue {
    Node last = null;
    public void enqueue	(int data){
        if(last == null) {
            Node newNode = new Node(data);
            newNode.next = newNode;
            last = newNode;
        }
        else{
            Node head;
            head = last.next;
            Node newNode = new Node(data);
            last.next = newNode;
            newNode.next =head;
            last = newNode;
        }

    }
    public void dequeue(){
        if(last==null) {
            System.out.println("queue is empyty");
            return;
        }

        Node head = last.next;
        last.next = head.next;
        head =null;
    }

    public void tranverse(){
        if(last==null) System.out.println("queue is empty");
        else{
            Node head = last.next;
            while(true){
                System.out.print(head.data);
                if(head.next!=last.next) System.out.print("->");
                else break;
                head = head.next;
            }
        }
    }

    public void peek(){
        if(last ==null) System.out.println("queue is empty");
        Node head = last.next;
        System.out.println(head.data + " ko sabsai pahalai khana milaiga");
    }


}

public class QueueCircularList {
    public static void main(String[] args) {
        Queue member = new Queue();
        member.enqueue(10);
        member.enqueue(20);
        member.enqueue(30);
        member.enqueue(40);
        member.enqueue(50);

        member.tranverse();
        System.out.println();
        member.peek();

        member.dequeue();
        System.out.println();
        member.tranverse();
        System.out.println();
        member.peek();

        member.enqueue(100);
        member.tranverse();
        
    }
}
