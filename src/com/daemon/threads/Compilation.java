package com.daemon.threads;

public class Compilation extends Thread {
	public void run()
	{
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println("compiling  the code");
			Thread.sleep(2000);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}
}
