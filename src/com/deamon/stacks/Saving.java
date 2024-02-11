package com.deamon.stacks;

public class Saving {
	public void run()
	{
		try {
		for( ; ; )//creating the infinite loop for daemon thread
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
