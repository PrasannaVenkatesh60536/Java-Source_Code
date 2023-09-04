
class JointMethod02 implements 	Runnable
{
	public void run()
	{
		try 
		{
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

	public static void main(String[] args) 
	{
		JointMethod02 th1=new JointMethod02();

		Thread th2=new Thread(th1);
		th2.start();

			try
		{
			th2.join();
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