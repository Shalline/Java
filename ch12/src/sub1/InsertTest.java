package sub1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
날짜 : 2025/07/25
이름 : 김수진
내용 : 자바 Insert 실습하기
*/

public class InsertTest {

	public static void main(String[] args) {
		
		// DB 정보
		String host = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "jinjinlove";
		String pass = "1234";
		
		Connection conn = null;
		
		try {
		// 데이터 베이스 접속
		conn = DriverManager.getConnection(host, user, pass);
		
		// QSL 실행 객체 생성(Statement, PreparedStatement)
		Statement stmt = conn.createStatement();
		
		// QSL 실행
		String sql = "INSERT INTO USER1 VALUES ('J103','장보고','010-1001-1003','41')";
		stmt.executeUpdate(sql);
		
		// 결과 처리(SELECT문일 경우)
		
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			
		// 데이터 베이스 종료
			try {
			conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}		
		System.out.println("Insert 완료...");
	}
}
