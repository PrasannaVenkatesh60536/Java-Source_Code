class Document extends Thread 
{
	public void run()
	{
		try 
		{
				System.out.println("Documents Checkes");
				Thread.sleep(1000);
				//System.out.println("Documents Checked");
		}

		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

class Photo extends Thread 
{
	public void run() 
	{
		try 
		{
				System.out.println("Take Photos");
				Thread.sleep(1000);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}		
	}
}

class Form extends Thread 
{
	public void run()
	{
		try 
		{		
				System.out.println("Form Required");
				Thread.sleep(1000);
		}

	catch(Exception e)
			{
				e.printStackTrace();
			}
	}		
}

class Signature extends Thread 
{
	public void run()
	{
		try 
		{
				System.out.println("Signature");
				Thread.sleep(1000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

class NadraThread 
{
	public static void main(String[] args) throws Exception
	{
		Document th1=new Document();
		Photo th2=new Photo();
		Form th3=new Form();
		Signature th4=new Signature();

		th1.start();
		th1.join();
		//Thread.sleep(1000);

		th2.start();
		th2.join();
		//Thread.sleep(1000);

		th3.start();
		th3.join();
		//Thread.sleep(1000);

		th4.start();
		th4.join();
		//Thread.sleep(1000);
	}
}