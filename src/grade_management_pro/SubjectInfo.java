package grade_management_pro;

public class SubjectInfo {
	//과목에 대한 정보를 저장하는 클래스
	protected String subjectName;
	protected String prof;
	protected String score;
	protected int grade;
	
	public SubjectInfo() {
		
	}
	
	
	public void print_subjectInfo() {
		//해당 과목의 정보를 출력하는 함수
		System.out.printf("- Subject: %s | prof: %s | grade: %d | score: %s -\n", this.subjectName, this.prof, this.grade, this.score);
	}
	public String getSubjectName() {
		//해당과목의 이름을 리턴하는 함수: HashSet내에서 탐색하기 위함
		return this.subjectName;
	}
	
	public void setSubjectInfo(String subjectName, String prof, int grade, String score) {
		//SubjectInfo newSubject = new SubjectInfo();
		this.subjectName = subjectName;
		this.prof = prof;
		this.score = score;
		this.grade = grade;

	}
	
}
