package grade_management_pro;

public class SubjectInfo {
	//���� ���� ������ �����ϴ� Ŭ����
	protected String subjectName;
	protected String prof;
	protected String score;
	protected int grade;
	
	public SubjectInfo() {
		
	}
	
	
	public void print_subjectInfo() {
		//�ش� ������ ������ ����ϴ� �Լ�
		System.out.printf("- Subject: %s | prof: %s | grade: %d | score: %s -\n", this.subjectName, this.prof, this.grade, this.score);
	}
	public String getSubjectName() {
		//�ش������ �̸��� �����ϴ� �Լ�: HashSet������ Ž���ϱ� ����
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
