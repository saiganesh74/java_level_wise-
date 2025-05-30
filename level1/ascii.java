package level1;
import java.util.*;
public class ascii {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the character value to convert ");;
        char ch = s.next().charAt(0);
        int res = ch ;
        System.out.println(res);
        s.close();
    }
}
