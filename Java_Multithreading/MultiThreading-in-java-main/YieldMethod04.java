class YieldMethod04 extends Thread 
{
	
	public void run()
	{
		Thread.yield();
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Child Thread");
				Thread.yield();
			}
		}

		catch(Exception e)
		{
			System.out.println("Exception in Child Thread ");
		}
	}

	public static void main(String[] args) 
	{
		YieldMethod04 th1=new YieldMethod04(); 
		YieldMethod04 th2=new YieldMethod04();

		Thread.yield();
		th1.start();

		th2.start();
	}
}
