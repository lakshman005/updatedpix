package com.revature.pixott.Dao;

import java.util.List;

import com.revature.pixott.Admin.Adminmenu;
import com.revature.pixott.Customeraccess.ViewTop5;
import com.revature.pixott.Model.Top5;
import com.revature.pixott.app.App;

public class Adminremovedao {
	public static void remove() {
			ViewTop5 dao = new ViewTop5();
			List<Top5> res = dao.Top();
			System.out.println("Movies");
			System.out.println();
			res.forEach(System.out::println);
			System.out.println();
			Adminmenu.menu();
		}	
		

}
