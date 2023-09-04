class Test implements Runnable
{
	public void run()
	{
		System.out.println("HELLO THREAD STARTING");
	}
}

class Multithreading002
{
	public static void main(String[] args)
	 {
		
		Test ob=new Test();
		Thread th=new Thread(ob);
		th.start();

		System.out.println("Always Start With Thread");

	}
}