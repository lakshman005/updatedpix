package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.revature.pixott.Model.Movie;
import com.revature.pixott.Model.Watchlist;

public class Watchlistdao {
	public static String result(int id){
		String sql ="select name from movie where id =(?)";
		String name = "";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			    stmt.setInt(1,id);
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					name=rs.getString("name");
				}
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return name;
		
	}

}
