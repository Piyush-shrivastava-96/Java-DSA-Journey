import java.util.*;

public class Practic {  
    // public static void findGcd(int n){
 
    

    // }

        public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0; 
    int b = 1;
    for(int i=1; i<=n; i++){
        System.out.print(b+" ");
        int next = b;
        b = a+b;
        a = next;
    }
    System.out.println();
    
    }

    
}
