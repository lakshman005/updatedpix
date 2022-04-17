package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Historylistinsertdao {
	public static void insert(String adder) {
		String sql="insert into history(movies) values(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setString(1,adder);
			 stmt.executeUpdate();
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			
		
	}
	public static void insertid(String adder,int b) {
		String sql = "update history set login_id =(?) where movies=(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setInt(1,b);
			 stmt.setString(2,adder);
			 stmt.executeUpdate();
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		
	}

}
