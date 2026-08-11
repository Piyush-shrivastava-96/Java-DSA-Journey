import java.util.Scanner;

public class _03_Do_While_loop {
    public static void main(String[] args) {
        
        
        int i = 0;
        do {
            System.out.println("count number; " +i);
            i++;
        } while(i<=10); 
        System.out.println("Counst number over!");

        int d = 10;
        do{
            System.out.println(d);
            d--;
        } while(d>=1);
        System.out.println("Loop Over!");

        int q = 1;
        do{
            if(q%3 == 0) {
                System.out.println(q);
            
            } 
            q++;
        } while(q<=30);
        System.out.println("Loop Is Over!");

        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("TEST; ");
        do{
            System.out.println("Print any number (you entered), and press 0 to stop (Loop is stop); ");
            num = sc.nextInt();

            if(num != 0) {
                System.out.println("You Entered Bro ! Thank you to press. " +num);
            }
        } while(num != 0 );

        
        System.out.println("Loop is Over! Because you pressed 0 okay Thankyou");

        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("\n---START TASK---\n");

        while (true) {
            System.out.println("Enter any number (you enter), and Enter 0 stop(Loop is Over!)");
            n = tc.nextInt();

            if(n == 0) {
                System.out.println("Loop is Over!,Because you pressed " +n);
                break;
            }
            System.out.println("You Entered ! Because you pressed; " +n);
        }

        
        
    }
    
}
