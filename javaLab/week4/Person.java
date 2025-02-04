package week4;
/*Program 3: Create a base class Person and two derived classes as Student and Teacher 
with their constructors and methods. Assume the student to be in the same package as 
that of Person and Teacher class to be in a different package. 
The inheritance hierarchy would appear as follows: 
a) Add methods “get” the instance variables in the Person class. These would 
consist of: getName, getAge, getGender. 
b) Add methods to “set” and “get” the instance variables in the Student class. 
These would consist of: getIdNum, getGPA, setIdNum. 
c) Write a Teacher class that extends the parent class Person */

 public class Person {
    public String message ;
    public String name;
    public int age;
    public String gender;
    public Person(){
        message = "I am person";
        name = "suraj";
        age = 22;
        gender = "male";

    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("name of student: "+ student.getName());
        System.out.println("Id of student: "+ student.getIdNum());
        System.out.println("gender of student: "+ student.getGender());
    }


}

class Student extends Person{
    public int idNum;
    public int gpa;
    Student(){
        idNum = 1;
        gpa = 9;
    }
    public int getIdNum() {
        return idNum;
    }

    public int getGpa() {
        return gpa;
    }
    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }
}


