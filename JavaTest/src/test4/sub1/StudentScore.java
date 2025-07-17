package test4.sub1;

public class StudentScore extends Main {
	
	// 속성
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	// 생성자
	public StudentScore(String studentName, String studentId, 
			String subject, double score) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.subject = subject;
        this.score = score;
	}
	// 점수 업데이트
    public void updateScore(double score) {
        if (score >= 0.0 && score <= 100.0) {
            this.score = score;
            System.out.println("점수 수정 완료");
        } else {
            System.out.println("잘못된 점수 입력");
        }
    }
	
	// 점수 조회
	public double getScore() {
		return score;
	}
	// 학생 정보 출력
	public void printStudentInfo() {
		System.out.println("학생이름 : " + studentName);
        System.out.println("학생 ID : " + studentId);
        System.out.println("과목 : " + subject);
        System.out.println("점수 : " + score);
	}
}














