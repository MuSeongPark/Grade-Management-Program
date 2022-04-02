package grade_management_pro;
import java.util.Scanner;

import java.util.HashSet;
import java.util.Iterator;

public class SubjectStorage {
	//과목의 정보를 담고 있는 SubjectInfo 객체들을 담기 위한 HashSet
	private HashSet<SubjectInfo> subjectSet = new HashSet<SubjectInfo>();
	String semester;

	
	SubjectStorage(String semester){
		this.semester = semester;

	}
	
	
	public void addSubject() {
		//추가할 과목에 대한 정보를 받아서 새로운 SubjectInfo 객체 생성 후, HashSet에 저장
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
	
	public void print_subjectSet() {
		//해당 학기의 모든 과목에 대한 정보를 출력하는 함수
		Iterator<SubjectInfo> iter = subjectSet.iterator();
		SubjectInfo subject;
		System.out.printf("This is your %s semester information!\n", this.semester);
		while(iter.hasNext()) {
			subject = iter.next();
			subject.print_subjectInfo();
			
		}
	}

}
