class USINDH extends Thread
{
	public void run()
	{
		System.out.println("Faraz Ali Mengal");
	}
}

class IMSA extends Thread 
{
	public void run()
	{
		System.out.println("Farhan");
	}
}

class ICMA extends Thread 
{
	public void run()
	{
		System.out.println("Azan");
	}
}

class Thread008
{
	public static void main(String[] args) {
		
		USINDH th1=new USINDH();
		IMSA   th2=new IMSA();
		ICMA   th3=new ICMA();

		th1.start();
		th2.start();
		th3.start();
	}
}