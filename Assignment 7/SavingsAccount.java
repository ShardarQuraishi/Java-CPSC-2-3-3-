/**
 * Class which determines the interest rate and applies it to the balance.
 * Subclass of BankAccount.
 */
public class SavingsAccount extends BankAccount{
    //instance variable
    private double annualInterestRate;

    /**
     * Default constructor which calls upon a constructor in the BankAccount class.
     */
    public SavingsAccount(){
	super();
    }

    /**
     * Parameterized constructor of the which takes in three parameters and calls upon
     * a constructor in the BankAccount class.
     * @param accountHolder
     * @param startBalance
     * @param annualInterestRate
     */
    public SavingsAccount(Customer accountHolder, double startBalance, double annualInterestRate){
        super(accountHolder, startBalance);
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * Setter method for the annual interest rate.
     * @param annualInterestRate
     */
    public void setAnnualInterestRate(double annualInterestRate){
        double inf = Double.POSITIVE_INFINITY;
        if (annualInterestRate > 0 && annualInterestRate < inf){
            this.annualInterestRate = annualInterestRate;
        }
    }

    /**
     * Getter method for the annual interest rate.
     * @return annualInterestRate
     */
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    /**
     * Method for getting monthly fees and interest.
     * @return fee
     */
    @Override
    protected double getMonthlyFeesAndInterest(){
        double fee;
        if (balance < 1000.0){
            fee = (-5.0 + ((annualInterestRate /12.0)));
        }else{
            fee = (balance *((annualInterestRate /12.0)/100.0));
        }
        return fee;
    }
}
