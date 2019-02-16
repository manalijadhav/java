public class Bank
{
	public static void main(String args[])
	{
		System.out.println("main of Bank");;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

		BankAccount ba = new BankAccount(4,6789.00);

		ba.showBankAccount();		

		

	}
}


//contract of a class = the isNess of the concerned functions alongwith the data

//BankAccount ba = new BankAccount(110,"Bill",5000);
//ba.withdraw(3000);

//String s ="john"<-- we are the user of this class
//s.charAt(12); <-- we are the user of this method


class BankAccount 
{
	// object/instance data / fields / data members
	private int accountNumber;
	private String accountHolderName;	
	private double accountBalance; // physical state

	private void calculateSimpleInterest() {
		System.out.println("Calculating simple interest....");
		double si = accountBalance * 1 * 4.0 /100;
		System.out.println("Simple Interest : "+si);
	}

	// member functions / methods / behaviour


	BankAccount( String y)
	{
		this(0,y,0);
		System.out.println("BankAccount(String)...");		
	}
	BankAccount( int x)
	{
		this(x,"",0);
		System.out.println("BankAccount(int)...");		
	}
	BankAccount( int x, double z)
	{
		this(x,"",z);
		System.out.println("BankAccount(int,double)...");		
	}

	BankAccount(double z)
	{
		this(0,"",z);
		System.out.println("BankAccount(double)...");		
	}
	
	BankAccount(int x, String y, double  z)
	{
		super();
		System.out.println("BankAccount(int,String,double )...");		
		
		if(x < 0 ) {
			System.out.println("Account number must be positive...");
		}
		else
			accountNumber=x;

		char ch = ' ';
		boolean validCharsFound=false;

		for(int i=0;i<y.length();i++) {
			ch = y.charAt(i);
				
			if( (ch>=65 && ch<=90) || ( ch>=97 && ch<=122) || ch==32 ) {
				validCharsFound=true;
			} 
			else  {
				validCharsFound=false;
				break;
			}
		}
		if(validCharsFound==true) {
			accountHolderName=y;
		}
		else {
			System.out.println("Holder name must have alphabets..");
		}
	

		if(z > 50000 ) {
			System.out.println("Show the income proof of "+z);
		}
		else
			accountBalance=z;
	}

	//partial mutator
	public void withdraw(double  amountToWithdraw) // behaviour
	{
		if(amountToWithdraw > accountBalance) {
			System.out.println("Insufficient funds...");
		}
		else {
			System.out.println("withdrawing : "+amountToWithdraw);
			accountBalance = accountBalance - amountToWithdraw;
		}
	}

	public void deposit(double  amountToDeposit) // behaviour
	{
		if(amountToDeposit > 50000 ) {
			System.out.println("Depositing: Show the income proof of "+amountToDeposit);
		}
		else {
			System.out.println("depositing : "+amountToDeposit);
			accountBalance = accountBalance + amountToDeposit;
		}
	}

	//prints
	public void showBankAccount()
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account Holder  : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("---------------------------");
	}

	//accessor
	double getBalance() {
		System.out.println("Returning the balance....");;;;;;;;
		return accountBalance;
 	}
}


