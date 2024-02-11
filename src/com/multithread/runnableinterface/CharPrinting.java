package com.multithread.runnableinterface;

public class CharPrinting implements Runnable {
	
	public void run()
	{
		try {
		for(char i='a';i<='e';i++)
		{
			System.out.println("Character"+i);
			Thread.sleep(2000);
		}
	}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
       System.out.println("Character printing is ended");
}
}
