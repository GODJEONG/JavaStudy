package day0329;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBex1 {

	Connection conn;
	PreparedStatement pstmt;

	public DBex1() {
		this("jdbc:mysql://localhost:3306/mydb?serverTimezone=UTC", "root", "qwe123!@#");
	}

	public DBex1(String url, String user, String pw) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws SQLException {
		DBex1 exam = new DBex1();
		System.out.println("success");

		exam.createdb();
	}

	private void createdb() {
		try {
			String s = "drop table if exists student2;";
			String sql = "create table student3(\r\n" + "id int,\r\n" + "username varchar(20),\r\n"
					+ "primary key(id) )";

			pstmt = conn.prepareStatement(s);

			pstmt.executeUpdate();

			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
