import java.util.Scanner;

public class Mini_Project {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------------------------");
        System.out.println("------------------ WELCOME TO AI ATM -----------------");
        System.out.println("------------------------------------------------------\n");

        System.out.println("Please Insert your ATM card into the ATM Machine; \n");

        int pin = 8774;
        int balance = 100000;
        int choice;

        while (true) { 

        System.out.println("--------------------------- What would you like to do ? -----------------------------\n");

        System.out.println("Check Balance    :~  Enter (1) ");
        System.out.println("Withdraw Money   :~  Enter (2) ");
        System.out.println("Mini Statement   :~  Enter (3) ");
        System.out.println("Deposit Money    :~  Enter (4) ");
        System.out.println("Exit             :~  Enter (5) ");

        choice = sc.nextInt();

        System.out.println("Please Enter your 4-Digit ATM Pin; ");
        pin = sc.nextInt();

        if(pin != 8774) {
            System.out.println("Wrong Pin! Please Re-Start now.\n");
            continue;
        
        }
        System.out.println("\nPIN Verified! Processing your request.... \n");


        switch(choice) {
            case 1 : System.out.println("Your Currently Balnce;" +balance+ "\n\n");
            break;

            case 2 : System.out.println("Enter Amount To Withdraw RS; ");
            int amount = sc.nextInt();

            if(amount > balance) {
                System.out.println("Sorry! There is not enough money in the account;\n\n ");
            }

            else if (amount <= 0 ) {
                System.out.println("Sorry Invalid Amount! Please Re-Start Now.\n\n");
            }
            else {
                balance = balance - amount;
                System.out.println("Please Collect Your Cash; " +amount+  "\n\n");
                System.out.println("This is your remaining account balance now; " +balance+  "\n\n");
            }
            break;


            case 3 : 
            System.out.println("----------------------- Your MINI STATEMENT ---------------------");
            System.out.println("Petrol Pump pay:    ₹ 3000");
            System.out.println("kirana store pay:   ₹ 500");
            System.out.println("Self Withdrawl pay: ₹ 10,000");
            System.out.println("College pay fees:   ₹ 42,000");
            System.out.println("Your current balance; " +balance);
            break;


            case 4 : 
            System.out.println("Enter Amount to Deposit Money; RS");
            int deposit = sc.nextInt();

            if(deposit <= 0) {
                System.out.println("Invalid Amount! Please Re-Start now. \n\n");
            }
            else {
                balance = balance + deposit;
                System.out.println("Your deposit is successfully; " +deposit+  "\n\n");
                System.out.println("Your new update currently balance; " +balance+ "\n\n");
            }
            break;

            case 5 : System.out.println("Okay Sir/Madam, you can go out because you pressed exit number.\n\n");
            System.exit(0);

            default : System.out.println("Invalid Input! Please re-start now.\n\n");

        }
    }

        


        




        



    }
    
}
