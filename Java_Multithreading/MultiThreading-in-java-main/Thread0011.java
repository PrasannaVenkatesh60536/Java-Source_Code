class Thread0011 implements Runnable
{
	public void run()
	{
			System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		Thread0011 th1=new Thread0011();

		System.out.println("Main Priority: "+Thread.currentThread().getPriority());
		Thread th=new Thread(th1);
		th.setPriority(7);
		th.start();
	}
}