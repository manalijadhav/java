
public class PingPongTest {
	public static void main(String[] args) {
		MyThread mt1 = new MyThread("ping");
		MyThread mt2 = new MyThread("pong");
		MyThread mt3 = new MyThread("pang");
		MyThread mt4 = new MyThread("pung");
		
		mt1.start();
		mt2.start();
		mt3.start();
		mt4.start();
		
	}
}
class MyThread extends Thread //1
{
	String msg; // global data shared across constructor and the run method
	
	MyThread (String msg) { // let constructor play a role of mediator 
		this.msg = msg; // 
	}
	//2 
	public void run() {
		for (int i = 1; i <=10; i++) {
			System.out.println(msg+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //1 second
		}
		
	}
}
