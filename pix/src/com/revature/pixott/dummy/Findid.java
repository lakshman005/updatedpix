package com.revature.pixott.dummy;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.Dao.Util;

public class Findid {
	public static int id(String diff) {
		String sql ="select id from username where number =(?)";
		int num = 0;
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setString(1,diff);
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				  num=rs.getInt("id"); 
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return num;
		
		
	}

}
