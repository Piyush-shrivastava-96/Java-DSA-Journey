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


    public static int findPrime(int n){
        if(n<1){
            return 0;
        }
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner tc = new Scanner(System.in);

        System.out.println("Please enter the number which you want to know whether it is prime or composite :- ");
        int v = tc.nextInt();

        int answer = findPrime( v);
        if(answer == 1){
            System.out.println(v+" is a prime number");
        }
        else{
            System.out.println(v+" is not a prime number, this is a composite number");
        }
    }

    
    
    
    
}
