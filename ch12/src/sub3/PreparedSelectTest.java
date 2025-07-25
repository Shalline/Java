package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import sub2.User1VO;

/*
날짜 : 2025/07/25
이름 : 김수진
내용 : PreparedStatement Insert 실습하기
*/

public class PreparedSelectTest {

	public static void main(String[] args) {

		// DB 정보
		final String HOST = "jdbc:oracle:thin:@localhost:1521:xe";
		final String USER = "jinjinlove";
		final String PASS = "1234";

		// 조회 결과 반환용 리스트 생성
		List<User1VO> users = new ArrayList<User1VO>();

		try {

			// 데이터베이스 접속
			Connection conn = DriverManager.getConnection(HOST, USER, PASS);

			// SQL 실행객체 생성(PreparedStatement)
			String sql = "SELECT * FROM USER1 WHERE AGE >= ?";
			// 쿼리 파라미터를 사용한 SQL, 준비된 쿼리
			PreparedStatement psmt = conn.prepareStatement(sql);
			// 쿼리 파라미터(?)에 나이숫자 20 바인딩
			psmt.setInt(1, 30);

			// SQL 실행
			ResultSet rs = psmt.executeQuery();
			// 셀렉트 실행하기 떄문에 이거

			// 결과 처리 (SELECT 일때 )
			while (rs.next()) {

				// VO 객체 생성 : VO 객체는 데이터 베이스에서 조회된
				// 결과로 초기화된 읽기전용 오브젝트(객체)
				User1VO vo = new User1VO();
				vo.setUser_id(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));

				users.add(vo);
			}

			// 데이터베이스 종료
			rs.close();
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		for (User1VO user : users) {
			System.out.println(user);
		}

		System.out.println("Select 완료...");

	}

}
