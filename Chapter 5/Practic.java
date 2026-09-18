import java.util.*;

public class Practic {  
    // public static void find(int n){
       
        
    // }
    
    public static void main(String[] args){
   
    Scanner sc = new Scanner(System.in);
    int positive = 0;
    int minus = 0;
    int zero = 0; 
    while (true){
    System.out.println("Enter the number");
    int number = sc.nextInt();
    if(number > 0){
        positive++;
    }
    else if(number < 0){
        minus--;
    }
    else if(number == 0){
        zero++;
    }

    System.out.println("Positive numbers are total = " +positive);
    System.out.println("Minus numbers are total = " +minus);
    System.out.println("Zero numbers are total = " +zero);

    System.out.println("you want to continue this game press '1' and '0' ");
    int press = sc.nextInt();
    if(press == 1){
        System.out.println("Okay we are continue this game ");
    }
    else if(press == 0){
        System.out.println("Okay We are stop");
        break;
    }
    else{
        System.out.println("Invalid input!");
        break;
    }
}
        
        
        
      

    
    }

    
}
