class Thread017 extends Thread
{
	public void run()
	{
		System.out.println("It is Daemon Thread");
	}

	public static void main(String[] args) 
	{
		System.out.print("It is Main Thread");

		Thread017 th1=new Thread017();
		th1.setDaemon(true);
		th1.start();
	}
}