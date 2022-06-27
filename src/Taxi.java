import java.util.Scanner;

public class Taxi implements Runnable {
	int earnings;
	char location;
	String status;
	static int id = 1;
	int taxino;
	Thread thread;
	int duration;
	public Taxi() {
		// TODO Auto-generated constructor stub
		this.earnings = 0;
		this.location = 'A';
		this.taxino = id++;
		this.status = "Available";
	}
	
	public void set(int duration) {
		this.duration = duration;
		
	}
	
	public void setThread() {
		thread = new Thread(this);
	}
	public void run() {
		//this.location = drop
		try {
			Thread.sleep(duration*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.status = "Available";
		System.out.println("Cab"+this.taxino+" has finished its journey");
	}
	
	/*public void threadchange(int duration, char drop) throws InterruptedException {
		Thread.sleep(duration*1000);
		this.location = drop;
		this.status = "Available";
	}*/

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] ch = {1,2,3,4};
		Taxi t = new Taxi();
		Scanner sc = new Scanner(System.in);
		Boolean loop = true;
		while(loop) {
		System.out.println("Enter");
		int i = sc.nextInt();
		t.change(i);
		if (i==0){
			loop = false;
		}
		
		}
	}*/

	/*private void change(int numb) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread(() ->
				{
				input++;
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(numb);
				
			}
		);
		//Thread t1 = new Thread(r1);
		t1.start();
	}*/

}
