package grade_management_pro;

public class SubjectManager extends Subject {

	//���� ���� ������ �����ϴ� Ŭ����
	public SubjectManager(String subjectName, String prof, int grade, String score) {
		this.subjectName = subjectName;
		this.prof = prof;
		this.grade = grade;
		this.score = score;
		
	}
	
	
	public String getSubjectName() {
		//�ش������ �̸��� �����ϴ� �Լ�: HashSet������ Ž���ϱ� ����
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
