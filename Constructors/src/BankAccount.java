public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    // if parameters aren't given use this default
    public BankAccount() {
        this("27283", "default email","default name", "(123)-456-7890", 0.00);
    }
    // constructors to add while our instance object is being created
    public BankAccount(String accountNumber, String customerEmail, String customerName, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }


    // setter methods
    public void setAccountNumber(String number) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName() {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.customerEmail = customerEmail;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // getter methods
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber(String accountNumber) {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            balance += amount;
            System.out.println("Deposit of $" + amount + " made. New balance is $" + balance);
        }
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            System.out.println("Only $" + balance + " is available. Withdrawal not processed." );
        } else {
            balance -= amount;
            System.out.println("Current balance: $" + (balance));
        }
    }
}