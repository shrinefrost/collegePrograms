package week1;
class Substrings {
    String data = new String("CODING");

    void divider(){
                int length = data.length();
                
                for (int i = 0; i < length; i++) {
                    for (int j = i + 1; j <= length; j++) {
                        System.out.println(data.substring(i, j));
                    }
                }
    }
}


public class program9 {
    public static void main(String[] args) {
        Substrings s = new Substrings();
        s.divider();
    }
}
