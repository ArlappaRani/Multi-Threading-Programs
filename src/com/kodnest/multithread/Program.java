package com.kodnest.multithread;

public class Program extends Thread{
	//creating a run method
	public void run()
	{
	Thread t=Thread.currentThread();
	System.out.println(t); ;

}
}