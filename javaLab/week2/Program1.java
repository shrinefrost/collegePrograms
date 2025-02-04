package week2;
import java.util.*;
/*program 1: Write a Java program to identify the symbols of expression given by the 
user is the operator or of which datatype.  */
import java.util.Scanner;

public class Program1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.println("Enter an expression: ");
        String expression = scanner.nextLine();
        
        
        for (int i = 0; i < expression.length(); i++) {
            char symbol = expression.charAt(i);
            
          
            if (isOperator(symbol)) {
                System.out.println(symbol + " is an operator.");
            }
            
            else if (Character.isDigit(symbol)) {
                System.out.println(symbol + " is a digit.");
            }
            
            else if (Character.isLetter(symbol)) {
                System.out.println(symbol + " is a letter (part of a data type).");
            }
            
            else {
                System.out.println(symbol + " is a special character or symbol.");
            }
        }
        
        scanner.close();
    }

    
    public static boolean isOperator(char symbol) {
        char[] operators = {'+', '-', '*', '/', '%', '=', '>', '<', '&', '|', '!', '^'};
        for (char op : operators) {
            if (symbol == op) {
                return true;
            }
        }
        return false;
    }
}

