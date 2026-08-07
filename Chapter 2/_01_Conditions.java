import java.util.Scanner;
public class _01_Conditions {
    public static void main(String[] args) {

        Scanner ac = new Scanner(System.in);

        System.out.println("Enter your age; ");
        int a = ac.nextInt();
        
        if (a >= 18) {
            System.out.println("You are a Adult");
        }
        else {
            System.out.println("You are a not Adult, You are child.");
        }

        System.out.println("\nSecond use of if else; ");

        System.out.println("Enter the first number; ");
        int s = ac.nextInt();

        System.out.println("Enter the second number; ");
        int u = ac.nextInt();

        if (s == u) {
            System.out.println("Your numbers are Equal; ");
        }
        else if (s < u) {
                System.out.println("Your first number is less than tha second number.");
            }
            else {
                System.out.println("Your first number is greater than tha second number");
            }
         }
        }
    
