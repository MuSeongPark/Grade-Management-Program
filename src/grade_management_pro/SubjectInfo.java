package grade_management_pro;

public class SubjectInfo {
	//���� ���� ������ �����ϴ� Ŭ����
	protected String subjectName;
	protected String prof;
	protected int grade;
	
	
	public void print_subjectInfo() {
		//�ش� ������ ������ ����ϴ� �Լ�
		System.out.printf("- Subject: %s | prof: %s | grade: %d -\n", this.subjectName, this.prof, this.grade);
	}
	public String getSubjectName() {
		//�ش������ �̸��� �����ϴ� �Լ�: HashSet������ Ž���ϱ� ����
		return this.subjectName;
	}
	
	public SubjectInfo putSubjectInfo(String subjectName, String prof, int grade) {
		SubjectInfo newSubject = new SubjectInfo();
		newSubject.subjectName = subjectName;
		newSubject.prof = prof;
		newSubject.grade = grade;
		
		return newSubject;
	}
	
}
