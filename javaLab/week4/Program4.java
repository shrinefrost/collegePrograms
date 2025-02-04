package week4;

/*Program 4: Describe abstract class called Shape which has three subclasses say 
Triangle, Rectangle, Circle. Define one method area() in the abstract class and override 
this area() in these three subclasses to calculate for specific object i.e. area() of Triangle 
subclass should calculate area of triangle etc. Same should be for Rectangle and Circle.  */
abstract class Shape {
    abstract double area();


}

class Triangle extends Shape {
    int height;
    int base;
    Triangle(int height,int base){
        this.height = height;
        this.base = base;
    }
    public double area() {
        return 0.5*height*base;
    }

}

class Rectangle extends Shape {
    int length;
    int breath;
    Rectangle(int length,int breath){
        this.length = length;
        this.breath = breath;
    }
    public double area() {
        return length*breath;
    }
}

class Circle extends Shape{
    int radius;
    Circle(int radius){
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}
public class Program4 {

    public static void main(String[] args) {
        System.out.println("triangle");
        Triangle triangle = new Triangle(12, 23);
        System.out.println(triangle.area());

        System.out.println("Rectangle");
        Rectangle Rect = new Rectangle(12, 23);
        System.out.println(Rect.area());

        System.out.println("circle");
        Circle cir = new Circle(12);
        System.out.println(cir.area());
    }
    
}
