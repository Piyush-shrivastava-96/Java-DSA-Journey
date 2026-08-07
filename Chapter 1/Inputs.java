import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Please Enter tha first fav. number;");
        int m = tc.nextInt();

        System.out.println("Please Enter the second fav. number;");
        int n = tc.nextInt();

        int add = m+n;
        
        System.out.println("Your number is addition; " +add );
        System.out.println("Thank you \uD83E\uDD86 ");
        
        Scanner pc = new Scanner(System.in);

        int r = pc.nextInt();
        int t = pc.nextInt();
        int summ = r+t;

        System.out.println("Addition; The Answer is; " +summ);

        System.out.println("\n");

        System.out.println("Please enter the Redius of a Circle;");

        double c = pc.nextDouble();
        double area = 3.14*c*c;

        System.out.println("The Answer is Area of Circle; " +area);

        System.out.println("Please enter the Redius of a Circle; ");

        double k = pc.nextDouble();
        double circumference = 2*3.14*k;

        System.out.println("So the answer is circumference of a Circle;" +circumference);
}
}