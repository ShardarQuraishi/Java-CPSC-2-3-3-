/**
 * Class which determines the overdraft amount and the overdraft fee, and applies
 * it to the balance.
 * Subclass of BankAccount.
 */
public class ChequingAccount extends BankAccount {
    //instance variables
    private double overdraftFee;
    private double overdraftAmount = 0.0;

    /**
     * Parameterized constructor which takes in one parameter.
     * @param transactionFee
     */
    ChequingAccount(double transactionFee){
	setOverdraftFee(transactionFee);
    }

    /**
     * Parameterized constructor of the which takes in three parameters and calls upon
     * a constructor in the BankAccount class.
     * @param accountHolder
     * @param startBalance
     * @param transactionFee
     */
    ChequingAccount(Customer accountHolder, double startBalance, double transactionFee){
        super(accountHolder, startBalance);
	setOverdraftFee(transactionFee);
    }

    /**
     * Getter method for the overdraft fee.
     * @return overdraftFee
     */
    public double getOverdraftFee(){
        return overdraftFee;
    }

    /**
     * Setter method for the overdraft fee.
     * @param fee
     */
    public void setOverdraftFee(double fee){
	this.overdraftFee = fee;
    }

    /**
     * Setter method for the overdraft amount.
     * @param amount
     */
    public void setOverdraftAmount(double amount){
        this.overdraftAmount = amount;
    }

    /**
     * Getter method for the overdraft amount.
     * @return overdraftAmount
     */
    public double getOverdraftAmount(){
        return overdraftAmount;
    }

    /**
     * Method for withdrawing money from an account.
     * Withdraws overdraft fee from an account if applicable.
     * @param amount
     */
    @Override
    public void withdraw(double amount){
	if (amount > balance + overdraftAmount){
		balance = balance;
	}else{
		balance = balance - amount;
		if (balance < 0.0){
			balance = balance - overdraftFee;
		}
	}
    }

    /**
     * Method for getting monthly fees.
     * @return fee
     */
    @Override
    protected double getMonthlyFeesAndInterest(){
        double fees;
        if (balance > 0.0){
            fees = 0.0;
        }else{
            fees = (balance * 0.2);
        }
        return fees;
    }

}
