/**
 * Class sets up a bank account.
 * Determines the balance and transfers amounts between customer accounts.
 */
public class BankAccount {
    //instance variables
    protected double balance;
    private Customer accountHolder;

    /**
     * Getter method for the Customer class.
     * @return accountHolder
     */
    public Customer getCustomer(){
	return accountHolder;
    }

    /**
     * Parameterized constructor of the BankAccount class.
     * @param accountHolder
     * @param startBalance
     */
    BankAccount(Customer accountHolder, double startBalance){
        this.accountHolder = accountHolder;
        this.balance = startBalance;
    }

    /**
     * Default constructor.
     */
    BankAccount(){
	this.balance = 0.0;
    }

    /**
     * Method for depositing money into a bank account.
     * @param amount
     */
    public void deposit(double amount){
	if (amount > 0){
		balance = balance + amount;
	}else{
		balance = balance;
	}
    }

    /**
     * Method for withdrawing money from a bank account.
     * @param amount
     */
    public void withdraw(double amount){
	if (amount > balance){
		balance = balance;
	}else{
		balance = balance - amount;
	}
    }

    /**
     * Getter method for the balance.
     * @return balance
     */
    public double getBalance(){
	return balance;
    }

    /**
     * Setter method for the balance.
     * @param amount
     */
    public void setBalance(double amount){
        this.balance = amount;
    }

    /**
     * Transfer method which transfers specified amount from one
     * account to another.
     * @param amount
     * @param toAccount
     */
    public void transfer(double amount, BankAccount toAccount){
        if (amount <= this.balance){
            withdraw(amount);
            toAccount.deposit(amount);
        }
    }
}
