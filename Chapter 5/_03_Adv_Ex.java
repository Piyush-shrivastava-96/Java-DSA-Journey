import java.util.*;

public class _03_Adv_Ex {
    public static int findNpower(int x, int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result = result*x;
        }
        System.out.println(result);
        return result;
       
    }
    public static void main(String[] args){

    //     int positivecount = 0;
    //     int negativecount = 0;
    //     int zerocount = 0;
    //     while (true){
    //     Scanner sc = new Scanner(System.in);

    //     System.out.println("Please enter the first number :-");
    //     int a = sc.nextInt();
    //     System.out.println("Please enter the second number :-");
    //     int b = sc.nextInt();
    //     System.out.println("Please enter the third number :-");
    //     int c = sc.nextInt();

    //     if(a>0 ){
    //         positivecount++;
    //     }
    //     else if(a<0 ){
    //         negativecount++;
    //     }
    //     else{
    //         zerocount++;
    //     }

    //     if(b>0){
    //         positivecount++;
    //     }
    //     else if(b<0){
    //         negativecount++;
    //     }
    //     else{
    //         zerocount++;
    //     }

    //     if(c>0){
    //         positivecount++;
    //     }
    //     else if(c<0){
    //         negativecount++;
    //     }
    //     else{
    //         zerocount++;
    //     }
    //     System.out.println("So the positive numbers are count = "+positivecount);
    //     System.out.println("So the negative numbers are count = "+negativecount);
    //     System.out.println("So the zero numbers are count = "+zerocount);
        

    //     System.out.println("If you want to continue this, Press '1' & stop this, Press '0'");
    //     int d = sc.nextInt();
    //     if(d == 1){
    //         System.out.println("Okay! We can continue");
    //         continue;
    //     }
    //     else if( d == 0){
    //         System.out.println("Okay! we can stop");
    //         break;
    //     }
    //     else{
    //         System.out.println("Invalid input! Erorr");
    //     }

       
    // }
    Scanner gc = new Scanner(System.in);
    System.out.println("Please enter the (x) number");
    int v = gc.nextInt();
    System.out.println("Please enter the power of number (x*n)");
    int z = gc.nextInt();
    System.out.println("So the answer is :-");
    int ans = findNpower(v, z);
    
    

    

    
    
    }
}
