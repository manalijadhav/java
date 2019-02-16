class Phone
{
	void dial() 	{
		System.out.println("Dialing() nowhere....");
	}
	void dial(byte number) {
		System.out.println("Dialing(byte)....."+number);
	}
	void dial(String name) {
		System.out.println("Dialing(String)....."+name);
	}
	void dial(int exten) {
		System.out.println("Dialing(int)....."+exten);
	}
	void dial(byte stdcode, long number) {
		System.out.println("Dialing(byte,long)....."+stdcode+" number "+number);
	}
	void dial(long number,byte stdcode ) {
		System.out.println("Dialing(long,byte)....."+stdcode+" number "+number);
	}
}
public class OverloadingTest {
	public static void main(String[] args) {
		Phone myPhone = new Phone();		myPhone.dial();
		byte police=100;		myPhone.dial(police);
		myPhone.dial("Seema");
		int extNumber=1223;		myPhone.dial(extNumber);
		byte mumbaiStdCode=22;		long number=82828222;
		myPhone.dial(mumbaiStdCode, number);
		byte delhiStdCode=11; myPhone.dial(number,delhiStdCode);
	}

}
