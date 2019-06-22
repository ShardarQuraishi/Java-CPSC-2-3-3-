/**
 * Class sets up a bank account.
 * Determines the balance and overdraft amount.
 */
public class BankAccount {
    //instance variables
    private double balance;
    private double overdraftAmount = 100.0;
    private Customer newCustomer;

    /**
     * Getter method for the Customer class.
     * @return newCustomer
     */
    public Customer getCustomer(){
	return newCustomer;
    }

    /**
     * Default constructor.
     */
    BankAccount(){
    }

    /**
     * Parameterized constructor of the BankAccount class.
     * @param newCustomer
     * @param amount
     */
    BankAccount(Customer newCustomer, double amount){
        this.newCustomer = newCustomer;
        this.balance = amount;
    }

    /**
     * Method for depositing money into an account.
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
     * Method for withdrawing money from an account.
     * @param amount
     */
    public void withdraw(double amount){
	if (amount > balance + overdraftAmount){
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
     * Setter method for the overdraft amount.
     * @param overdraftAmount
     */
    public void setOverdraftAmount(double overdraftAmount){
	this.overdraftAmount = overdraftAmount;
    }
}
