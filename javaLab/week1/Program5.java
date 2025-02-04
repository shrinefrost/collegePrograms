package week1;
import java.util.Scanner;

class Factorial {
    int num;

    Factorial(int num) {
        this.num = num;
    }
    int calFact(){
        int result =1;
        for(int i=1;i<=num;i++){
            result = result*i;
        }
        return result;
    }

}


public class Program5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number: ");
        int Fact = sc.nextInt();
        Factorial f = new Factorial(Fact);
        System.out.println("Factorial of "+Fact+" is: "+f.calFact());
    }
    
}

