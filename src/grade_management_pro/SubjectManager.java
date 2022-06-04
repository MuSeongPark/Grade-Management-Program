package grade_management_pro;

public class SubjectManager extends Subject {

	//과목에 대한 정보를 관리하는 클래스
	public SubjectManager(String subjectName, String prof, int grade, String score) {
		this.subjectName = subjectName;
		this.prof = prof;
		this.grade = grade;
		this.score = score;
		
	}
	
	
	public String getSubjectName() {
		//해당과목의 이름을 리턴하는 함수: HashSet내에서 탐색하기 위함
		return this.subjectName;
	}
	public String getProf() {
		return this.prof;
	}
	public int getGrade() {
		return this.grade;
	}
	
	public String getScore() {
		return this.score;
	}
	
}
