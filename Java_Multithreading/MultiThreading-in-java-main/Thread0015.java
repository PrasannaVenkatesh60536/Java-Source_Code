class Thread0015 implements Runnable 
{
	public void run()
	{
		System.out.println("Child Thread");
	}

	public static void main(String[] args) 
	{
		Thread0015 th1=new Thread0015();
		Thread0015 th2=new Thread0015();
		Thread0015 th3=new Thread0015();

		Thread th=new Thread(th1);
		Thread th0=new Thread(th2);
		Thread th11=new Thread(th3);


		System.out.println("Priority of th1: " + th.getPriority());
		System.out.println("Priority of th2: " + th0.getPriority());
		System.out.println("Priority of th3: " + th11.getPriority());

		th.setPriority(7);
		th0.setPriority(8);
		th11.setPriority(9);

		System.out.println("\nPriority of th: " + th.getPriority());
		System.out.println("Priority of th0: " + th0.getPriority());
		System.out.println("Priority of th11: " + th11.getPriority());

		System.out.println("\n"+Thread.currentThread().getName());

		th.setName("Faraz");
		System.out.println("Now currentThread Name is:"+th.getName());
		
		th.start();
	}
}

