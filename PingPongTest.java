import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

public class PingPongTest {

	public static void main(String[] args) {
		/*Message m1 = new Message("Ping"); //3
		Message m2 = new Message("\tPong"); //3 
		Message m3 = new Message("\t\tPang"); //3 
		Message m4 = new Message("\t\t\tPung"); //3 
		
		m1.start();
		m2.start();
		m3.start();
		m4.start(); */
		
		Car c1 = new Car("Skoda",100,200); //3
		Car c2 = new Car("Honda",200,300);
		Car c3 = new Car("Maruti",400,500);
		
		Thread t1 = new Thread(c1); //4
		Thread t2 = new Thread(c2);
		Thread t3 = new Thread(c3);
		
		t1.start(); //5
		t2.start(); //5
		t3.start(); //5
		
	}
}
class Vehicle { }
class Car extends Frame implements Runnable //1
{
	String name;
	TextField t = new TextField(40);
	public Car(String name, int x, int y) {
		super();
		this.name = name;
		setSize(300, 400);
		setLocation(x, y);
		setLayout(new FlowLayout());
		add(t);
		setVisible(true);
	}

	public void run() { //2
		for(int i=1;i<3000;i++) {
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			//System.out.println(name+" Car is running..."+i);
			t.setText(name+" Car is running..."+i);
		}
	} 
}

class Message extends Thread //1 - isA
{
	String msg;

	public Message(String msg) {
		super();
		this.msg = msg;
	}
	
	public void run() { //2
		for(int i=1;i<300;i++) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(""+msg+i);
		}
	}
	
}

/*
 * I . 
 * 1. extend from java.lang.Thread class
 * 2. override the public void run() method - it has the business logic that participates in threading 
 * 3. instantiate your class of step number 1
 * 4. and call its start(), which invokes your run() method
 */

/*
 * II . 
 * 1. implement from java.lang.Runnable interface
 * 2. mandate to define the public void run() method - it has the business logic that participates in threading 
 * 3. instantiate your class of step number 1
 * 4. instantiate java.lang.Thread class and pass your object in its ctor
 * 5. and call its start(), which invokes your run() method
 */
