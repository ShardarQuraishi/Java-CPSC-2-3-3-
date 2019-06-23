public class BankAccount{
	double balance;
	double overdraftAmount = 100.0;    //instance variables

	BankAccount(){
	}

	BankAccount(Customer c, double balance){
		this.balance = balance;


	}

	Customer c = new Customer();

	public Customer getCustomer(){
		return c;
	}

	BankAccount(double initialBalance){
		balance = initialBalance;
		getCustomer();



	}



	public void deposit(double money){  //deposit method to deposit money into account

		if (money < 0){           /*if statement to not be able
									to deposit negative amount*/
			balance = balance;
		}
		else{
			balance = balance + money;
		}
	}

	public void withdraw(double money){      //withdraw method to withdraw money from account
		if (balance <= 0){
			if (money >= overdraftAmount){    /* if statement to not be able to
												withdraw more than overdraft amount*/

				balance = 0;
			}
		}
		else{
			balance = balance - money;
		}

	}

	public double getBalance (){  //getter method
		return balance;
		}



	public void setOverdraftAmount(double overdraftAmount){   //setter method
		this.overdraftAmount = overdraftAmount;
	}







}
