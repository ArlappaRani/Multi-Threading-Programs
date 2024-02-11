package com.singlerun.multithread;

public class ProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the object of class in which activities are present
     Program prog=new Program();
     
     //creating the objects of thread and assigning the activities
     Thread t1=new Thread(prog);
     Thread t2=new Thread(prog);
     
     //changing the name of the thread
     t1.setName("Number");
     t2.setName("Char");
     
     //calling the run method
     t1.start();
     t2.start();
	}

}
