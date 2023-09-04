import java.util.*;
class Addition implements Runnable 
{

	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int add=num1+num2;
		System.out.print("\nAddition is:"+add);
	}
}

class Subtraction implements Runnable 
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int sub=num1-num2;
		System.out.print("\nSubtraction is:"+sub);
	}
}

class Multiplication implements Runnable 
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int multi=num1*num2;
		System.out.print("\nMultiplication is:"+multi);
	}
}

class Division implements Runnable
{
	Scanner sc=new Scanner(System.in);
	public void run()
	{
		System.out.print("Enter 1st Number:");
		int num1=sc.nextInt();

		System.out.print("Enter 2nd Number:");
		int num2=sc.nextInt();

		int div=num1/num2;
		System.out.print("\nDivision is:"+div);
	}
}

class Thread16
{
	public static void main(String[] args) 
	{
			Scanner sc=new Scanner(System.in);
			//Addition add=new Addition();
	
			System.out.println("\n________________\n");

			System.out.println(" "+"1.Addition");
			System.out.println(" "+"2.Substraction");
			System.out.println(" "+"3,MultiPlication");
			System.out.println(" "+"4.Division");
			System.out.println(" "+"5.Exit");

			System.out.println("\n________________\n");

			System.out.print("\nSelect Number:");
			int num=sc.nextInt();

			if(num==1)
			{
				Addition add1=new Addition();
				Thread add=new Thread(add1);
				add.start();
			}

			if(num==2)
			{
				Subtraction sub1=new Subtraction();
				Thread sub=new Thread(sub1);
				sub.start();
			}

			if(num==3)
			{
				Multiplication multi1=new Multiplication();
				Thread multi=new Thread(multi1);
				multi.start();
			}

			if(num==4)
			{
				Division div1=new Division();
				Thread div=new Thread(div1);
				div.start();
			}

			if(num==5)
				System.exit(0);


	}
}