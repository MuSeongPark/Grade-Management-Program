package grade_management_pro;
import java.util.Scanner;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;



public class SubjectStorage {
	//������ ������ ��� �ִ� SubjectInfo ��ü���� ��� ���� HashSet
	public HashSet<SubjectManager> subjectSet = new HashSet<SubjectManager>();
	public String semester;
	LogManager logmanager1 = new LogManager(this);
	int subjectNum;
	
	
	SubjectStorage(String semester){
		this.semester = semester;

	}
	
	
	public void addSubject(String _name, String _prof, String _grade, String _score) throws InputMismatchException{
		//�߰��� ���� ���� ������ �޾Ƽ� ���ο� SubjectManager ��ü ���� ��, HashSet�� ����

		int _intgrade = Integer.parseInt(_grade);
		SubjectManager subject = new SubjectManager(_name, _prof, _intgrade, _score);
		logmanager1.writeLogFile(_name+" "+_prof+" "+_grade+" "+_score);
		
		subjectSet.add(subject);
		System.out.println("Adding subject is completed!");
	}
	
	public void addSubjectForLog(String _name, String _prof, int _grade, String _score) {
		SubjectManager subject = new SubjectManager(_name, _prof, _grade, _score);
		subjectSet.add(subject);
		
	}
	
	public void deleteSubject(String name) {
		//Scanner input = new Scanner(System.in);
		Iterator<SubjectManager> iter = subjectSet.iterator();
		SubjectManager subject;
		
		String saved_subject;
		//while���� ���鼭 ������ ������ �̸��� Ž���ϰ�, �ش� ������ �����ϸ� ����
		
		while(iter.hasNext()) {
			subject = iter.next();
			saved_subject = subject.getSubjectName();
			if (saved_subject.equals(name)) {
				subjectSet.remove(subject);
				System.out.println("Delete Completed");
				return; //���� ����
			}
		}
		//������� ��ġ ���� ������ �˷��ش�.
		System.out.println("Delete Error! (incorrect name)");

	}
	

}
