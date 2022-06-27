import java.util.List;
import java.util.Scanner;
import java.lang.Math;
public class Bookcab {
	List<Taxi> taxis = Mainprogram.taxilist;
	Scanner sc1 = new Scanner(System.in);
	public void book() throws InterruptedException {
		/*System.out.println("Customer id : ");
		int cid = sc1.nextInt();*/
		System.out.println("Pickup point : ");
		char pick = sc1.next().charAt(0);
		System.out.println("Drop point : ");
		char drop = sc1.next().charAt(0);
		/*System.out.println("Time : ");
		int time = sc1.nextInt();*/
		
		int min = 6;
		Taxi selt = null;
		for(Taxi t : taxis) {
			int distance = Math.abs(t.location - pick);
			//System.out.println(distance);
			if(distance < min && t.status.equals("Available")){
				selt = t;
				min = distance;	
			}
			if(distance == min && t.status.equals("Available")) {
				if(t.earnings < selt.earnings) {
					selt = t;
				}
			}
		}
		if(selt == null) {
			System.out.println("No Cab available");
		}
		else {
			int kms = Math.abs(drop - pick) * 15;
			int fare = ((kms-5)*10) + 100;
			int duration = (int) ((Math.abs(pick-drop)) * 5);
			System.out.println("Cab no : "+selt.taxino+" is booked \nFare : "+fare);
			System.out.println("Travel Duration : "+duration+"sec");
			selt.earnings = selt.earnings + fare;
			selt.location = drop;
			selt.status = "Booked";
			selt.set(duration);
			selt.setThread();
			selt.thread.start();
		}
	}
	
	public void show() {
		System.out.println("TaxiNo Currentspot Earnings Status");
		for(Taxi t : taxis) {
			System.out.println(t.taxino+"        "+t.location+"            "+t.earnings+"     "+t.status);
		}
	}
}
