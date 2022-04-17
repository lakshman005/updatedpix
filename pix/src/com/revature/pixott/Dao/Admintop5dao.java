package com.revature.pixott.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.pixott.Model.admintopmodel;

public class Admintop5dao {
	public  List<admintopmodel> Top() {
		String sql = "select * from top5 t left join movie m on t.name=m.name;";
		List<admintopmodel> res = new ArrayList();
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					admintopmodel review = new admintopmodel();
					review.setName(rs.getString("name"));
					review.setId(rs.getInt("id"));
					res.add(review);
				}
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			return res;

}
}
