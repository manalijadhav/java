class BankTest
{
	public static void main(String args[])
	{
		System.out.println("starting the bank....");

		//creating object = instantiation process
		BankAccount bankObj1 = new BankAccount(101,"Janet",50000);
		bankObj1.showBankAccount();
		bankObj1.withdraw(7000);
		bankObj1.showBankAccount();
		
		//bankObj1.BankAccount(122,"Julie",6000);
	//	bankObj1.showBankAccount();
		
		
	}
}
// business entity  01
//vision

class A
{
	int x,y,z;
	//here JPL provides a ctor known as implicit or default ctor
	//it does nothing
}
// A a = new A();

class B
{
	B(int x) // this is explicit no-arg ctor -NEVER KNOWN AS DEFAULT 
	{
		
	}
}

class BankAccount // <-- blueprint of the object 
{
	//data members / fields
	private int accountNumber; 
	private String accountHolder; 
	private double accountBalance;

	BankAccount() { }
	
	BankAccount(int acno, String achn, double accBal) 
	{
		boolean validName=false;
		char alpha = "";
		System.out.println("==>Creating and setting the BankAccount....");
		for(int i=0;i<=achn.length();i++)
		{
			if(alpha>=65 && alpha<=90)||if(alpha>=97 && alpha<=122)
			{
				valid
		accountNumber = acno;
		accountHolder = achn;
		accountBalance = accBal;
	}
	
	/*void setBankAccount(int acno, String achn, double accBal) {
		System.out.println("==> Setting the BankAccount....");
		accountNumber = acno;	accountHolder = achn;
		accountBalance = accBal;
	}*/
	//member functions / methods

		void withdraw(double amountToWithdraw)	{
		if(amountToWithdraw < accountBalance) 	{
			System.out.println("--> Withdrawing......"+amountToWithdraw);
			accountBalance = accountBalance - amountToWithdraw;
		}
		else {
			System.out.println("Insufficient funds..cannot withdraw....");
		}
	}
	void deposit(double amountToDeposit) {
		if(amountToDeposit < 0 ) {
			System.out.println("Cannot deposit negative amount...");
		}
		else {
			System.out.println("<-- Depositing......"+amountToDeposit);
			accountBalance = accountBalance + amountToDeposit;
		}
	}
	

	void showBankAccount() {
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolder);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("----------------------------");
	}
}
