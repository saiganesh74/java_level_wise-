package level2;
import java.util.*;;
public class fibonacci {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int a =0 , b=1 ;
    for(int i =0 ; i< n ; i++){
        System.out.println(a+" ");
        int nw = a+b ;
        a = b ;
        b= nw;
    }
    s.close();
}
}