import java.util.Scanner;
class Bank {
    private int accountCounter;
    private int[] bankAcconts;
    private double[] bankBalances;
    private final int numAcconts = 10;

    private int accountNumber;
    private double accountBalance;
    private String accountHolderName;
    private String accountType;
    
    public Bank() {
        bankAcconts = new int[numAcconts];
        bankBalances = new double[numAcconts];
        accountCounter = 0;
    }

    public void createAccount(int accountNumber, double accountBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {}
    public void withdraw(double amount) {}
    public void displayAccountDetails() {}


    public void displayMainDashBoard() {
        System.out.println("========== Welcome to the Bank Dashboard ==========");
        System.out.println("------------------------------------------------------");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Display Account Details");
        System.out.println("5. Exit");
        System.out.println("------------------------------------------------------");

    }
}

//Controller Class defined for control the process of the system.
class ProcessControler {
    Scanner scanner = new Scanner(System.in);
    public int initialProcessHandling() {
        System.out.println("Enter Process Number :");
        int processNumber = scanner.nextInt();
        scanner.nextLine();
        return processNumber;
    }

    public int initialExitProcessHandling() {
        System.out.println("Enter Process Number :");
        int processNumber = scanner.nextInt();
        scanner.nextLine();
        return processNumber;
    }

    public int runningProcessHandling() {
        System.out.println("Enter Process Number :");
        int processNumber = scanner.nextInt();
        scanner.nextLine();
        return processNumber;
    }
}

//Call the BankingManagementSystem
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
                    bankSystem.displayMainDashBoard();
                    int runningProcessID = systemProcessControler.runningProcessHandling();
                break;
                case 2:
                    System.out.println("Do you want to exit the system?");
                    System.out.println("Press 1 to YES or 2 to NO");
                    int exitProcessID = systemProcessControler.initialExitProcessHandling();

                    switch(exitProcessID) {
                        case 1:
                            System.out.println("Exiting the system successfully !!");
                            runningSystem = false;
                        break;
                        case 2:
                            System.out.println("System is still running !!");
                        break;
                        default:
                            System.out.println("Invalid Input !!");
                        
                    }
                break;
                default:
                    System.out.println("Invalid Process Number");

        }
    }
}
}
