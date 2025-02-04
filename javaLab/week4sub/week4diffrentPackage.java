package week4sub;
import week4.program1;

class week4SubDemo extends program1 {

}

public class week4diffrentPackage   {
    public static void main(String[] args) {
        week4SubDemo access = new week4SubDemo();
        System.out.println("access public members: " + access.publicMember);
        //System.out.println("access default members: " + access.defaultMember);
        //System.out.println("access protected members: " + access.protectedMember);
       access.privateAccessMember();
    }
}
