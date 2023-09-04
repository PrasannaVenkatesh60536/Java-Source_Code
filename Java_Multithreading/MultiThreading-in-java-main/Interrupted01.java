class Test extends Thread 
{
	public void run()
	{
		try 
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}

		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}

class Interrupted01
{
	public static void main(String[] args) 
	{ 
		Test th1=new Test();
		Test th2=new Test();
		Test th3=new Test();

		th1.interrupted();
		th1.start();

		th2.start();
		th3.start();

	}
}