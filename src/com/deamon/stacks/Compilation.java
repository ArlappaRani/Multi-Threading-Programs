package com.deamon.stacks;

public class Compilation {
	public void run()
	{
		try {
		for( ; ;)//creating infinite loop for daemon threads
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
