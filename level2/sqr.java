package level2;
import java.util.Scanner;;
public class sqr {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n =s.nextInt();
        int count = (int)Math.sqrt(n-1);
        System.out.println(count);
    s.close();
    }
}
