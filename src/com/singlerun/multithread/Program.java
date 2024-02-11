package com.singlerun.multithread;

public class Program implements Runnable {
	
	public void run() {
		
	
	//Getting the name of the new thread and checking if the new thread name is 
	//equals to Number then it calls NumPrinting method else it calls CharPrinting
	if(Thread.currentThread().getName().equals("Number"))
	{
		numPrinting();
	}
	else 
	{
		CharPrinting();
	}
	}
	public void numPrinting()
	{
		try {
			System.out.println("Number Printing is started");
			for(int i=0;i<=5;i++)
			{
				System.out.println("Number"+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}	
		System.out.println("Number Printing is Ended");
		}
	public void CharPrinting()
	{
		try {
			System.out.println("Charcter Printing is started");
			for(char i='a';i<='e';i++)
			{
				System.out.println("Character"+i);
				Thread.sleep(2000);
			}
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		System.out.println("Charcter Printing is ended");
	}
	
	
}


