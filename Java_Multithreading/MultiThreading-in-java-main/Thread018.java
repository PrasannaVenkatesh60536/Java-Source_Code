class Thread018 extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) 
	{
		Thread018 th1=new Thread018();
		Thread018 th2=new Thread018();
		Thread018 th3=new Thread018();

		th1.setDaemon(true);
		th1.start();

		th2.start();
		th3.start();
	}
}