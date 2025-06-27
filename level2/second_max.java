package level2;
import java.util.*;

public class second_max {
   public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt(); // number of elements
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        Arrays.sort(a); // sort in ascending order

        int secondMax = -1;
        boolean found = false;

        for (int i = n - 2; i >= 0; i--) {
            if (a[i] != a[n - 1]) {
                secondMax = a[i];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(secondMax);
        } else {
            System.out.println("No Second Max");
        }
    }
}