package grade_management_pro;
import java.util.Scanner;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;



public class SubjectStorage implements Manager {
	//������ ������ ��� �ִ� SubjectInfo ��ü���� ��� ���� HashSet
	private HashSet<SubjectManager> subjectSet = new HashSet<SubjectManager>();
	String semester;
	
	
	SubjectStorage(String semester){
		this.semester = semester;

	}
	
	
	public void addSubject() throws InputMismatchException{
		//�߰��� ���� ���� ������ �޾Ƽ� ���ο� SubjectManager ��ü ���� ��, HashSet�� ����
		Scanner input = new Scanner(System.in);

		String _name;
		String _prof;
		int _grade;
		String _score;
		
		System.out.printf("Subject name: ");
		_name = input.nextLine();

		
		System.out.printf("Subject professor: ");
		_prof = input.nextLine();
		
		System.out.printf("Subject grade: ");
		_grade = input.nextInt();
		
		System.out.printf("Subject score: ");
		_score = input.next();
		
		SubjectManager subject = new SubjectManager(_name, _prof, _grade, _score);
		
		subjectSet.add(subject);
		System.out.println("Adding subject is completed!");
	}
	
	public void deleteSubject() {
		Scanner input = new Scanner(System.in);
		Iterator<SubjectManager> iter = subjectSet.iterator();
		SubjectManager subject;
		
		printSubject();
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
	
	public void printSubject() {
		//�ش� �б��� ��� ���� ���� ������ ����ϴ� �Լ�
		Iterator<SubjectManager> iter = subjectSet.iterator();
		SubjectManager subject;
		System.out.printf("This is your %s semester information!\n", this.semester);
		while(iter.hasNext()) {
			subject = iter.next();
			subject.printSubject();
			
		}
	}
	public void gradeAvg() {
		GradeCalculator cal = new GradeCalculator(this.subjectSet);
		System.out.printf("Your %s semester Grade Average is %.2f\n", this.semester, cal.calculateGradeAvg(this));
		
	}

}
