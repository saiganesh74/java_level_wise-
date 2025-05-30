package level2;
import java.util.*;
public class countofvd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String ip  = s.nextLine();
        int lv = 0, uv = 0 , lc =0 , uc = 0 , d=0 , sp=0,sc =0 ;
        for (int i =0 ; i<ip.length(); i++){
            char c = ip.charAt(i);
            if(c == 'a'||c =='e'||c=='i'||c=='o'||c=='u'){
                lv++;
            }
            else if(c == 'A'||c =='E'||c=='I'||c=='O'||c=='U'){
                uv++;
            }
            else if(Character.isLowerCase(c)){
                lc++;
            }
            else if(Character.isUpperCase(c)){
                uc++;
            }
            else if(Character.isDigit(c)){
                d++;
            }
            else if(c==' '){
                sp++;
            }
            else{
                sc++;
            }
        }
        System.out.println(lv);
        System.out.println(uv);
        System.out.println(lc);
        System.out.println(uc);
        System.out.println(d);
        System.out.println(sc);
        System.out.println(sp);
        s.close();
        }

}
