import java.awt.Frame;
import java.awt.TextField;

public class ThreadTest4 {
	public static void main(String[] args) {
		
		MyFrame mf1 = new MyFrame(150,"Ping");
		MyFrame mf2 = new MyFrame(350,"Pong");
		MyFrame mf3 = new MyFrame(550,"Pang");
		MyFrame mf4 = new MyFrame(750,"Pung");
		
	/*	mf1.run();
		mf2.run();

		mf4.run();
		*/
		
		Thread  t1 = new Thread(mf1);
		Thread  t2 = new Thread(mf2);
		Thread  t3 = new Thread(mf3);
		Thread  t4 = new Thread(mf4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
	
		
	}
}

class MyFrame extends Frame implements Runnable //isA
{
	TextField t =  new TextField(10); //hasA
	String msg ; // hasA
	 
	MyFrame (int x, String msg) {
		add(t); // adding the textfield in the frame 
		this.msg = msg;
		
		setVisible(true); // show the frame on the screen
		setSize(200,200); // set the size
		setLocation( x, 150); // set the location

	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10000; i++) { // frames activity
			t.setText(msg+i);
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
