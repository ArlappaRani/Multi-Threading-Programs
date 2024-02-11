package com.daemon.threads;

public class Saving extends Thread{
	public void run()
	{
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Saving  the code");
			Thread.sleep(2000);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	


}
}
