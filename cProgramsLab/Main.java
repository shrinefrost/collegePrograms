

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
    
    public void increasingOrder() {
        Node tempUpper = head;
        Node tempLower = head;
        System.out.println("IncreasingOrder");
        while (tempUpper!= null) {
            int min = tempUpper.data;
            tempLower = tempUpper.next;
            while (tempLower!= null) {
                if (min >= tempLower.data) {
                    int tempVar = tempLower.data;
                    tempLower.data = min;
                    tempUpper.data = tempVar;
                    min = tempVar;
                }
                tempLower = tempLower.next;
            }
            tempUpper = tempUpper.next;

        }
        display();
    }
    
    public void decreasingOrder() {
        Node tempUpper = head;
        Node tempLower = head;
        System.out.println("decreasingOrder");
        while (tempUpper!= null) {
            int min = tempUpper.data;
            tempLower = tempUpper.next;
            while (tempLower!= null) {
                if (min <= tempLower.data) {
                    int tempVar = tempLower.data;
                    tempLower.data = min;
                    tempUpper.data = tempVar;
                    min = tempVar;
                }
                tempLower = tempLower.next;
            }
            tempUpper = tempUpper.next;

        }
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

        linkedlist.increasingOrder();
        linkedlist.decreasingOrder();
        
    }
}
