package com.revature.pixott.Admin;

import com.revature.pixott.Dao.Admintop5insertdao;
import com.revature.pixott.app.App;
import com.revature.pixott.handler.Adminmodifyhandler;
import com.revature.pixott.handler.Loginhandler;
import com.revature.pixott.handler.MainMenuHandler;

public class Adminmenu {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("=====");
		System.out.println("1)   Change Top 5 Movies");
		System.out.println("2)   Mark Movies Unavailable");
		System.out.println("3)   Modify Movie Details");
		System.out.println("4)   Logout");
		int ops = App.scanner.nextInt();
		if(ops==1) {
			System.out.println("Current Top 5 Movies");
			System.out.println("====================");
			Admintop5insertdao.Displaymovies();	
		}
		else if(ops==3) {
			Adminmodifyhandler.modify();
		}
		else if(ops==4) {
			System.out.println("You have been Logged out");
			System.out.println(Loginhandler.idofusername);
			MainMenuHandler.dis();
		}
		else {
			System.out.println("Wrong Selection check the Number");
			Adminmenu.menu();
		}
	}

}
