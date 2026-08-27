import java.util.Scanner;


public class Function{
    // public static int calculateSum(int number1 , int number2){
    //     int sum = number1+number2;
    //     return sum;
    // }

    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Please Enter The First Number");
    //     int a = sc.nextInt();

    //     System.out.println("Please Enter The Second Number");
    //     int b = sc.nextInt();

    //     int sum = a+b;

        // int ans = calculateSum(a, b);

    //     System.out.println("Your 2 Numbers sum are = " +sum);


    // }



    // public static int findFactorial(int n){
    //     int fact = 1;
    //     for(int i =1; i<=n; i++){
    //     fact = fact*i;
    //     }
    //     return fact;
    // }
    
    // public static void main(String[] args){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Please enter the first number which should have the factorial = ");
    //     int a = sc.nextInt();

        
    //     int ans = findFactorial(a);

    //     System.out.println(a + " Factorial So the answer is = " +ans);

    // }

    public static void main(String[] args){
        int n = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number; ");
        int s = sc.nextInt();
        for(int i=1; i<=n; i++){
        if(n%2==0){
            System.out.println("This is a prime number;" );
        }
        else{
            System.out.println("This is not a prime number; ");
        }
    }
    
    }
    
}
