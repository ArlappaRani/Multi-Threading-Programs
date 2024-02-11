package com.synchronizedbloack;

public class HospitalApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of classes
		Hospital h=new Hospital();
		Tom tom=new Tom(h);
		Jerry jerry=new Jerry(h);
		
		//creating the threads for activities and assigning the values
		Thread t1=new Thread(tom);
		Thread t2=new Thread(jerry);
		t1.start();
		t2.start();
		

	}

}
