package grade_management_pro;

public class SubjectManager extends Subject implements Manager {

	//과목에 대한 정보를 관리하는 클래스
	public SubjectManager(String subjectName, String prof, int grade, String score) {
		this.subjectName = subjectName;
		this.prof = prof;
		this.grade = grade;
		this.score = score;
		
	}
	
	public void printSubject() {
		//해당 과목의 정보를 출력하는 함수
		System.out.printf("- Subject: %s | prof: %s | grade: %d | score: %s -\n", this.subjectName, this.prof, this.grade, this.score);
	}
	
	public String getSubjectName() {
		//해당과목의 이름을 리턴하는 함수: HashSet내에서 탐색하기 위함
		return this.subjectName;
	}
	
		

	
	public void deleteSubject() {
		this.subjectName = null;
		this.prof = null;
		this.grade = 0;
		this.score = null;
	}
}
