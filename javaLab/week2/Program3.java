package week2;

/* Program 3: Write a Java program to print prime numbers from 1 to 50 using while & 
do-while loops.  */


public class Program3 {

    public static void main(String[] args) {
        int limit = 50; 
        
        System.out.println("Prime numbers up to " + limit + ":");
        int num = 2;
        System.out.println("using while loop: ");
        while ( num <= limit) {
            boolean isPrime = true;
            int i = 2;
            while ( i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false; 
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.print(num + " "); 
            }
            num++;
        }

        System.out.println(" \n using do while loop: ");
        System.out.print("2 ");
        num = 2;
        do {
            boolean isPrime = true;
            int i = 2;
            do{
                if (num % i == 0) {
                    isPrime = false; 
                    break;
                }
                i++;
            }while(( i <= Math.sqrt(num)));
            if (isPrime) {
                System.out.print(num + " "); 
            }
            num++;
        }while ( num <= limit);
    }
}

