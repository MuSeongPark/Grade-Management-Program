package grade_management_pro;

public class SubjectManager extends Subject implements Manager {

	//���� ���� ������ �����ϴ� Ŭ����
	public SubjectManager(String subjectName, String prof, int grade, String score) {
		this.subjectName = subjectName;
		this.prof = prof;
		this.grade = grade;
		this.score = score;
		
	}
	
	public void printSubject() {
		//�ش� ������ ������ ����ϴ� �Լ�
		System.out.printf("- Subject: %s | prof: %s | grade: %d | score: %s -\n", this.subjectName, this.prof, this.grade, this.score);
	}
	
	public String getSubjectName() {
		//�ش������ �̸��� �����ϴ� �Լ�: HashSet������ Ž���ϱ� ����
		return this.subjectName;
	}
	
		

	
	public void deleteSubject() {
		this.subjectName = null;
		this.prof = null;
		this.grade = 0;
		this.score = null;
	}
}
