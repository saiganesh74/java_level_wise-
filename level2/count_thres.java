package level2;
import java.util.*;
public class count_thres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int t = sc.nextInt();

        int count = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            int digit = ch - '0';

            if (digit > t) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}