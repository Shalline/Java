package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
날짜 : 2025/07/25
이름 : 김수진
내용 : Transaction 실습하기
*/

public class TransactionTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("에러를 발생 하시겠습니까?");
		
		int answer = sc.nextInt();
		
		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "bank";
		final String PASS = "1234";
		
		Connection conn =null; // 캐치문에서 참조하려고 상위에서 선언한것
		
		try {
			
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			// 트렌잭션 자동 커밋 해제(트렌잭션 시작), 롤백위해서
			conn.setAutoCommit(false);
			
			String sql1 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE - 10000"
					+ "WHERE ACC_CID = ?";
			String sql2 = "UPDATE ACCOUNT SET ACC_BALANCE = ACC_BALANCE + 10000"
					+ "WHERE ACC_CID = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "730423-1000001");
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "830513-2000003");

			psmt1.executeUpdate();
			
			if(answer == 1) {
				throw new Exception("예기치 못한 에러가 발생했습니다.");
			}
			
			psmt2.executeUpdate();
			
			conn.commit(); // 트렌잭션 작업 확정(트렌잭션 실행)
			
			// 종료
			psmt1.close();
			psmt2.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
			
			try {
				// 트랜잭션 작업 취소
				conn.rollback();
			} catch (SQLException e1) {
				
				e1.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료..."); 
	}

}
