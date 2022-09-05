package com.mit;

import java.sql.*;

public class IMessageDAO {
	static Connection conn;
	static PreparedStatement pst;

	public static int insertMessage(IMessage m) {
		int status = 0;
		try {
			conn = DBConnection.getCon();
			pst = conn.prepareStatement("INSERT INTO messagedb values(?,?)");
			pst.setString(1, m.getKey());
			pst.setString(2, m.getMessage());
			status = pst.executeUpdate();
			conn.close();
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return status;
	}
	
	public static String getMessage(String key) {
		String m = null;
		try {
			conn = DBConnection.getCon();
			pst = conn.prepareStatement("SELECT message FROM messagedb WHERE key = (?)");
			pst.setString(1, key);
			ResultSet rs = pst.executeQuery();
			if(rs != null) {
				m = rs.getString("message");
			}
			conn.close();
			
		}catch(Exception ex) {
			System.out.println(ex);
		}
		return m;
	}
}
