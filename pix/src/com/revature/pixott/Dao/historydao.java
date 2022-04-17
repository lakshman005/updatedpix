package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class historydao {
	public static void ans(int b) {
		String sql="select movies from history h join username u on h.login_id=u.id where id=(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setInt(1,b);
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  System.out.println("======>   "+rs.getString("movies"));
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
	}

}
