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
class Syncronize01 extends Thread 
{

	static Test ob; 
	int seat;

	public void run()
	{
		ob.bookseat(seat);
	}

	public static void main(String[] args) 
	{
		ob=new Test();

		Syncronize01 farhan=new Syncronize01();
		farhan.seat=20;
		farhan.start();

		Syncronize01 faraz=new Syncronize01();
		faraz.seat=5;
		faraz.start();
	}

}