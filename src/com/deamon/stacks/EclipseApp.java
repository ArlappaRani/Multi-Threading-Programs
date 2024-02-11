package com.deamon.stacks;

import com.daemon.threads.Compilation;
import com.daemon.threads.Saving;
import com.daemon.threads.Typing;

public class EclipseApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the objects of class
		Typing typ=new Typing();
		Compilation cmp=new Compilation();
		Saving sav=new Saving();
		
		//calling the start methods
		typ.start();
		//set the daemon value for supporting activity
		cmp.setDaemon(true);
		sav.setDaemon(true);
		
		
		
		cmp.start();
		sav.start();
		

	}


	}


