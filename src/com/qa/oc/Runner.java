package com.qa.oc;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Why do this...
		Greeter grt = new Greeter(new CasualGreeting());
	
		System.out.println(grt.greet());
		
		//If you can do this?
		FormalGreeting fgt = new FormalGreeting();
		System.out.println(fgt.greet());
		
		
		

	}

}
