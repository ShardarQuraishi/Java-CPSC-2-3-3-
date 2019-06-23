public class SavingsAccount extends BankAccount{    //subclass that inherits properties of Parent class
	double annualInterestRate;    //instance variable

	SavingsAccount(){     //Default Constructor
	}

	SavingsAccount(double initialBalance, double annualInterestRate){     //Parameterized Constructor
		super(initialBalance);                                           /* super keyword calls constructor from BankAccount class
																			which helps access methods from BankAccount class */
		this.annualInterestRate = annualInterestRate;

	}




	public void depositMonthlyInterest(){         //method to add interest to balance

		balance = balance + (balance * annualInterestRate);
	}
	public double getAnnualInterestRate(){     //getter method for annualInterestRate
		return annualInterestRate;

	}

	public void setAnnualInterestRate(double annualInterestRate){  //setter method for annualInterestRate
		this.annualInterestRate = annualInterestRate;
	}
}
