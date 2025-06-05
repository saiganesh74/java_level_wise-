package level2;
import java.util.*;
public class kth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();
        long power = (long) Math.pow(a, b);
        String powerStr = Long.toString(power);
        char kthDigit = powerStr.charAt(powerStr.length() - k);
        System.out.println(kthDigit);
        sc.close();
    }
}