package com.disadvantage.singlethread;

public class CharPrinting extends Thread{
	public void run()
	{
		try {
		for(char i='a';i<='e';i++)
		{
			System.out.println("Character"+i);
			Thread.sleep(3000);
		}
	}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println("Character printing is ended");

}
}
