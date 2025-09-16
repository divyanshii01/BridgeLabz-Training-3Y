// Abstract class (blueprint)
abstract class Account {
    protected String accountHolder;
    protected double balance;

    public Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Abstract methods (blueprint only, no body)
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void calculateInterest();

    // Common method (shared by all accounts)
    public void displayBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }
}

// Child class - Savings Account
class SavingAccount extends Account {
    private double interestRate = 0.04; // 4%

    public SavingAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Saving Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Saving Account.");
        } else {
            System.out.println("Insufficient funds in Saving Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: " + interest);
    }
}

// Child class - Current Account
class CurrentAccount extends Account {
    private double overdraftLimit = 5000; // Can withdraw beyond balance

    public CurrentAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " in Current Account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + " from Current Account.");
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public void calculateInterest() {
        // Current accounts usually don't earn interest
        System.out.println("No interest for Current Account.");
    }
}

// Main class to test
public class BankManagement {
    public static void main(String[] args) {
        Account acc1 = new SavingAccount("Divyanshi", 10000);
        Account acc2 = new CurrentAccount("Rohit", 5000);

        acc1.deposit(2000);
        acc1.calculateInterest();
        acc1.withdraw(3000);
        acc1.displayBalance();

        System.out.println("------------------");

        acc2.deposit(1000);
        acc2.withdraw(7000); // within overdraft limit
        acc2.calculateInterest();
        acc2.displayBalance();
    }
}
