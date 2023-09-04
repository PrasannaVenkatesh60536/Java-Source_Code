class Thread005 implements Runnable
{
	public void run()
	{
		System.out.print("Faraz");
	}

	public static void main(String[] args) {
		
		Thread005 t=new Thread005();

		Thread t1=new Thread(t);

		t1.start();
	}

}