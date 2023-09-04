class Thread0010 extends Thread
{
			public void run() 
			{
				System.out.println("Child Thread Priority: " + Thread.currentThread().getPriority());
			}

			public static void main(String[] args)
			{
				System.out.println("Main Thread Priority: " + Thread.currentThread().getPriority());

				Thread0010 th = new Thread0010();
				th.setPriority(7);
				th.start();
			}
	
}