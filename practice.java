package fundamentals;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		practice obj=new practice();
		System.out.println("Enter the choice of function");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		while(choice!=0)
		{
			switch(choice) 
			{
			case 1:
			{
				obj.palindrome();
				break;
			}
			case 2:
			{
				obj.printpattern();
				break;
			}
			case 3:
			{
				obj.checkprime();
				break;
			}
			case 4:
			{
				obj.fib();
				break;
			}
			}
			System.out.println("Enter the next function to execute");
			System.out.println("Enter 0 for exiting");
			choice=sc.nextInt();
		}
		System.exit(0);
	}
	public static void palindrome()
	{
		System.out.println("Enter the number you want to check for palindrome?");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int rev=0;
		int temp=a;
		while(a>0)
		{
			int res=a%10;
			rev=rev*10+res;
			a=a/10;
		}
		if(temp==rev)
			System.out.println("Number is palindrome");
		else
			System.out.println("Not palin");
	}
	public static void printpattern()
	{
		System.out.println("Enter the pattern number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			n--;
			System.out.println();
		}
	}
	public static void checkprime()
	{
		System.out.println("Enter number to check if prime");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				k=1;
				break;
			}
		}
		if(k==1)
		System.out.println("not prime");
		else
		System.out.println("Prime");
	}
	public static void fib()
	{
		System.out.println("Enter number of fib pattern");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		System.out.print(a+","+b);
		for(int i=0;i<n-2;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			System.out.print(","+c);
		}	
		System.out.println();
	}	
}
