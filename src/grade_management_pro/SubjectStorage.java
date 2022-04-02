package grade_management_pro;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Iterator;

public class SubjectStorage {
	//������ ������ ��� �ִ� SubjectInfo ��ü���� ��� ���� HashSet
	private HashSet<SubjectInfo> subjectSet = new HashSet<SubjectInfo>();
	String semester;

	
	SubjectStorage(String semester){
		this.semester = semester;

	}
	
	
	public void addSubject() {
		//�߰��� ���� ���� ������ �޾Ƽ� ���ο� SubjectInfo ��ü ���� ��, HashSet�� ����
		Scanner input = new Scanner(System.in);
		SubjectInfo newSubject;
		String name;
		String prof;
		int grade;
		
		System.out.printf("Subject name: ");
		name = input.nextLine();
		
		System.out.printf("Subject professor: ");
		prof = input.nextLine();
		
		System.out.printf("Subject grade: ");
		grade = input.nextInt();
		newSubject = new SubjectInfo(name, prof, grade);
		
	
		subjectSet.add(newSubject);	
		System.out.println("Adding subject is completed!");
	}
	
	public void deleteSubject() {
		Scanner input = new Scanner(System.in);
		Iterator<SubjectInfo> iter = subjectSet.iterator();
		SubjectInfo subject;
		
		print_subjectSet();
		System.out.printf("Select one of your Subject: ");
		String name = input.nextLine();
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
	
	public void print_subjectSet() {
		//�ش� �б��� ��� ���� ���� ������ ����ϴ� �Լ�
		Iterator<SubjectInfo> iter = subjectSet.iterator();
		SubjectInfo subject;
		System.out.printf("This is your %s semester information!\n", this.semester);
		while(iter.hasNext()) {
			subject = iter.next();
			subject.print_subjectInfo();
			
		}
	}

}
