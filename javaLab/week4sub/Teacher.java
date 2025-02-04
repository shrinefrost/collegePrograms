package week4sub;
import week4.Person;

public class Teacher extends Person {
    String msg;
     Teacher(){
        super();
        msg="teacher class object is created";
        System.out.println(msg);

    }
    public static void main(String[] args) {
        Teacher teach = new Teacher();
        System.out.println(teach.getName());
        System.out.println(teach.getAge());
        System.out.println(teach.getGender());
        

    }
}
