package com.disadvantage.singlethread;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintNum();
		PrintChar();

	}
	public static void PrintNum()
	{
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			Thread.sleep(3000);
		}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	public static void PrintChar()
	{
		try {
		for(char i='a';i<='e';i++)
		{
			System.out.println(i);
			Thread.sleep(3000);
		}
		
	}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}

}
}
