package level1;
import java.util.*;
public class big3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int res = (a>b && a>c)?a:(b>a && b>c)?b:c;
        System.out.println(res);
        s.close();
    }
}
