package level2;
import java.util.*;
public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i= 0 ; i<a.length ; i++ ){
            a[i] = sc.nextInt();
             System.out.print(a[i]+" ");
        }
        sc.close();
    }
}
