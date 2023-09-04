class JointMethod03 extends Thread 
{
	static Thread Faraz;

	public void run()
	{
		
		try 
		{
			Faraz.join();
			//th.join();
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}	

			catch(Exception e)
				{
 					e.printStackTrace();
				}
}
		
	

	public static void main(String[] args) throws Exception

	{
		JointMethod03 th1=new JointMethod03();
		//Thread th=new Thread();
	

		 th1.start();
		  Faraz=Thread.currentThread();

			// th.setName("Faraz");
			// th.getName();
			// th.join();
		try
		{
			 
			for(int i=10;i<=15;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}	
			catch(Exception e)
			{
			e.printStackTrace();
			}			
	}
}
