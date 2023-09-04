
class Interrupted003 extends Thread 
{
	public void run()
	{
		try 
		{
			System.out.println(Thread.currentThread().isInterrupted());
			System.out.println(Thread.currentThread().interrupted());

			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

		catch(Exception e)
		{
			System.out.println("Child Exception");
		}
	}

	public static void main(String[] args) 
	{
		Interrupted003 th=new Interrupted003();

		th.start();
		//th.interrupt();
	}
}