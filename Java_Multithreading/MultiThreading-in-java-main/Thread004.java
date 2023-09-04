import java.util.*;
class Thread004 extends Thread
{
	Scanner sc=new Scanner(System.in);

	public void run()
	{

		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.MultiPlication");
		System.out.println("4.Division");

		System.out.print("\nSelect Number From Above:");
		int num=sc.nextInt();

		if(num==1)
		{
			System.out.print("\nEnter 1st Number:");
			int first=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int second=sc.nextInt();

			int add=first+second;
			System.out.print("\nAddition is:"+add);
		}
		
		if(num==2)
		{
			System.out.print("\nEnter 1st Number:");
			int first=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int second=sc.nextInt();

			int sub=first-second;
			System.out.print("\nSubtraction is:"+sub);
		}	

		if(num==3)
		{
			System.out.print("\nEnter 1st Number:");
			int first=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int second=sc.nextInt();

			int mult=first*second;
			System.out.print("\nMultiPlication is:"+mult);
		}

		if(num==4)
		{
			System.out.print("\nEnter 1st Number:");
			int first=sc.nextInt();

			System.out.print("Enter 2nd Number:");
			int second=sc.nextInt();

			int div=first/second;
			System.out.print("\nDivision is:"+div);
		}
	}

	public static void main(String[] args) {
		
		Thread004 t=new Thread004();
		
		t.start();
	
	}
}