import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainprogram extends Thread {
	static List<Taxi> taxilist = new ArrayList<>();
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 Taxi t = new Taxi();
		 Taxi t1 =new Taxi();
		 Taxi t2 = new Taxi();
		 Taxi t3 = new Taxi();
		 taxilist.add(t);
		 taxilist.add(t1);
		 taxilist.add(t2);
		 taxilist.add(t3);
		 Scanner sc = new Scanner(System.in);
		 Boolean loop = true;
		 Bookcab bc = new Bookcab();
		 while(loop) {
			 System.out.println("1.Book taxi\n 2.Taxi details \n 3.Exit");
			 int choice = Integer.parseInt(sc.nextLine());
			 switch(choice) {
			 case 1:
				 bc.book();
				 break;
				 
			 case 2:
				 bc.show();
				 break;
			
			 case 3:
				 loop = false;
				 break;
				 
			 default:
				 break;
			 }
		 }
		
	}

}
