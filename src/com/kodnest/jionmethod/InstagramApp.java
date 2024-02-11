package com.kodnest.jionmethod;

public class InstagramApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Insta App started");
        //creating the objects of two independent activities
		Chatting ch=new Chatting();
		Reel rl=new Reel();
		
		//Calling the start methods
		ch.start();
		rl.start();
		
		
		
		//using join method for delay execution of main
		try {
		ch.join();
		rl.join();
	     }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Insta app is ended");

}
}
