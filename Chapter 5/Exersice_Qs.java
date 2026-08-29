import java.util.*;
public class Exersice_Qs {
    public static void printAverage(int n, int m, int o){
        int avg = (n+m+o)/3;
        System.out.println(avg);
    }

    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter tha number:-");
         int a = sc.nextInt();
         System.out.println("Enter tha Second number");
         int b = sc.nextInt();
         System.out.println("Enter the third number");
         int c = sc.nextInt();
         
         printAverage(a,b,c);
         
    }
    
}
