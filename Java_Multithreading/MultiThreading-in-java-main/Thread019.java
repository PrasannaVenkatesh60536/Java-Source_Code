class Thread019 extends Thread 
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("It is Daemon Thread");
		}
		else 
		{
			System.out.println("It is Not Daemon Thread");
		}
	}

	public static void main(String[] args) 
	{
		Thread019 th1=new Thread019();
		Thread019 th2=new Thread019();
		Thread019 th3=new Thread019();

		th1.setDaemon(true);
		th1.start();

		th2.start();
		th3.start();
	}
}