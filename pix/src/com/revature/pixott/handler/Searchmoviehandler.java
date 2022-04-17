package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.Customeraccess.DisplayTop5;
import com.revature.pixott.Dao.Searchmoviesdao;
import com.revature.pixott.Model.Top5Movies;
import com.revature.pixott.app.App;

public class Searchmoviehandler {
	public static void searchmovie() {
		App.scanner.nextLine();
		System.out.println("find Movie");
		System.out.println("==========");
		String moviename= App.scanner.nextLine();
		Searchmoviesdao.search(moviename);
		DisplayTop5.menuhandler();
		
	}
	

}
