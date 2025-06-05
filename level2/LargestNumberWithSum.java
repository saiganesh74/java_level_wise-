
package level2;
import java.util.Scanner;

public class LargestNumberWithSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of digits
        int s = sc.nextInt();  // Desired sum

        if ((s == 0 && n > 1) || s > 9 * n) {
            System.out.println("-1");
            return;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (s >= 9) {
                result.append(9);
                s -= 9;
            } else {
                result.append(s);
                s = 0;
            }
        }

        System.out.println(result.toString());
        sc.close();
    }
}
