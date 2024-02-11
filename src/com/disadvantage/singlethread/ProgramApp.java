package com.disadvantage.singlethread;

public class ProgramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of Number printing and CharPrinting classes
		NumPrinting np=new NumPrinting();
		CharPrinting cp=new CharPrinting();
		//calling the run method of classes using start method
		np.start();
		cp.start();

	}

}
