package grade_management_pro;

import java.util.Scanner;

public class MenuManager extends Semester{
	//기본 설정값은 1학기(first semester)
	public static SubjectStorage selected_semester = first_semester;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		show_menu();
		
		while (true){
			
			int num = input.nextInt();
			if (num == 7) {
				System.out.println("Grade-Management-Program is terminated");
				break;
			}
			
			switch (num) {
				case 1:
					add_Subject();
					break;
				case 2:
					delete_Subject();
					break;
				case 3:
					print_Subject();
					break;
				case 4:
					checkGrade();
					break;
				case 5:
					select_semester();
					break;
				case 6:
					show_menu();
					break;
					
			}
			
			
		}
		
	}
	
	public static void add_Subject() {
		selected_semester.addSubject(); //과목을 추가하는 함수
		System.out.println("If you want to look Menu, Press number 6");
	}
	
	public static void delete_Subject() {
		selected_semester.deleteSubject(); //과목을 제거하는 함수
		System.out.println("If you want to look Menu, Press number 6");
	}
	
	public static void print_Subject() {
		selected_semester.printSubject(); //선택된 학기의 모든 과목을 출력해주는 함수
		System.out.println("If you want to look Menu, Press number 6");

	}
	
	public static void checkGrade() {
		//이번 학기의 학점 평균을 출력
		selected_semester.gradeAvg();
		System.out.println("If you want to look Menu, Press number 6");
		
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
	
	public static void show_menu() {
		//메뉴를 보여주는 함수
		System.out.println("Hi! this is Grade-Management-Program!");
		System.out.printf("** Select number! | Selected semester: %s semester**\n", selected_semester.semester);
		
		System.out.println("1. Add Subject");
		System.out.println("2. Delete Subject");
		System.out.println("3. Check my Subjects Info");
		System.out.println("4. Check my Grade Avg");
		System.out.println("5. Select Semester");
		System.out.println("6. Show Menu");
		System.out.println("7. Exit");
		
	}
	

}
