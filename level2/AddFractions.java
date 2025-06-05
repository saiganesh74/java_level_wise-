package level2;
import java.util.Scanner;

public class AddFractions {
    
    // Function to calculate GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();  // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int num1 = sc.nextInt();
            int den1 = sc.nextInt();
            int num2 = sc.nextInt();
            int den2 = sc.nextInt();
            
            // Add the fractions: (num1/den1 + num2/den2)
            int numerator = num1 * den2 + num2 * den1;
            int denominator = den1 * den2;
            
            // Reduce the fraction
            int gcdVal = gcd(numerator, denominator);
            numerator /= gcdVal;
            denominator /= gcdVal;
            
            System.out.println(numerator + "/" + denominator);
        }

        sc.close();
    }
}
