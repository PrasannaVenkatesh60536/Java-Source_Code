class Interrupted02 extends Thread 
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				//Thread.sleep(1000);
			}
		}

		catch(Exception e)
		{
			System.out.print("Faraz");
		}
	}

	public static void main(String[] args) 
	{
		Interrupted02 th=new Interrupted02();

		th.start();
		th.interrupt();
	}
}