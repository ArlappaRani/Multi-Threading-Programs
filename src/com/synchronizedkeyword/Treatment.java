package com.synchronizedkeyword;

public class Treatment implements Runnable{
	 synchronized public void run()
	{
	String name=Thread.currentThread().getName();
	try {
		System.out.println("Treatment is started in ICU for"+name);
		Thread.sleep(2000);
		System.out.println("Treatment is going on ICU for"+name);
		Thread.sleep(2000);
		System.out.println("Treatment is Completed in ICU for"+name);
		Thread.sleep(2000);
		}
	catch(Exception e)
	{
		e.printStackTrace();
	}

}
}
