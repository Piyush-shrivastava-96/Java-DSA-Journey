import java.util.*;

public class Practice {
    
        public static void findPrime(int n){
        for(int i=2; i<n; i++){
           if(n%i==0){
            System.out.println("it is a composite  number");
            return;
           }
        }
         System.out.println("it is a prime number");
        }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        findPrime(n);
        }
    
}
