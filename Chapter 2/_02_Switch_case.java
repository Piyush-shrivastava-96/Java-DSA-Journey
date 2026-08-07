import java.util.Scanner;

public class _02_Switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n                       1.Use of Switch Case;--~~");
        System.out.println("Enter the one number only; ");
        int b = sc.nextInt();

        switch(b) {
            case 1 : System.out.println("Sunday");
            break;
            case 2 : System.out.println("Monday");
            break;
            case 3 : System.out.println("Tuesday");
            break;
            case 4 : System.out.println("Wednesday");
            break;
            case 5 : System.out.println("Thursday");
            break;
            case 6 : System.out.println("Friday");
            break;
            case 7 : System.out.println("Saturday");
            break;
            default : System.out.println("Invalid Input! Please only enter the numbers from 1 to 7\nThank you ");
        }

        System.out.println("\n                          2. Use of Switch Case;--~~");

        Scanner tc = new Scanner(System.in);


        System.out.println("Please, tell me the color of tha traffic light so i can tell you what to do --~~");
        String t = tc.nextLine();

        switch(t) {
            case "red" : System.out.println("So now you have to 'Stop'! ");
            break;
            case"yellow" : System.out.println("So now you have to just 'Wait'!");
            break;
            case "green" : System.out.println("So now you have to 'Go,Go,Go'");
            break;
            default : System.out.println("Invalid Input! Please Enter only red, yellow, green.\nThank you");

        
        }

        System.out.println("\n                          3. Use of Switch Case;--~~");

        Scanner pc = new Scanner(System.in);

        System.out.println("Plese Enter the first number; ");
        int l = pc.nextInt();

        System.out.println("Please Enter the second number; ");
        int v = pc.nextInt();

        System.out.println("Which of these do you want to do:-- '+', '-', '/', '*', '%' ");
        char m = pc.next().charAt(0);

        switch(m) {
            case '+' : System.out.println("Addition - The Answer is = " +(l + v));
            break;
            case '-' : System.out.println("Subtraction - The Answer is = " +(l - v));
            break;
            case '/' : System.out.println("Division - The Answer is = " +(l / v));
            break;
            case '*' : System.out.println("Multiplication - The Answer is = " +(l * v));
            break;
            case '%' : System.out.println("Modulo - The Answer is = " +(l % v));
            break;
            default : System.out.println("Invalid Input! Please Enter only :-- '+', '-', '/', '*', '%'\nThank you");
        
        }


        



    }
    
}
