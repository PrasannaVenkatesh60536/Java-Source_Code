class USindh extends Thread 
{
	public void run()
	{
		System.out.println("Faraz Ali");
	}
}

class IMSA extends USindh 
{
	public void name()
	{
		System.out.println("Farhan");
	}
}

class ICMA extends IMSA 
{
	public void name()
	{
		System.out.println("Azan");
	}
}

class Thread009
{
	public static void main(String[] args) {
		
		ICMA ob=new ICMA();

		ob.start();
	}
}