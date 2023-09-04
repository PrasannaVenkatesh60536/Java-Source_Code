class YeildMethod01 extends Thread 
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
		YeildMethod01 th1=new YeildMethod01();

		th1.start();

			try 
		{
			th1.yield();
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