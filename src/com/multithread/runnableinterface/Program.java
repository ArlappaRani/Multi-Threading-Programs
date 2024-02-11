package com.multithread.runnableinterface;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of the classes
		NumPrinting np=new NumPrinting();
		CharPrinting cp=new CharPrinting();
		
		//creating the thread objects and assigning the activities of classes
		Thread t1=new Thread(np);
		Thread t2=new Thread(cp);
		
		//Calling the start methods
		t1.start();
		t2.start();

	}

}
