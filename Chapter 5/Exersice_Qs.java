import java.util.*;
public class Exersice_Qs {
    public static void printAverage(int n, int m, int o){
        int avg = (n+m+o)/3;
        System.out.println(avg);
    }

    public static void oddSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2!=0){
                sum = sum + i;
            }
        }
        System.out.println("So the sum of odd numbers are = "+sum);
    }

    public static int findGreater(int f, int g){
        if(f>g){
            System.out.println(f+" is greater " +g+ " is less");
            return f;
        }
        else if(f == g){
            System.out.println(f+ " And " +g+ " Both Numbers Are Equal!" );
            return f;
        }
        else{ 
            System.out.println(g+" is greater " +g+ " is less");
            return g;
        }
    }


    public static double findCircumfrence(double r){
        double p = 2*3.14*r;
        return p;

    }

    public static int findAge(int n){
        if(n<18){
            System.out.println("You can not give the vote because you are not an adult");
            return 0;
        }
        else if (n >= 18 && n <= 100){
            System.out.println("You can give the vote ");
            return 1;
        }
        else{
            System.out.println("Invalid Age! Error");
        }
        return 0;
    }

    public static void main(String[] args){
        //  Scanner sc = new Scanner(System.in);
        //  System.out.println("Enter tha number:-");
        //  int a = sc.nextInt();
        //  System.out.println("Enter tha Second number");
        //  int b = sc.nextInt();
        //  System.out.println("Enter the third number");
        //  int c = sc.nextInt();
         
        //  printAverage(a,b,c);
         
        // System.out.println("\n--------------------------------------------------------\n");

        // Scanner tc = new Scanner(System.in);
        // System.out.println("Enter the number up to which you want the sum of odd numbers");
        // int t = tc.nextInt();

        // oddSum(t);


        // System.out.println("\n-----------------------------------------------------------\n");

        // Scanner gc = new Scanner(System.in);
        // System.out.println("Please enter the number ");
        // int h = gc.nextInt();

        // System.out.println("Please enter the second number");
        // int l = gc.nextInt();

        // int res = findGreater(h, l);

        // System.out.println("\n--------------------------------------------------------------------\n");
        // Scanner hc = new Scanner(System.in);
        // System.out.println("Enter the redius which you want to have the circumfrence of the circle.");
        // double d = hc.nextDouble();
        // double resultt = findCircumfrence(d);
        // System.out.println(resultt);

        System.out.println("\n----------------------------------------------------------------------\n");
        Scanner bc = new Scanner(System.in);
        System.out.println("Please Enter Your Age because we need know whether you are an adult or not");
        int y = bc.nextInt();
        findAge(y);



       

    

    
    }
    
}
