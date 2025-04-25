import java.util.Scanner;

public class Main {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Declare variables

        double balance = 0;
        boolean isRunning = true;
        int choice;

        while (isRunning){
            //Display menu
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1- Show balance");
            System.out.println("2- Deposit");
            System.out.println("3- Withdraw");
            System.out.println("4- Exit");
            System.out.println("***************");

            //Get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid choice!");
            }
        }
        //Exit message
        System.out.println("***************************");
        System.out.println("Thank you! Have a nice day!");
        System.out.println("***************************");

        scanner.close();
    }

    static void showBalance(double balance){
        //showBalance()
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        //deposit()
        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can`t be negative!");
            return 0;
        }
        else {
            return amount;
        }

    }
    static double withdraw(double balance){
        //withdraw()
        double amount;

        System.out.println("Enter the amount to be withdrawn: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds!");
        } else if (amount < 0) {
            System.out.println("Amount can`t be negative!");
        }
        else{
            return amount;
        }
        return 0;
    }

}
