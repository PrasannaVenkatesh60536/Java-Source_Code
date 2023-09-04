import java.util.*;
class Addition extends Thread
{
	Scanner sc=new Scanner(System.in);

	public void run()
	{
		System.out.print("\nEnter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int add=num1+num2;
		System.out.print("Addition is:"+add);
	}
}

class Subtraction extends Thread 
{
	Scanner sc=new Scanner(System.in);

	public void run()
	{
		System.out.print("\nEnter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int sub=num1-num2;
		System.out.print("Subtraction is:"+sub);
	}
}

class Multiplication extends Thread 
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.print("\nEnter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int multi=num1*num2;
		System.out.print("Multiplication is:"+multi);
	}
}

class Division extends Thread 
{
	Scanner sc=new Scanner(System.in);


	public void run()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int div=num1/num2;
		System.out.print("Division is:"+div);	
	}
}

class Thread006
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		
		
			System.out.println("\n____________________\n");

			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");

			System.out.println("\n____________________\n");

			System.out.print("\nSelect Number:");
			int num=sc.nextInt();

			if(num==1)
				{
					Addition add=new Addition();
					add.start();
				}

			if(num==2)
				{
					Subtraction sub=new Subtraction();
					sub.start();
				}

			if(num==3)
				{
					Multiplication multi=new Multiplication();

					multi.start();
				}

			if(num==4)
				{
					Division div=new Division();

					div.start();
				}

			if(num==5)
					System.exit(0);
	
	}
}