package com.synchronizedbloack;

public class Hospital {
	String res1="Doctor";
	String res2="Bed";
	public void tomTreatement()
	{
		
	try {
		synchronized(res1)
		{
		 System.out.println("Tom is Using"+res1);
		 Thread.sleep(2000);
		 synchronized(res2)
		 {
			 System.out.println("Tom is Using"+res2);
			 Thread.sleep(2000);
		 }
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	
	}
	public void JerryTreatment()
	{
		try {
			synchronized(res1) {
			System.out.println("Jerry is using"+res1);
			Thread.sleep(2000);
			synchronized(res2)
			{
				System.out.println("Jerry is using"+res2);
				Thread.sleep(2000);
			}
		}
	}
		catch(Exception e)
		{
			e.printStackTrace();
		}
			
	}	
	
	

}
