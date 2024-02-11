package com.daemon.threads;

public class EclipseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of class
		Typing typ=new Typing();
		Compilation cmp=new Compilation();
		Saving sav=new Saving();
		
		//calling the start methods
		typ.start();
		cmp.start();
		sav.start();
		

	}

}
