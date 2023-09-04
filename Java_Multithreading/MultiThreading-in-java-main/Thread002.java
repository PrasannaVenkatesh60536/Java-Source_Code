class Thread002
{
	public static void main(String[] args) 
	{
		
		Thread t1=new Thread();
		Thread t2=new Thread();

		System.out.println("Main Thread Object t1 is:"+t1);
		System.out.println("Current Thread Object is:"+Thread.currentThread());

		System.out.println("\nMain Thread Object t2 is:"+t2);
		System.out.println("Current Thread Object t2 is:"+Thread.currentThread());

		t1.setName("Imagine Tech");
		System.out.println("\nAfter Chnage t1 Thread Name is:"+t1);
		System.out.println("After Change Thread t1 Name is:"+t1.getName());

		t2.setName("Imagine Institute");
		System.out.println("\nAfter Change t2 Thread Name is:"+t2);
		System.out.println("After Change Thread t2 Name is:"+t2.getName());
	}
}