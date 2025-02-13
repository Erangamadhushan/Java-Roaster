import java.util.Scanner;

//declare global variables
class GlobalVariable {
    public static int accountCounter = 0;
}
class Variables {
    //Default Data Structure in our Banking System
    public int[] bankAcconts;
    public double[] bankBalances;
    public int[] bankPin;
    public String[] accountType;
    public final int numAcconts = 10;

    //This variables are used for validate userRegisteration and relavent process
    public String[] userIDCardDetails;
    public String[] userNameDetails;

    
}

class Bank extends Variables{
    public Bank() {
        bankAcconts = new int[numAcconts];
        bankBalances = new double[numAcconts];
        userIDCardDetails = new String[numAcconts];
        userNameDetails = new String[numAcconts];
        accountType = new String[numAcconts];
        bankPin = new int[numAcconts];
    }

}

//Controller Class defined for control the process of the system.
class ProcessControler extends Bank{
    public void deposit(double amount, int i) {
        bankBalances[i] += amount;
        System.out.println("Deposit Successful");
    }
    public void withdraw(double amount) {}
    public void displayAccountDetails() {}
    Scanner scanner = new Scanner(System.in);

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

    public void userRegisterationProcess() {
        System.out.println("Enter Your ID Card Number here :");
        String idCardNumber = scanner.nextLine();
        System.out.println("Enter Your Name here :");
        String accountHolderName = scanner.nextLine();
        for(int i = 0; i <= GlobalVariable.accountCounter;i++) {
            if(userIDCardDetails[i].equalsIgnoreCase(idCardNumber) && userNameDetails[i].equalsIgnoreCase(accountHolderName)) {
                System.out.println("Account Already Exist");
                return;
            }
        }
        System.out.println("Enter Your PIN Number here :");
        int pinNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Your Account Type :");
        String accountTypeName = scanner.nextLine();
        System.out.println("Enter Your Initial Deposit here :");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();

        userIDCardDetails[GlobalVariable.accountCounter] = idCardNumber;
        userNameDetails[GlobalVariable.accountCounter] = accountHolderName;
        bankPin[GlobalVariable.accountCounter] = pinNumber;
        accountType[GlobalVariable.accountCounter] = accountTypeName;
        bankBalances[GlobalVariable.accountCounter] = initialDeposit;
        GlobalVariable.accountCounter++;
        System.out.println("Account Created Successfully");

    }

    public void depositMoneyProcess() {
        System.out.println("Enter Your ID Card Number here :");
        String idCardNumber = scanner.nextLine();
        System.out.println("Enter Your Name here :");
        String accountHolderName = scanner.nextLine();
        for(int i = 0; i <= GlobalVariable.accountCounter;i++) {
            if(userIDCardDetails[i].equalsIgnoreCase(idCardNumber) && userNameDetails[i].equalsIgnoreCase(accountHolderName)) {
                System.out.println("Enter Deposit Value here :");
                double depositValue = scanner.nextDouble();
                scanner.nextLine();
                deposit(depositValue, i);
            }
        }
    }
    public void withdrawMoneyProcess() {

    }

    public void displayAccountDetailsProcess() {
        System.out.println("Enter Your ID Card Number here :");
        String idCardNumber = scanner.nextLine();
        System.out.println("Enter Your Name here :");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter Your PIN Number here :");
        int pinNumber = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i <= GlobalVariable.accountCounter;i++) {
            if(userIDCardDetails[i].equalsIgnoreCase(idCardNumber) && userNameDetails[i].equalsIgnoreCase(accountHolderName) && bankPin[i] == pinNumber ) {
                System.out.println("Account Holder Name : " + userNameDetails[i]);
                System.out.println("Account ID Card Number : " + userIDCardDetails[i]);
                System.out.println("Account PIN Number : " + bankPin[i]);
                
                
            }
        }
    }
}

//Call the BankingManagementSystem
public class BankingManagementSystem {
    public static void main(String[] args) {
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
                    systemProcessControler.displayMainDashBoard();
                    int runningProcessID = systemProcessControler.runningProcessHandling();
                    switch(runningProcessID) {
                        case 1:
                            systemProcessControler.userRegisterationProcess();
                        break;
                        case 2:
                            systemProcessControler.depositMoneyProcess();
                        break;
                        case 3:
                            systemProcessControler.withdrawMoneyProcess();
                        break;
                        case 4:
                            systemProcessControler.displayAccountDetailsProcess();
                        break;
                        default:
                            System.out.println("Invalid Input !!");
                        
                    }
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
