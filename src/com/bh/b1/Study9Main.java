package com.bh.b1;

import java.sql.Connection;
import java.sql.SQLException;

import com.bh.b1.util.DBConnect;

public class Study9Main {

	public static void main(String[] args) {
		DBConnect dbConnect = new DBConnect();
		try {
			Connection con = dbConnect.getConnect();
			System.out.println(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
