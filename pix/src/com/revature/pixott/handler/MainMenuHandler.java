package com.revature.pixott.handler;

import com.revature.pixott.app.App;

public class MainMenuHandler {
	public static void dis() {
		System.out.println("PIX OTT APP");
		System.out.println("=============");
		System.out.println("1==>>>>  Signup");
		System.out.println("2==>>>>  Login");
		System.out.println("3==>>>>  Exit");
		System.out.println("=============");
		int ops = App.scanner.nextInt();
		if (ops == 1) {
			Signuphandler.displayresult();
			MainMenuHandler.dis();
		}
		else if(ops==2) {
			Loginhandler.users();
			
		}
		else {
			System.out.println("THANK YOU FOR  USING THE APP");
		}
	}

}
