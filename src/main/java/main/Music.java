package main;
import java.util.Scanner;

public class Music {
	static String ch;
	static int n;
	boolean t;
	public static void main(String []args)
	{ 
		Music ob1 = null;
		Scanner sc= new Scanner(System.in);
		 ob1.n=sc.nextInt();
		int m=sc.nextInt();
		if(n>=30)
		{
			outpt();
		}
		else
		{
			System.out.println("Low Battery!!!!"+"\n Music Player Stopped!!!");
		}
		sc.close();
	}
	public static void outpt() {
		boolean c=true;
		Music ob=new Music();
		System.out.println("Music On"+"\n  Playing Song 1");
		while(c)
		{
		System.out.println("Do you want to play again? : Yes/No");
		Scanner sc= new Scanner(System.in);
		ob.ch=sc.nextLine();
		if(ch.equals("yes"))
		{
			System.out.println("Invalid input string!!Enter Yes/No correctly!!");
			
		}
		else if(ch.equals("Yes"))
		{
			System.out.println("Playing Song 1");
		}
		else if(ch.equals("No"))
		{
			System.out.println("Do you want to continue with next song?:Yes/No");
			Scanner cp= new Scanner(System.in);
			String s1=cp.nextLine();
			if(s1.equals("Yes"))
			{
				System.out.println("Playing song 2");
				ob.n=ob.n-5;
			}
			else if(s1.equals("No"))
			{
				System.out.println("Do you want to Stop Music?:Yes/No");
				Scanner cp1= new Scanner(System.in);
				String s2=cp1.nextLine();
				if(s2.equals("Yes"))
				{
					System.out.println("Music Player Stopped!!!");
					c=false;
				}
				else if(s2.equals("No"))
				{
					System.out.println("RESTARTING"+"\n"+"RESUME");
					c=false;
				}
			}
		}
		}
	}

}
