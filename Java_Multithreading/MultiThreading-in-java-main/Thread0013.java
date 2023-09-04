class Thread0013 implements Runnable 
{
	public void run()
	{
		System.out.println("Child Thread Priority :"+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) 
	{
		Thread0013 th1=new Thread0013();


		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

		//Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Main Thread MIN_PRIORITY: " + Thread.currentThread().getPriority());

		//Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("Main Thread NORM_PRIORITY: " + Thread.currentThread().getPriority());

		//Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Main Thread MAX_PRIORITY: " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(7);
		System.out.println("MAIN Thread PRIORITY IS NOW: " + Thread.currentThread().getPriority());

		 
		Thread th=new Thread(th1);		
		th.setPriority(10);
		th.start();

	}
}