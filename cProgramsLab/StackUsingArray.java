class Stack {
    int maxSize = 10;
    int[] stack = new int[maxSize];
    int top = -1;
    
    public void push(int data){
        if(top==maxSize) System.out.println("stack is full");
        else{
            stack[++top]=data;
        }
    }
    public void pop(){
        if(top==-1) System.out.println("underflow");
        else{
            int x = stack[top--];
            System.out.println(x+" is poped");
        }
    }

    public void peek(){
        if(top==-1) System.out.println("stack is full");
        else{
            System.out.println("top most element is: " + stack[top]);
        }
    }


}

public class StackUsingArray {
    
    public static void main(String[] args) {
        Stack box = new Stack();
        box.push(10);
        box.push(20);
        box.push(30);
        box.push(40);
        box.push(50);
        box.push(60);
        box.push(70);

        box.peek();

        box.pop();
        box.peek();
    }
}
