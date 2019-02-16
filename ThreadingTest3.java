class SavingsAccount
{
	float balance;
	
	public SavingsAccount(float balance) {
		super();
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "SavingsAccount [balance=" + balance + "]";
	}

	void withdraw(float amt) {
		System.out.println("withdrawing money from SavingsAccount..."+amt);
		balance = balance - amt;
	}
}

class Cashier // no isA 
{
	float openingCash;
	
	Cashier(float openingCash) {
		this.openingCash= openingCash;
	}
	
	
	
	@Override
	public String toString() {
		return "Cashier [openingCash=" + openingCash + "]";
	}



	//no hasA
	void dispenseCash(SavingsAccount ref, float amountToDispense) {
		System.out.println("Cashier is trying to dipense the cash....");
		ref.withdraw(amountToDispense);
		System.out.println("Cashier has dispnsed the cash....");
		openingCash = openingCash - amountToDispense;
	}
}

public class ThreadingTest3 {
	public static void main(String[] args) {
		SavingsAccount sa1= new SavingsAccount(50000);
		SavingsAccount sa2= new SavingsAccount(60000);
		SavingsAccount sa3= new SavingsAccount(70000);
		System.out.println("sa1 "+sa1);
		System.out.println("sa2 "+sa2);
		System.out.println("sa3 "+sa3);
		
		Cashier cash = new Cashier(500000);
		System.out.println("Cashier : "+cash);
		System.out.println("---------------------------------------------------");
		
		cash.dispenseCash(sa1, 5000); // usesA 
		cash.dispenseCash(sa2, 8000); //usesA
		cash.dispenseCash(sa3, 12000); //useA
		
		System.out.println("sa1 "+sa1);
		System.out.println("sa2 "+sa2);
		System.out.println("sa3 "+sa3);

		System.out.println("---------------------------------------------------");
		System.out.println("Cashier : "+cash);

	}
}
