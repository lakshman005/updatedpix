package com.revature.pixott.handler;

import com.revature.pixott.Customeraccess.DisplayTop5;
import com.revature.pixott.Dao.Adminremovedao;
import com.revature.pixott.Dao.Movienames;
import com.revature.pixott.Dao.Searchmoviesdao;
import com.revature.pixott.Dao.UpdateIdmovie;
import com.revature.pixott.Dao.Updatemoviedao;
import com.revature.pixott.app.App;

public class Adminhandler {
	public static void remove() {
		System.out.println("Select a Movie to Remove from Top5 (EnterId) :");
		int idofmovie=App.scanner.nextInt();
		System.out.println("Search a Movie with Keyword");
		App.scanner.nextLine();
		String original = App.scanner.nextLine();
		Searchmoviesdao.search(original);
		System.out.println("Select a Movie to Add to top 5 (Enter Id)");
		int changemovie = App.scanner.nextInt();
		String name=Movienames.method(changemovie);
		Updatemoviedao.update(idofmovie,name);
		int total=UpdateIdmovie.updateid(name);
		UpdateIdmovie.insertid(total, name);
		System.out.println();
		System.out.println("Top 5 Movies After Changes");
		System.out.println("============================");
		Adminremovedao.remove();
		
		
		
		
	}

}
