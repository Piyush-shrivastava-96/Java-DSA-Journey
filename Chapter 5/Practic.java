import java.util.*;

public class Practic {  
    public static int findGreater(int n, int m){
        if(n>m){
            return n;
        }
        else if(n<m){
            return m;
        }
       
        else{
            
            return n;
            
        }
         
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the second number");
        int m = sc.nextInt();
        int answer = findGreater(n, m);
        if(n==m){
            System.out.println("Both Numbers are Equal");
        }
        else{
        System.out.println("So the greater is -: " +answer);
        }


    
    }

    
}
