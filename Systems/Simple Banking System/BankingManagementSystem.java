import java.util.Scanner;
class Bank {
    private int accountNumber;
    private double accountBalance;
    private String accountHolderName;

    public void createAccount(int accountNumber, double accountBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {}
    public void withdraw(double amount) {}
    public void displayAccountDetails() {}


    public void displayMainDashBoard() {
        System.out.println("Welcome to the Bank Dashboard");
    }
}
class ProcessControler {
    Scanner scanner = new Scanner(System.in);
    public int initialProcessHandling() {
        System.out.println("Enter Process Number :");
        int processNumber = scanner.nextInt();
        scanner.nextLine();
        return processNumber;
    }
}
public class BankingManagementSystem {
    public static void main(String[] args) {
        //Create Bank Object
        Bank bankSystem = new Bank();
        ProcessControler systemProcessControler = new ProcessControler();
        boolean runningSystem = true;

        while(runningSystem) {
            System.out.println("=====> Banking Management System <=====");
            System.out.println("----------------------------------------------");
            System.out.println("\t1.Go to the Main Dashboard");
            System.out.println("\t2.Exit");
            System.out.println("----------------------------------------------");
            int initialProcessID = systemProcessControler.initialProcessHandling();
            switch (initialProcessID) {
                case 1:
                break;
                case 2:
                    System.out.println("Do you want to exit the system?");
                    System.out.println("Press 1 to YES or 2 to NO");
                    int exitProcessID = systemProcessControler.initialProcessHandling();

                    runningSystem = false;
                break;
                default:
                    System.out.println("Invalid Process Number");

        }
    }
}
}
