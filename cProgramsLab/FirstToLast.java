

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
    public void display() {
        if (head == null) {
            System.out.println("No nodes to display.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null)
                    System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public void endToFirst() {
        Node temp = head;
        Node last;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        
        last = temp.next;
        temp.next = null;
        last.next = head;
        head = last;
        display();
        
    }



}





public class Main {
    public static void main(String[] args) {
        LinkedList linkedlist = new LinkedList();

        linkedlist.add(12);
        linkedlist.add(34);
        linkedlist.add(2);
        linkedlist.add(45);
        linkedlist.add(1);
        linkedlist.add(5);

        linkedlist.display();

        linkedlist.endToFirst();
        
    }
}

