/* Write a Java program to create a class Rectangle with data members length 
and breadth. Create a method area () that finds the area of the rectangle. Use the 
constructor(s) to assign value to data members. Use “this” in a parameterized 
constructor. */

package week3;
class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breath){
        this.length = length;
        this.breadth = breath;
    }

    public void area(){
        int rectArea =length*breadth;
        System.out.println("area of rectangle is: "  + rectArea);
    }
    
}

public class InnerRectangle {
    public static void main(String[] args) {
        Rectangle rectArea = new Rectangle(10, 20);
        rectArea.area();
    }
    
}

