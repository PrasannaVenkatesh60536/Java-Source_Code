class Test extends Thread
{
	 
	 Thread th=Thread.currentThread();

	public void run()
	{
		try 
		{
			 th.join();
			
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

		catch(Exception e)
		{
			System.out.print(" ");
		}
	}
}

class JoinMethod04 extends Test
{
		public  static void main(String[] args) 
		{
			Test th1=new Test();

			//faraz=Thread.currentThread();
			 th1.start();
			//faraz.join();
			//th1.join();

			try 
			{
				for(int i=10;i<=15;i++)
				{
					System.out.println(i);
					Thread.sleep(1000);				}
			}

			catch(Exception e)
			{
				System.out.println("");
			}
		}
}