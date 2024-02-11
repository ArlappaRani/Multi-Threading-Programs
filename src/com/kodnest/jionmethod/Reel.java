package com.kodnest.jionmethod;

public class Reel extends Thread  {
	public void run()
	{
		try {
		System.out.println("Creating the reel");
		Thread.sleep(3000);
		System.out.println("Posting the reel");
		Thread.sleep(3000);
		System.out.println("Reel uploading is completed");
		Thread.sleep(3000);
	}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	


}
}
