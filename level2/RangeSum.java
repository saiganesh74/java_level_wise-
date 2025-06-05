import java.util.Scanner;

public class RangeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt();
        int R = sc.nextInt();
        int sum = 0;

        for (int i = L; i <= R; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
