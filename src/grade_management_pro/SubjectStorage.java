package grade_management_pro;
import java.util.Scanner;


import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;



public class SubjectStorage {
	//과목의 정보를 담고 있는 SubjectInfo 객체들을 담기 위한 HashSet
	public HashSet<SubjectManager> subjectSet = new HashSet<SubjectManager>();
	public String semester;
	LogManager logmanager1 = new LogManager(this);
	int subjectNum;
	
	
	SubjectStorage(String semester){
		this.semester = semester;

	}
	
	
	public void addSubject(String _name, String _prof, String _grade, String _score) throws InputMismatchException{
		//추가할 과목에 대한 정보를 받아서 새로운 SubjectManager 객체 생성 후, HashSet에 저장

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
	

}
