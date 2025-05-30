package level1;
import java.util.Scanner;
public class charsascii {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String n = s.next();
        for(int i = 0 ; i< n.length();i++){
            char ch = n.charAt(i);
            int a = ch ;
            System.out.print(a+" ");
            s.close();
        }
    }
}
