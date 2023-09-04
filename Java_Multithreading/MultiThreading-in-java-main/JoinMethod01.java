class JoinMethod01 extends Thread 
{
	public void run()
	{
		try 
		{
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(100);
			}
		}	

			catch(Exception e)
			{
				e.printStackTrace();
			}
		
	}

	public static void main(String[] args)
	{
		JoinMethod01  th1=new JoinMethod01();

		th1.start();

		try
		{
			th1.join();
			}

			catch(Exception e)
			{
				System.out.print(" Faraz");
			}	

	
		try 
		{
			//th1.join();
			for(int i=1;i<=5;i++)
			{


				System.out.println(i);
				Thread.sleep(100);
			}
		}	
			catch(Exception e)
			{
			e.printStackTrace();
		
		}
	}
}