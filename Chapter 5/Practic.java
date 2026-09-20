import java.util.*;

public class Practic {  
    // public static void find(int x, int n){
      
        
    // }
    
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    
    
    
    
   System.out.println("Enter the number of x");
   int x = sc.nextInt();
   System.out.println("Enter the power of n");
   int n = sc.nextInt();
   int result = 1;
   for(int i=1; i<=n; i++){
    result = result*x;
   }
   System.out.println(+x+" ki power " +n+ " ka result = " +result);

    

        
        
        
      

    
    }

    
}
