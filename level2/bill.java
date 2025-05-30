package level2;
import java.util.*;
public class bill {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int units = s.nextInt();
        int amount = 0; 
        if(units <=100)
            amount = units*6;
        else if(units >100 && units <= 200)
            amount=100* 6 +(units-100)*8;
        else if(units >200 && units <= 300)
            amount=100 *6 + 100 * 8 + (units-200)*10;
        else if(units>300 && units<=400)
            amount = 100*6 + 100*8 + 100 * 10 +(units -300)*12;
        else 
            amount= 100*6 + 100*8 + 100*10 + 100*12 +(units-400)*14;
    
    System.out.println(amount);
    s.close();
    }
    
}
