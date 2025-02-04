package week4;
import week4.program1;

class SubDemo extends demo {

}


public class sunprogram1 {
    public static void main(String[] args) {
        SubDemo access = new SubDemo();
        System.out.println("access public members: " + access.publicMember);
        System.out.println("access default members: " + access.defaultMember);
        System.out.println("access protected members: " + access.protectedMember);
       access.privateAccessMember();
       //access.privateMember; private member are not accessable here
       
    }
}
