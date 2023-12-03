import java.util.Scanner;
                                             
class Account 
{
    private double Balance;  

    public Account(double InitialBalance)
    {
        this.Balance = InitialBalance;
    }

    public double getBalance() 
    {
        return Balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
        {
            Balance += amount;
            System.out.println("Deposit successful!. Updated balance: " + Balance);
        } 
        else
        {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0)
        {
            if (amount <= Balance) 
            {
                Balance -= amount;
                System.out.println("Withdrawal done. Net balance: " + Balance);
                return true;
            }
            else 
            {
                System.out.println("Insufficient Balance ");
            }
        }
        else
        {
            System.out.println("Invalid withdrawal amount.");
        }
        return false;
    }
}

class ATM {
    private Account bankAccount;

    public ATM(Account bankAccount) 
    {
        this.bankAccount = bankAccount;
    }

    public void displayMenu() {
        System.out.println("ATM MENU:");
        System.out.println("Select from above options!");
        System.out.println("1. Check the Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void run() 
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            displayMenu();
            System.out.print("Enter your choice: ");
            int input = scanner.nextInt();

            switch (input){
                case 1:
                    System.out.println("Current balance: " + bankAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    boolean withdrawSuccess = bankAccount.withdraw(withdrawalAmount);
                    if (withdrawSuccess) {
                        System.out.println("Withdrawal successful.");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

public class AtmInterface {

	 public static void main(String[] args)
	    {
	        Account userAccount = new Account(2000.0); // Initially balance = $2000
	        ATM atm = new ATM(userAccount);
	        atm.run();
	    }

}
