package level2;
import java.util.*;

public class double_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int sum = 0;
        
        for (int i=0;i<n.length();i++){
            int digit = n.charAt(i)- '0';
            
            if(digit % 2 == 0){
                int doubled = digit * 2;
                sum += doubled % 10;
            }
            else {
                sum += digit;
            }
        }
        System.out.println(sum);
    }
}