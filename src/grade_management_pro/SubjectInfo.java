package grade_management_pro;

public class SubjectInfo {
	//���� ���� ������ �����ϴ� Ŭ����
	private String subjectName;
	private String prof;
	private int grade;
	
	
	SubjectInfo(String subjectName, String prof, int grade){
		this.subjectName = subjectName;
		this.prof = prof;
		this.grade = grade;
		
	}
	
	
	public void print_subjectInfo() {
		//�ش� ������ ������ ����ϴ� �Լ�
		System.out.printf("- Subject: %s | prof: %s | grade: %d -\n", this.subjectName, this.prof, this.grade);
	}
	public String getSubjectName() {
		//�ش������ �̸��� �����ϴ� �Լ�: HashSet������ Ž���ϱ� ����
		return this.subjectName;
	}
	
}
