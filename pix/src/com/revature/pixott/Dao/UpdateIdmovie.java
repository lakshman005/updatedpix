package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UpdateIdmovie {
	public static int updateid(String name) {
		String sql="select id from movie where name=(?)";
		int total=0;
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setString(1,name);
			  ResultSet rs =stmt.executeQuery();
			  while(rs.next()) {
				 total=rs.getInt("id");
			  }
			 
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		return total;
	}
	public static void insertid(int total,String name) {
		String sql= "update top5 set rid=(?) where name=(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setInt(1,total);
			  stmt.setString(2,name);
			  stmt.executeUpdate();
			 
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		
	}
	public static void update(String total,int name) {
		String sql= "update movie set name=(?) where id=(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			  stmt.setString(1,total);
			  stmt.setInt(2,name);
			  stmt.executeUpdate();
			  System.out.println("Movies Details Updated  Successfully");
			 
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		
	}
	

}
