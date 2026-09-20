import java.util.*;

public class Practic {  
    // public static void findGcd(int a, int b){
    //     int gcd = 1; 
    //    for(int i=1; i<=a && i<=b; i++){
    //     if(a%i == 0 && b%i == 0){
    //         gcd = i;

    //     }
    //    }
    //    System.out.println("GCD Number is = " +gcd);
        
    // }
    
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    while(n1 != n2){
    if(n1 > n2){
        n1 = n1 - n2;
    }
    else{
        n2 = n2 - n1;
    }
}
System.out.println(n2);
//    System.out.println("Enter the number of a");
//    int a = sc.nextInt();
//    System.out.println("Enter the power of b");
//    int b = sc.nextInt();

//    findGcd(a, b);
  

        
        
        
      

    
    }

    
}
