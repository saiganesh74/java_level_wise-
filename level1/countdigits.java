package level1;
import java.util.Scanner;
public class countdigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        int count = 0 ;
        if (input == 0) {
            count = 1;
        }
    else{
            while(input > 0){
                count++;
                input = input/10;
            }
                            System.out.println(count);

        }
        s.close();
    }
}
