package level2;
import java.util.*;;
public class leaderboard_spec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i = 0 ; i< n ; i++){ //input loop 
            arr[i] = sc.nextInt(); //input for the array 
        }
        int small = arr[n-1];
        for(int i = n-2 ; i >=0 ; i--){ // iteration from right side   21 19 18 22 17 14 15 3 1
            if(arr[i] > small){
                System.out.print(arr[i]+" ");
                small = arr[i];
            }
            
        }

    }
}
