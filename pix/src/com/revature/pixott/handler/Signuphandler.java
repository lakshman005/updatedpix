package com.revature.pixott.handler;

import com.revature.pixott.Dao.Signupdao;
import com.revature.pixott.app.App;

public class Signuphandler {

	public static void displayresult() {
		App.scanner.nextLine();
		System.out.println("Name");
		String name = App.scanner.nextLine();
		System.out.println("Mobile");
		String number = App.scanner.nextLine();
		System.out.println("Password");
		String password = App.scanner.nextLine();
		System.out.println(Signupdao.insertdetails(name,number,password));
		
		
		
	}

}
