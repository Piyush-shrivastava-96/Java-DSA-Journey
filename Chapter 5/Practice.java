import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("Enter the number only (1 or 0):");
        int t = sc.nextInt();
        if(t==1){
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter your marks :-");
            int marks = sc1.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("Excellent marks");
            }
            else if(marks>=75 && marks<90){
                System.out.println("Good marks");
            }
            else if(marks>=50 && marks<75){
                System.out.println("Average marks");
            }
            else if(marks>=27 && marks<50){
                System.out.println("Below Average marks");
            }
            else if(marks>=0 && marks<27){
                System.out.println("Your are fail");
            }
            else{
                System.out.println("Invalid Marks");
            }
        }
        else{
            if(t==0){
                System.out.println("Okay, we are stopping the program");
                break;
            
            }
            else{
                System.out.println("Invalid input");
            }
        }
        
    }while(true);
    }
    
}
