package com.kodnest.singlethread;

public class SingleThreadProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println(t);
		//changing the thread name and priority of thread
		t.setName("MyThread");
		t.setPriority(3);
		
		System.out.println(t);
	}
}
	


