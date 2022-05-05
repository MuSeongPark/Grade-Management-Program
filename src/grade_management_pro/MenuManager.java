package grade_management_pro;

import java.util.Scanner;

public class MenuManager extends Semester{
	//�⺻ �������� 1�б�(first semester)
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
		selected_semester.addSubject(); //������ �߰��ϴ� �Լ�
		System.out.println("If you want to look Menu, Press number 6");
	}
	
	public static void delete_Subject() {
		selected_semester.deleteSubject(); //������ �����ϴ� �Լ�
		System.out.println("If you want to look Menu, Press number 6");
	}
	
	public static void print_Subject() {
		selected_semester.printSubject(); //���õ� �б��� ��� ������ ������ִ� �Լ�
		System.out.println("If you want to look Menu, Press number 6");

	}
	
	public static void checkGrade() {
		//�̹� �б��� ���� ����� ���
		selected_semester.gradeAvg();
		System.out.println("If you want to look Menu, Press number 6");
		
	}
	
	public static void select_semester() {
		//�б⸦ �����ϴ� �Լ�
		Scanner input = new Scanner(System.in);
		System.out.printf("Select one of the semesters (winter/first/summer/second)\n");
		System.out.println("Enter a semester: ");
		String semester = input.next(); //�ܿ�/1�б�/����/2�б� �� �ϳ��� ����ڰ� ����
		while (true) {
			//while ���� ���� ����ڰ� �ùٸ��� ������ �� ���� ����ؼ� �Է��� �޴´�.
			
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
		//�޴��� �����ִ� �Լ�
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
