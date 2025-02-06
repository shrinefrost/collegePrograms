class Node {
    int data;
    Node next =null;

    Node(int data, Node head) {
        this.data = data;
        next = head;
    }
    
}

class LinkedList {
    Node head;

    // Insert nodes into the linked list
    public void add(int data) {
        if (head == null) {
            head = new Node(data,head);
        } else {
            Node newNode = new Node(data,head);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("New node added: " + data);
    }

    public Node display(Node temp){
        if(head ==null){
            System.out.println("no node to traverse ahead");
        }
        if(temp==null){
            return null;
        }
        System.out.print(temp.data);
        if (temp.next != null)
            System.out.print(" -> ");
        display(temp.next);
        return null;
    }

    public Node reverse(Node head){

        if(head.next ==null) return head;
        Node newhead = reverse(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null; 
        return newhead;
    }
}



public class CircularLInkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(5);
        linkedList.add(7);
        linkedList.add(9);

        linkedList.display(linkedList.head);
        linkedList.head = linkedList.reverse(linkedList.head);
        System.out.println();
        linkedList.display(linkedList.head);

    }
}
