import java.util.*;
class Test
{
	int totalseats=25;
	synchronized public void bookseat(int seat)
	{
		if(totalseats>=seat)
		{
			System.out.println(seat+" : Seats are Successfully Booked");

			totalseats=totalseats-seat;
			System.out.println("Remaining Seats are :"+totalseats);
		}
 
		else 
		{
			System.out.println("\n"+seat+": Seats can Not Bookes");
			System.out.println("Total Seats are Remaining :"+totalseats); 
		}
	}
}

class Syncronize02 extends Thread 
{
	static Test ob;

	int seat;

	public void run()
	{
		ob.bookseat(seat);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		ob=new Test();

		Syncronize02 farhan=new Syncronize02();

		farhan.seat=sc.nextInt();
		farhan.start();
		

		Syncronize02 faraz=new Syncronize02();

		faraz.seat=sc.nextInt();
		faraz.start();
	}
}