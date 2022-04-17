package com.revature.pixott.Customeraccess;

import java.util.List;

import com.revature.pixott.Dao.Historylistinsertdao;
import com.revature.pixott.Dao.Watchlistdao;
import com.revature.pixott.Dao.Watchlistinsertdao;
import com.revature.pixott.Model.Top5;
import com.revature.pixott.app.App;
import com.revature.pixott.handler.Customermenu;
import com.revature.pixott.handler.Loginhandler;
public class DisplayTop5 {
	public static void Displaymovies() {
		ViewTop5 dao = new ViewTop5();
		List<Top5> res = dao.Top();
		System.out.println("Movies");
		System.out.println();
		res.forEach(System.out::println);
		System.out.println();
		menuhandler();
	}	
		
		
		public static void menuhandler() {
			
		
		System.out.println("select A Movie enter Id");
		int id =App.scanner.nextInt();
		System.out.println("1)  Add to watchList");
		System.out.println("2)  Play Movie");
		int ans = App.scanner.nextInt();
		
		if(ans==1) {
			String moviename = Watchlistdao.result(id);
			Watchlistinsertdao.insert(moviename);
			int a=Loginhandler.idofusername;
			Watchlistinsertdao.insertid(a,moviename);
			Customermenu.menu();
			
			
			
		}
		else if (ans==2) {
			System.out.println("Playing the Movie , Grab  a Popcorn");
			System.out.println("Movie Ended");
			String adder=Watchlistdao.result(id);
			Historylistinsertdao.insert(adder);
			int b = Loginhandler.idofusername;
			Historylistinsertdao.insertid(adder,b);
			Customermenu.menu();
			
			
			
		}
		}
}		
		
		
		
	
	

