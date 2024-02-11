package com.synchronizedkeyword;

public class Hospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Treatment t=new Treatment();
		//creating the threads
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		//setting the names
		t1.setName("Tom");
		t2.setName("Jerry");
		
		
		//calling the run methods by using start methods
		t1.start();
		t2.start();

	}

}
