package com.revature.pixott.handler;

import com.revature.pixott.Customeraccess.DisplayTop5;
import com.revature.pixott.Dao.Wishlistdao;
import com.revature.pixott.Dao.historydao;
import com.revature.pixott.app.App;

public class Customermenu {
	public static void menu() {
		System.out.println("Menu");
		System.out.println("====");
		System.out.println("1) View Top 5 Movies");
		System.out.println("2) Search Movies");
		System.out.println("3) Your Wish List");
		System.out.println("4) View History");
		System.out.println("5) Logout");
		int options = App.scanner.nextInt();
		if(options==1) {
			DisplayTop5.Displaymovies();
		}
		else if(options==2) {
			Searchmoviehandler.searchmovie();
			
		}
		else if(options==3) {
			int a=Loginhandler.idofusername;
			Wishlistdao.wish(a);
			Customermenu.menu();
		}
		else if(options==4) {
			int b=Loginhandler.idofusername;
			historydao.ans(b);
			Customermenu.menu();
			
		}
		else if(options==5) {
			System.out.println("Logged out Succesfully");
			System.out.println("======================");
			MainMenuHandler.dis();
			
		}
		else {
			System.out.println("Invalid Selection");
			System.out.println("==================");
			Customermenu.menu();
		}
	}

}
