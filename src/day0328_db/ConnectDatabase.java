package day0328_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectDatabase {

	Student_Info si = new Student_Info();
	Method_LinkedArray la = new Method_LinkedArray();

	String url = "jdbc:mysql://localhost:3306/grade";
	String id = "root";
	String pw = "qwe123!@#";
	Connection conn = null;
	PreparedStatement pstmt = null; // query 전송 객체
	ResultSet res = null; // select 쿼리문을 실행하고 결과를 Resultset로 받음(저장)

	public ConnectDatabase() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver Load
			conn = DriverManager.getConnection(url, id, pw); // Mysql 연결 진행
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	};

	public void show_LinkedListSave() {
		la.init();
		res = null;

		try {
			pstmt = conn.prepareStatement("select * from student_info");
			res = pstmt.executeQuery();

			while (res.next()) {

				String name = res.getString("name");
				int kor = res.getInt("kor");
				int eng = res.getInt("eng");
				int mat = res.getInt("mat");

				la.add(la.info_input(name, kor, mat, eng));

			}
			// System.out.println(c);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("데이터 조회 중 오류가 발생했습니다: " + e.getMessage());
		}
	}

	public void insert_data(Student_Info si) {

		try {
			pstmt = conn.prepareStatement(
					"insert into student_info(name, kor, eng, mat, total, ave) values(? ,? , ? , ? ,? ,?)");

			pstmt.setString(1, si.getName());
			pstmt.setInt(2, si.getKor());
			pstmt.setInt(3, si.getEng());
			pstmt.setInt(4, si.getMat());
			pstmt.setInt(5, si.getTotal());
			pstmt.setFloat(6, si.getAvg());
			pstmt.executeUpdate();
		} catch (

		Exception e) {

			System.err.println("데이터 추가 중 오류가 발생했습니다: " + e.getMessage());
		}
	}

	public void delete_data(String x) {
		try {
			pstmt = conn.prepareStatement("delete from student_info where name=? ");

			pstmt.setString(1, x);
			int row = pstmt.executeUpdate(); // 쿼리실행
			System.out.println("*****" + x + " 님 정보 삭제 완료" + "(" + row + "번째 row)*****");

		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			System.err.println("데이터 삭제 중 오류가 발생했습니다: " + e.getMessage());
		}

	}

	public void update_data(Student_Info si) {
		try {
			pstmt = conn.prepareStatement(
					"update student_info set kor = ? , eng = ? , mat = ? ,total = ? , ave = ? where name=? ");

			pstmt.setInt(1, si.getKor());
			pstmt.setInt(2, si.getEng());
			pstmt.setInt(3, si.getMat());
			pstmt.setInt(4, si.getTotal());
			pstmt.setFloat(5, si.getAvg());
			pstmt.setString(6, si.getName());

			int row = pstmt.executeUpdate(); // 쿼리실행
			System.out.println(si.getName() + " 님 정보 수정 완료" + "(" + row + "번째 row) ");

		} catch (

		Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void close() {

		try {
			if (res != null)
				res.close(); // 쿼리 결과값 저장 객체 종료
			if (pstmt != null)
				pstmt.close(); // 쿼리 실행 관련 객체 종료
			if (conn != null)
				conn.close(); // Mysql 연결 종료
			System.out.println("성적관리 시스템 종료");
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
	}
}
