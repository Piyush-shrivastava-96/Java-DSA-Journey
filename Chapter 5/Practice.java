import java.util.*;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the number\nWhat do you want ? This number will give you information about the month\nPlease enter the number only from 1 to 12");
        int op = sc.nextInt();

        switch (op) {
            case 1 : System.out.println("Number "+op+ " Represents By - 'January'");
            break;
            case 2 : System.out.println("Number "+op+ " Represents By - 'February'");
            break;
            case 3 : System.out.println("Number "+op+ " Represents By - 'March'");
            break;
            case 4 : System.out.println("Number "+op+ " Represents By - 'April'");
            break;
            case 5 : System.out.println("Number "+op+ " Represents By - 'May'");
            break;
            case 6 : System.out.println("Number "+op+ " Represents By - 'June'");
            break;
            case 7 : System.out.println("Number "+op+ " Represents By - 'July'");
            break;
            case 8 : System.out.println("Number "+op+ " Represents By - 'August'");
            break;
            case 9 : System.out.println("Number "+op+ " Represents By - 'September'");
            break;
            case 10 : System.out.println("Number "+op+ " Represents By - 'October'");
            break;
            case 11 : System.out.println("Number "+op+ " Represents By - 'November'");
            break;
            case 12 : System.out.println("Number "+op+ " Represents By- 'December'");
            break;
            default : System.out.println("Invalid Input, Error!");
        }
        
        
        
        
    }
    
}
