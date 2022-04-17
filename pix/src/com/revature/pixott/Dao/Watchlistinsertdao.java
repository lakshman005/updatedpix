package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.Model.Movie;

public class Watchlistinsertdao {
	public static void insert(String moviename) {
		String sql="insert into Watchlist(Movies) values(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setString(1,moviename);
			 stmt.executeUpdate();
			 System.out.println("Movie added to Watchlist");
	
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			
		
	}
	public static void insertid(int a,String moviename) {
		String sql="update watchlist set login_id=(?) where movies=(?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
			 stmt.setInt(1,a);
			 stmt.setString(2,moviename);
			 stmt.executeUpdate();
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
		
		
		
	}

}
