/*Program 2: Print the sum, difference, and product of two complex numbers by creating 
a class named 'Complex' with separate methods for each operation whose real and 
imaginary parts are entered by the user.  */
package week3;
import java.util.*;
class Complex{
    int real;
    int imaginary;

    Complex(int real , int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    void add(Complex obj1){
        int realSum = obj1.real+real;
        int imaginarySum = obj1.imaginary+imaginary;
        String sign = "+";
        if(imaginarySum<0){
            sign = " ";
        }
        
        System.out.println("sum of complex number is: " + realSum + sign + imaginarySum +"i");
    }
    void diff(Complex obj1){
        int realdiff = obj1.real-real;
        int imaginarydiff = obj1.imaginary-imaginary;
        String sign = "+";
        if(imaginarydiff<0){
            sign = " ";
        }
        System.out.println("diffirence of complex number is: " + realdiff + sign + imaginarydiff +"i");
    }

    void multiplication(Complex obj1){
        int realMulti = obj1.real * real;
        int imaginaryMulti = (obj1.imaginary*imaginary)*(-1);
        String sign = "+";
        if(imaginaryMulti<0){
            sign = " ";
        }
        System.out.println("multiplication of complex number is: " + realMulti + sign + imaginaryMulti +"i");

    }
}



public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter real part of the first complex number:");
        int real1 = sc.nextInt();
        System.out.println("enter imaginary part of the first complex number:");
        int imaginary1 = sc.nextInt();
        Complex obj1 = new Complex(real1, imaginary1);

        System.out.println("enter real part of the second complex number:");
        int real2 = sc.nextInt();
        System.out.println("enter imaginary part of the second complex number:");
        int imaginary2 = sc.nextInt();
        Complex obj2 = new Complex(real2, imaginary2);

        obj1.add(obj2);
        obj1.diff(obj2);
        obj1.multiplication(obj2);
    }
    
}
