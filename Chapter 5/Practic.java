import java.util.*;

public class Practic {  
    public static int findSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
        
        sum = sum+i;
      }
      
      return sum;
         
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("So the answer is -:");
        int ans = findSum(n);
        System.out.println(+ans);
       

    
    }

    
}
