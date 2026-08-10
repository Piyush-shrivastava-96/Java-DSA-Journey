import java.util.Scanner;

public class _03_Do_While_loop {
    public static void main(String[] args) {
        
        
        // int i = 0;
        // do {
        //     System.out.println("count number; " +i);
        //     i++;
        // } while(i<=10); 
        // System.out.println("Counst number over!");

        // int i = 10;
        // do{
        //     System.out.println(i);
        //     i--;
        // } while(i>=1);
        // System.out.println("Loop Over!");

        int i = 1;
        do{
            if(i%3 == 0) {
                System.out.println(i);
            
            } 
            i++;
        } while(i<=30);
        System.out.println("Loop Is Over!");
    }
    
}
