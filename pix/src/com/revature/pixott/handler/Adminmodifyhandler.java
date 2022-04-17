package com.revature.pixott.handler;

import com.revature.pixott.Admin.Adminmenu;
import com.revature.pixott.Dao.Movienames;
import com.revature.pixott.Dao.Searchmoviesdao;
import com.revature.pixott.Dao.UpdateIdmovie;
import com.revature.pixott.app.App;

public class Adminmodifyhandler {
	public static void modify() 
	{
		App.scanner.nextLine();
		System.out.println("Search a Movie with Keyword");
		String moviename = App.scanner.nextLine();
		Searchmoviesdao.search(moviename);
		System.out.println("Select a Movie to Update Enter [ID]");
		int select = App.scanner.nextInt();
		System.out.println("what is the Updated name for Movie with Id"+select+"?");
		App.scanner.nextLine();
		String updated = App.scanner.nextLine();
		String name=Movienames.method(select);
		UpdateIdmovie.update(updated, select);
		Adminmenu.menu();
		
	}

}
