import java.util.*;

public class Practic {  
    public static void  findPrime(int n){
        if(n<=1){
            System.out.println("Invalid Number");
           return;
        }
        
        int t = 1;
        for(int i=1; i<n; i++){
            if(n%i==0){
            t++;
        }
        }
         if(t==2){
            System.out.println(n+" is a prime number");
        }
        else{
            System.out.println(n+" is not a prime number");
        }
        

    }
      

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("So the answer is :-\n");
        findPrime(n);
       
    }
    
}
