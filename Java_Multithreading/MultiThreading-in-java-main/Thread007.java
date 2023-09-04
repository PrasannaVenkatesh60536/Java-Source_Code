class Thread007 
{
b	public void run()
	{
		System.out.println(getName());
	}

	public static void main(String[] args) 
	{
		Thread007 th1=new Thread007();
		Thread007 th2=new Thread007();
		Thread007 th3=new Thread007();

		th1.setPriority(Thread.MIN_PRIORITY);
		th2.setPriority(Thread.NORM_PRIORITY);
		th3.setPriority(Thread.MAX_PRIORITY);

		System.out.println("Priority of th1:"+th1.getPriority());
		System.out.println("Priority of th2:"+th2.getPriority());
		System.out.println("priority of th3:"+th3.getPriority());

		th1.start();
		th2.start();
		th3.start();
	}
}