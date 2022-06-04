package grade_management_pro;

import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;

import gui.*;

public class MenuManager extends Semester{
	//기본 설정값은 1학기(first semester)
	public static SubjectStorage selected_semester = first_semester;
	public static LogManager logmanager;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logmanager = new LogManager();
		logLoading();
		MenuSelection menusl = new MenuSelection(selected_semester);

		
	}
	
	public static void logLoading() {

		HashSet<String> subData = logmanager.loadData();
		Iterator<String> iter = subData.iterator();

		int grade;
		while(iter.hasNext()) {
			String[] splitData;
			String data = iter.next();
			splitData = data.split(" ");
			grade = Integer.parseInt(splitData[2]);
			selected_semester.addSubjectForLog(splitData[0], splitData[1], grade, splitData[3]);
		}


	}
	

	public static void select_semester() {
		//학기를 선택하는 함수
		Scanner input = new Scanner(System.in);
		System.out.printf("Select one of the semesters (winter/first/summer/second)\n");
		System.out.println("Enter a semester: ");
		String semester = input.next(); //겨울/1학기/여름/2학기 중 하나를 사용자가 선택
		while (true) {
			//while 문을 돌며 사용자가 올바르게 선택할 때 까지 계속해서 입력을 받는다.
			
			if (semester.equals("winter")) {
				selected_semester = winter_semester;
				break;
				
			}else if (semester.equals("first")){
				selected_semester = first_semester;
				break;
			
			}else if (semester.equals("summer")) {
				selected_semester = summer_semester;
				break;
				
			}else if (semester.equals("second")) {
				selected_semester = second_semester;
				break;
			}
			System.out.println("Enter again plz!");
		}
		System.out.println("If you want to look Menu, Press number 6");
	}
	

}
