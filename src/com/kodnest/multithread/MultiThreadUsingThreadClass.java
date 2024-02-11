package com.kodnest.multithread;

public class MultiThreadUsingThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		//creating the object of Thread class partially
		Program pr=new Program();
		//changing the thread name
		pr.setName("ProgramThread");
		//calling the run method internally by using the start method
		pr.start();

	}

}
