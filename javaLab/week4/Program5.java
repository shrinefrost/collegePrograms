package week4;
/*Program 5: Assume that a bank maintains two kinds of accounts for its customers, one 
called savings account and the other current account. The savings account provides 
compound interest and withdrawal facilities but no cheque book facility. The current 
account provides cheque book facility but no interest. Current account holders should 
also maintain a minimum balance and if the balance falls below this level, a service 
charge is imposed. 
Create a class Account that stores customer name, account number and type of account. 
From this derive the classes Curr-acct and Sav-acct to make them more specific to their 
requirements. Include the necessary methods in order to achieve the following tasks: 
. 
. 
. 
. 
. 
Accept deposit from a customer and update the balance. 
Display the balance. 
Compute and deposit interest. 
Permit withdrawal and update the balance. 
Check for the minimum balance, impose penalty, if necessary and update the 
balance.  */

// Base class Account
class Account {
    String customerName;
    int accountNumber;
    String accountType;
    double balance;

    
    public Account(String customerName, int accountNumber, String accountType, double balance) {
        this.customerName = customerName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

  
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance: " + balance);
    }

  
    public void displayBalance() {
        System.out.println("Account Balance: " + balance);
    }

    
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    
    public void imposePenalty() {
        // Empty in base class
    }
}

// Derived class CurrAcct for Current Account
class CurrAcct extends Account {
    double minBalance;
    double penalty;

  
    public CurrAcct(String customerName, int accountNumber, double balance, double minBalance, double penalty) {
        super(customerName, accountNumber, "Current", balance);
        this.minBalance = minBalance;
        this.penalty = penalty;
    }


    @Override
    public void imposePenalty() {
        if (balance < minBalance) {
            balance -= penalty;
            System.out.println("Penalty of " + penalty + " imposed. New balance: " + balance);
        }
    }
}


class SavAcct extends Account {
    double interestRate;

    public SavAcct(String customerName, int accountNumber, double balance, double interestRate) {
        super(customerName, accountNumber, "Savings", balance);
        this.interestRate = interestRate;
    }


    public void computeAndDepositInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance: " + balance);
    }
}


public class Program5 {
    public static void main(String[] args) {
  
        CurrAcct currentAccount = new CurrAcct("suraj", 12345, 500.0, 1000.0, 50.0);
        currentAccount.deposit(200);
        currentAccount.withdraw(100);
        currentAccount.imposePenalty();  // Should impose penalty due to insufficient balance
        currentAccount.displayBalance();

        System.out.println("\n");

        SavAcct savingsAccount = new SavAcct("shrushanto", 67890, 1500.0, 0.05);
        savingsAccount.deposit(500);
        savingsAccount.computeAndDepositInterest();  // Interest should be added
        savingsAccount.displayBalance();
    }
}


