import java.util.Scanner;
class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next =null;
    }
}

class Linker{
    Node head;


    public void display(){
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print("->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public void addLast(int data){
        if(head==null){
            Node newNode = new Node(data);
            head = newNode;
        }
        else{
            Node temp =head;
            Node newNode = new Node(data);
            while (temp.next!=null) {
                temp=temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("New node added with data: " + data);
        display();
        
    }

    public void addHead(int data){
        if(head==null){
            Node newNode = new Node(data);
            head = newNode;
        }
        else{
            Node temp =head;
            Node newNode = new Node(data);
            newNode.next=head;
            head = newNode;
        }
        System.out.println("New node added with data: " + data);
        display();
        
    }

    public void addMenu(Scanner sc){
        System.out.println("enter 1 for insertion at last: ");
        System.out.println("enter 2 for insertion at ith index: ");
        System.out.println("enter 3 for insertion at first: ");

        int choice = sc.nextInt();

        System.out.println("enter data for node: ");
        int data =sc.nextInt();
        switch (choice) {
            case 1:{
                addLast(data);
                break;
            }

            case 2:{
                break;
            } 

            case 3:{
                break;
            }

        
            default:
                break;
        }
    }
}



public class question1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        Linker linkedList = new Linker();


        while (true) {
            System.out.println("enter 1 to add data:");
            System.out.println("enter 2 for deleting an data: ");
            System.out.println("enter 3 for existing the program");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:{
                    linkedList.addMenu(sc);
                    break;
                }
                case 2:{
                    
                    break;
                }
                case 3:{
                    
                    break;
                }
            
                default:
                    break;
            }
        }



        
    }
    
}
