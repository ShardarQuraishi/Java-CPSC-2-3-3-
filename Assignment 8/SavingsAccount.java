/**
 * Class which determines the interest rate and applies it to the balance.
 * Subclass of BankAccount.
 */
public class SavingsAccount extends BankAccount{
    //instance variable
    private static double annualInterestRate;

    /**
     * Default constructor which calls upon a constructor in the BankAccount class.
     */
    public SavingsAccount(){
	super();
    }

    /**
     * Parameterized constructor of the which takes in two parameters and calls upon
     * a constructor in the BankAccount class.
     * @param accountHolder
     * @param startBalance
     */
    public SavingsAccount(Customer accountHolder, double startBalance){
        super(accountHolder, startBalance);
    }

    /**
     * Setter method for the annual interest rate.
     * @param annualInterestRate
     */
    public static void setAnnualInterestRate(double aInterestRate){
        double inf = Double.POSITIVE_INFINITY;
        if (aInterestRate > 0 && aInterestRate < inf){
            annualInterestRate = aInterestRate;
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
