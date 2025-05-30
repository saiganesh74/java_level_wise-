package level1;
import java.util.*;
public class Main {
    public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter your year");
            int year = s.nextInt();
            String res = ((year % 4 == 0)&& (year %100 != 0))?"YES its a leap year":(year% 400 == 0)? "Yes its a leap year " :"The entered isnt a leap year ";
            s.close();
            System.out.println(res);
        }
}
