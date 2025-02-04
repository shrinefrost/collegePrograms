package week4;

/*Program 1: Write a Java program to identify the accessibility of a variable by means 
of different access specifiers within and outside the package. */



class demo {
    int defaultMember =10;
    public int publicMember = 30;
    protected int protectedMember = 40;
    private int privateMember = 50;

    public void privateAccessMember(){
        System.out.println("value of privateMember is: " + privateMember);
    }
}
public class program1  {

    int defaultMember =100;
    public int publicMember = 300;
    protected int protectedMember = 400;
    private int privateMember = 500;
    public void privateAccessMember(){
        System.out.println("value of privateMember is: " + privateMember);
    }

    public static void main(String[] args) {
        demo access = new demo();
        System.out.println("access public members: " + access.publicMember);
        System.out.println("access default members: " + access.defaultMember);
        System.out.println("access protected members: " + access.protectedMember);
       access.privateAccessMember();
    }

}


