package com.revature.pixott.handler;

import com.revature.pixott.Admin.Adminmenu;
import com.revature.pixott.Dao.Logindao;
import com.revature.pixott.app.App;
import com.revature.pixott.dummy.Findid;

public class Loginhandler {

	public static int idofusername;

	public static void users() {
		App.scanner.nextLine();
		System.out.println("Number");
		String diff = App.scanner.nextLine();
		System.out.println("Password");
		String pass = App.scanner.nextLine();
		String adminpass = "pass";
		boolean result = Logindao.resultcheck(diff,pass);
		String gem = Logindao.nameuser(diff);
		if(diff.contains("99999") && pass.equals(adminpass)) {
			System.out.println("welcome Admin");
			System.out.println();
			Adminmenu.menu();
			
			
		}
		else if(result) {
			System.out.println("You have succesfully Logged in");
			System.out.println("welcome Back "+ gem);
			System.out.println();
			System.out.println();
			idofusername=Findid.id(diff);
			Customermenu.menu();
			 
			
			
		}
		else {
			System.out.println("Invalid Username / Password");
			System.out.println();
			MainMenuHandler.dis();
		}
		
	}

}
