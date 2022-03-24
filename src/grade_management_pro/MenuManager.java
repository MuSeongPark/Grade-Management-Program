package grade_management_pro;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		show_menu();
		
		while (true){
			
			int num = input.nextInt();
			if (num == 6) {
				System.out.println("Grade-Management-Program is terminated");
				break;
			}
			
			switch (num) {
				case 1:
					add_subject();
					break;
				case 2:
					delete_subject();
					break;
				case 3:
					check_grade();
					break;
				case 4:
					select_semester();
					break;
				case 5:
					show_menu();
					break;
					
			}
			
			
		}
		


	}
	public static void add_subject() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subject name: ");
		String name = input.nextLine(); //과목 이름 받아오기
		
		
		System.out.println("Enter the subject grade: ");
		int grade = input.nextInt(); //과목의 학점 받아오기
		
		System.out.println("If you want to look Menu, Press number 5");
	}
	
	public static void delete_subject() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subject name: ");
		String name = input.nextLine(); //삭제할 과목명 받아오기
		
		System.out.println("If you want to look Menu, Press number 5");
	}
	
	public static void check_grade() {
		System.out.println("Your total grade is");
		//학점의 총합에 대해 보여줄 공간
		System.out.println("If you want to look Menu, Press number 5");

	}
	
	public static void select_semester() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the semester: ");
		System.out.printf("Select one of the semesters (winter/first/summer/second)\n");
		String semester = input.next(); //겨울/1학기/여름/2학기 중 하나를 사용자가 선택
		//해당 학기에 대한 학점을 보여줄 공간
		System.out.println("If you want to look Menu, Press number 5");
	}
	
	public static void show_menu() {
		//메뉴를 보여주는 함수
		System.out.println("Hi! this is Grade-Management-Program!");
		System.out.println("Select number!");
		
		System.out.println("1. Add Subject");
		System.out.println("2. Delete Subject");
		System.out.println("3. Check my Grade");
		System.out.println("4. Select Semester");
		System.out.println("5. Show Menu");
		System.out.println("6. Exit");
		
	}
	

}
