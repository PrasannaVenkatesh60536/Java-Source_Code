class Thread0014 extends Thread
{
	public void run()
	{
		System.out.println("Child Thread");
	}

	public static void main(String[] args) 
	{
		Thread0014 th1 = new Thread0014();
		Thread0014 th2 = new Thread0014();
		Thread0014 th3 = new Thread0014();

		System.out.println("Priority of th1: " + th1.getPriority());
		System.out.println("Priority of th2: " + th2.getPriority());
		System.out.println("Priority of th3: " + th3.getPriority());
 
		th1.setPriority(7);
		th2.setPriority(3);
		th3.setPriority(8);

		System.out.println("Change Priority of th1: " + th1.getPriority());
		System.out.println("Change Priority of th2: " + th2.getPriority());
		System.out.println("Change Priority of th3: " + th3.getPriority());

		System.out.println("\n" + Thread.currentThread().getName());

		th1.setName("Faraz Ali");
		System.out.println("Now Current Thread Name is: " + th1.getName());
	}

}