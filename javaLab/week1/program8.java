package week1;
class Palindrome {
    int num;
    int reversedNum=0;
    Palindrome(int num){
        this.num = num;
    }

    int isPalindrome(int temp) {
        if (temp==0) {
            return 1;
        }
        reversedNum = reversedNum*10 + temp%10;
        temp =temp/10;

        if(isPalindrome(temp)==1){
            if (reversedNum ==num) {
                return 1;
            }
            else{
                return 0;
            }
        }
        return 0;
        
    }
}


public class program8 {
    public static void main(String[] args) {
        Palindrome pd = new Palindrome(121);
        int result = pd.isPalindrome(pd.num);

        if (result==1)System.err.println("given number is a palindrome.");
        else System.out.println("given number is not a palindrome.");
    }
}
