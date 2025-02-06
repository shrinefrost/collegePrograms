

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Insert nodes into the linked list
    public void add(int data) {
        if (head == null) {
            head = new Node(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("New node added: " + data);
    }

    // Traverse and display the linked list
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
}






public class displayElementWithRecursion {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        linkedlist.add(12);
        linkedlist.add(34);
        linkedlist.add(2);
        linkedlist.add(45);
        linkedlist.add(1);
        linkedlist.add(5);
        
        linkedlist.display(linkedlist.head);

 
        
    }
}
