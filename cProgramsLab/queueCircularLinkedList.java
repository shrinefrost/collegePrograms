class Node {
    int data;
    Node next;
    
    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    // Constructor
    public Queue() {
        this.front = this.rear = null;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);
        // If the queue is empty, new node is both front and rear
        if (isEmpty()) {
            front = rear = newNode;
            rear.next = front; // Circular link
        } else {
            rear.next = newNode; // Link current rear to new node
            rear = newNode; // Move rear to the new node
            rear.next = front; // Link rear's next to front (circular)
        }
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1; // Return an invalid value or exception can be used
        }
        int data = front.data;
        // If there is only one node in the queue
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front; // Maintain circular link
        }
        return data;
    }

    // Display the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        Node temp = front;
        while (true) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            if (temp == front) {
                break;
            }
        }
        System.out.println();
    }
}

public class queueCircularLinkedList {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.display();  // Output: 10 20 30 40

        System.out.println("Dequeued: " + queue.dequeue());  // Output: Dequeued: 10
        queue.display();  // Output: 20 30 40

        queue.enqueue(50);
        queue.display();  // Output: 20 30 40 50
    }
}




