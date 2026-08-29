import java.util.Scanner;


public class Function{
    public static int calculateSum(int number1 , int number2){
        int sum = number1+number2;
        return sum;
    }

    public static void main(String[] args){
        Scanner ac = new Scanner(System.in);

        System.out.println("Please Enter The First Number");
        int a = ac.nextInt();

        System.out.println("Please Enter The Second Number");
        int b = ac.nextInt();

        int sum = a+b;

        int result = calculateSum(a, b);

        System.out.println("Your 2 Numbers sum are = " +sum);

        System.out.println("\n----------------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the first number which should have the factorial = ");
        int l = sc.nextInt();
        
        int ans = findFactorial(l);

        System.out.println(l + " Factorial So the answer is = " +ans);

        System.out.println("\n-----------------------------------------------------------------\n");


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


        System.out.println("\n------------------------------------------------------------\n");

        Scanner pc = new Scanner(System.in);

        System.out.println("Please Enter The Number Which You Want To Know Wheter It Is Even or Odd. ");
        int x = pc.nextInt();

        int A = findEven(x);
        if( A == 1){ 
            System.out.println(x + " is a odd number");

        }
        else{
            System.out.println(x + " is a even number");
        }

        System.out.println("\n--------------------------------------------------------------------\n");

        Scanner oc = new Scanner(System.in);
        System.out.println("Please Enter The Number Whose Multiplication Table You Want to Know ");

        int c = oc.nextInt();
        System.out.println("\nSo The Answer Is :- \n");
        findTable(c);
    }

    
    public static int findFactorial(int n){
        int fact = 1;
        for(int i =1; i<=n; i++){
        fact = fact*i;
        }
        return fact;
    }
        
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

    public static int findEven(int n){
        if(n%2==0){
            return 0;
        }
        
        return 1;
    }
    
    public static void findTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n*i);
        }
    }
   
    
    
    
}
