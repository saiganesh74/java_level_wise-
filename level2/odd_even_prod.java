//You are given an array of integers. For each number in the array: 1. If the number is even → print 1.
// If the number is odd → Find the product of its digits. If the product is odd, print 0. If the product is even, print the product.
package level2; 
import java.util.*;
public class odd_even_prod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // read no of elements 
        int n = in.nextInt();
        int[] a= new int[n];
        
        //read elements 
        for(int i = 0 ; i<n ; i++){
            a[i]= in.nextInt();
        }
        //check whether the numbers are even or odd 
        for(int i= 0 ; i< n ; i++){   // if even print 1 
            if(a[i]%2 == 0){            // even number
                System.out.print("1"+" ");
            }
            // if odd find the product of digits
            else{   //odd number
                // find product of digits
                int product = 1;
                int num = a[i];
                while(num > 0) {
                    int digit = num % 10;
                    product *= digit;
                    num /= 10;
                }
                if(product % 2 == 0) {
                    System.out.print(product+" ");
                } else {
                    System.out.print("0"+ " ");
                }
            }

        }
    }
}