package com.deamon.stacks;

public class Typing {
	public void run()
	{
		try {
		for(int i=1;i<=5;i++)
		{
			System.out.println("Typing the code");
			Thread.sleep(2000);
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

}
}
