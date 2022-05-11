package grade_management_pro;
import java.util.Scanner;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;



public class SubjectStorage implements Manager {
	//과목의 정보를 담고 있는 SubjectInfo 객체들을 담기 위한 HashSet
	private HashSet<SubjectManager> subjectSet = new HashSet<SubjectManager>();
	String semester;
	
	
	SubjectStorage(String semester){
		this.semester = semester;

	}
	
	
	public void addSubject() throws InputMismatchException{
		//추가할 과목에 대한 정보를 받아서 새로운 SubjectManager 객체 생성 후, HashSet에 저장
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
		//while문을 돌면서 삭제할 과목의 이름을 탐색하고, 해당 과목이 존재하면 삭제
		
		while(iter.hasNext()) {
			subject = iter.next();
			saved_subject = subject.getSubjectName();
			if (saved_subject.equals(name)) {
				subjectSet.remove(subject);
				System.out.println("Delete Completed");
				return; //조기 리턴
			}
		}
		//과목명이 일치 하지 않으면 알려준다.
		System.out.println("Delete Error! (incorrect name)");
		
		
	}
	
	public void printSubject() {
		//해당 학기의 모든 과목에 대한 정보를 출력하는 함수
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
