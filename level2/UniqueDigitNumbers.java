import java.util.Scanner;

public class UniqueDigitNumbers {
    public static boolean hasUniqueDigits(int num) {
        boolean[] digits = new boolean[10]; 
        while (num > 0) {
            int digit = num % 10;
            if (digits[digit]) {
                return false; 
            }
            digits[digit] = true;
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int L = sc.nextInt();
        int R = sc.nextInt();

        for (int i = L; i <= R; i++) {
            if (hasUniqueDigits(i)) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
