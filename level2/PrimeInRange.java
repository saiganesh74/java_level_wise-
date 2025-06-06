package level2;
import java.util.Scanner;

public class PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();

        for (int i = L; i <= R; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
