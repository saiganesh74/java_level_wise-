// You are given an array of integers. Your task is to reverse the first half and the second half of the array separately, then print the resulting array. • If the array has only one or two elements, just reverse the entire array.
package level2;
import java.util.*;

public class half{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];  
        //read elements 
        for(int i = 0; i < n; i++) {
            a[i]= in.nextInt();                 // 2 3 
                                                // 0 1 
        }
        //if array has more than 2 elements
        if(n > 2){
            // divide total array by 2 -1 to get the mid element 
            // printing first part in reverse order 
            for(int i= (n/2)-1 ; i >= 0 ; i-- ){
                System.out.print(a[i]+" ");
            }
            // printing second part in reverse order 
            for(int i = n-1 ; i>= n/2 ; i--){
                System.out.print(a[i]+" ");
            }
        }
        //if 2 or less elements are there 
        else if(n <= 2){
            for(int i = n-1 ; i>= 0 ; i--){
                System.out.print(a[i]+" ");  // reverse the entire array
            }
        }
        
}
}