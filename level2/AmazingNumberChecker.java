package level2;
import java.util.Scanner;

public class AmazingNumberChecker {
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
    public static boolean isAmazing(int N) {
        int root = (int) Math.sqrt(N);
        return (root * root == N) && isPrime(root);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if (isAmazing(N)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
