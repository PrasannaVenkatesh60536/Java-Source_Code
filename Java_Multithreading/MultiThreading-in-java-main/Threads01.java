class Threads01 extends Thread 
{
	public void run()
	{
		System.out.print("Faraz Ali");
	}

	public static void main(String[] args) {
		 
		 Threads01 th1=new Threads01();
		 th1.start();

	}
}

