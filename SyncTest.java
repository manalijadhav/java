
public class SyncTest {
	public static void main(String[] args) {
		
		BankAccount baObj = new BankAccount(101,"Suresh",50000); // DAO
		baObj.showBankAccount();
		//baObj.deposit(5000); // getBal, calcAmt, setBalance
		// load the dbdriver, acquire connection with the database
		//select balance  from banktable where acno=101
		// pickup the balance column
		// newBal = balance + amt;
		// newBal = 55000
		// update banktable set balance = newBal where acno=101;
		Transaction teller1 = new Transaction(baObj, 5000, "Rupali");
		Transaction teller2 = new Transaction(baObj, 7000, "\tRuchika");
		Transaction teller3 = new Transaction(baObj, 8000, "\t\tAnwar");
		
		teller1.start();
		teller2.start();
		teller3.start();
		
		try {
			teller1.join();
			teller2.join();
			teller3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("----------------------------");
		baObj.showBankAccount();
		System.out.println("End of main");
	}
}

class Transaction extends Thread
{
	String cashierName;
	private BankAccount targetBankAccountRef; // just a reference;
	private double amountToBeDeposited;
	
	
	Transaction(BankAccount x, double amount,String cashName) {
		targetBankAccountRef = x ;
		amountToBeDeposited = amount;
		cashierName = cashName;
	}

	public void run() {
		//System.out.println(cashierName+" is depositing...."+amountToBeDeposited+" for "+targetBankAccountRef.getAccountNumber());
		targetBankAccountRef.deposit(amountToBeDeposited, cashierName);
	}
}
