class Thread0012 extends Thread 
{
	public void run()
	{
		System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
	}

	public static void main(String[] args)
	{
		System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(MIN_PRIORITY);
		System.out.println("Main Thread MIN_PRIORITY: " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(NORM_PRIORITY);
		System.out.println("Main Thread NORM_PRIORITY: " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println("Main Thread MAX_PRIORITY: " + Thread.currentThread().getPriority());

		Thread.currentThread().setPriority(7);
		System.out.println("MAIN Thread PRIORITY IS NOW: " + Thread.currentThread().getPriority());

			Thread0012 th = new Thread0012();
			th.setPriority(3);
			th.start();
	}

}