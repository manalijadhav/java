class BankAccount // <-- blueprint of the object 
{
	//data members / fields
	private int accountNumber; 
	private String accountHolder; 
	private double accountBalance;

	private double getAccountBalance() { // simulation of the select query
		return accountBalance;
	}
	private  void setAccountBalance(double accountBalance) { // simulation of the update query
		this.accountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	BankAccount() { }
	BankAccount(int accountNumber, String achn, double accBal) {
		System.out.println("==>Creating and setting the BankAccount(int,String,double)....");
		if(accountNumber < 0 ) {
			System.out.println("account number cannot be negative..");
		}
		else {
			this.accountNumber = accountNumber;	
		}
		//all local variables must be initialized
		
		boolean validName= false; // 
		char alpha =' ';
		for (int i=0;i<achn.length();i++)
		{  //Sac%4in
			alpha = achn.charAt(i);
			if( (alpha >=65 && alpha <=90) || ( alpha >=97 && alpha <=122) || (alpha==32) ) // notepad -> alt+68
			{
				validName = true;
			}
			else {
				validName = false;
				break;
			}
		}
		
			if(validName == true) {
				accountHolder = achn;		
			}
			else {
				System.out.println("Invalid account holder name ");
			}
		
		if(accBal < 0) {
			System.out.println("Account opening balance cannot be negative...");
		}
		else {
			accountBalance = accBal;
		}
	}
	void withdraw(double amountToWithdraw)	{
		if(amountToWithdraw < accountBalance) 	{
			System.out.println("--> Withdrawing......"+amountToWithdraw);
			accountBalance = accountBalance - amountToWithdraw;
		}
		else {
			System.out.println("Insufficient funds..cannot withdraw....");
		}
	}

	// allow only one thread at a time 
	 void deposit(double amountToDeposit, String tn) {
		System.out.println(tn+" 1..line");
		System.out.println(tn+" 2..line");
		System.out.println(tn+" 3..line");
	
		synchronized(this)
		{
						System.out.println(tn+" Trying to get the balance...");
						
						try {
							Thread.sleep(20);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//IMP 87
						double currentBalance = getAccountBalance() ;  //select
						System.out.println(tn+" got the balance...");
						
						if(amountToDeposit < 0 ) {
							System.out.println("Cannot deposit negative amount...");
						}
						else {
							//System.out.println(tn+" Depositing......"+amountToDeposit);
							 
							System.out.println(tn+" Calculating new balance...");
							
							//IMP 99
							double newBalance = currentBalance + amountToDeposit;
							System.out.println(tn+" Calculated the new balance...");
							
							System.out.println(tn+" Trying to set the new balance...");
							try {
								Thread.sleep(20);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							//IMP 110
							setAccountBalance(newBalance); // update query
							System.out.println(tn+" has set the new balance...");
						}
		}// synchronized clode block ends here
		System.out.println(tn+" 97 ..line");
		System.out.println(tn+" 98 ..line");
		System.out.println(tn+" 99..line");
	}
	void showBankAccount() {
		System.out.println("[Account Number  : "+accountNumber);
		System.out.println("[Account Holder  : "+accountHolder);
		System.out.println("[Account Balance : "+accountBalance);
		System.out.println("----------------------------");
	}
	
}