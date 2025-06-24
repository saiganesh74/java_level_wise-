package level2;
import java.util.*;

public class max_element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();   // Read elements into array
        }

        int max = a[0];           // Initialize max once
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];       // Update max if current element is greater
            }
        }

        System.out.println(max);
        s.close();
    }
}
