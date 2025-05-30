package level2;
import java.util.*;
public class alphatype {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);

        if(Character.isLowerCase(c)){
            System.out.println("Lowercase Alphabet");
        }
        else if(Character.isUpperCase(c)){
            System.out.println("Uppercase Alphabet");
        }
        else if(Character.isDigit(c)){
            System.out.println("Number");
        }
        else{
            System.out.println("Special Character");
        }
    s.close();
    }
}
