package week2;

/*Program 2: Write a Java program to make a class A in that class declare function add 
perform addition through main. */
class A {

    int a;
    int b;

    A(int a,int b){
        this.a = a;
        this.b=b;
    }
    int add(){
        int sum = a+b;
        return sum;
    }
}



public class program2 {
    public static void main(String[] args) {
        A obj1 = new A(12,14);

        System.out.println("sum through main: " + obj1.add());
    }
}
