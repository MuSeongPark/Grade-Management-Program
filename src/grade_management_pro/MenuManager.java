package grade_management_pro;

import java.util.Scanner;

public class MenuManager {
	//MenuManager menu = new MenuManager();
	
	//4���� �б⿡ ���� Ŭ���� �ʱ�ȭ
	public static SubjectStorage winter_semester = new SubjectStorage("Winter");
	public static SubjectStorage first_semester = new SubjectStorage("First");
	public static SubjectStorage summer_semester = new SubjectStorage("Summer");
	public static SubjectStorage second_semester = new SubjectStorage("Second");
	
	//�⺻ �������� 1�б�(first semester)
	public static SubjectStorage selected_semester = first_semester;
	

	public static void main(String[] args) {
		MenuManager menu = new MenuManager();
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		menu.show_menu();
		
		while (true){
			
			int num = input.nextInt();
			if (num == 6) {
				System.out.println("Grade-Management-Program is terminated");
				break;
			}
			
			switch (num) {
				case 1:
					menu.add_subject();
					break;
				case 2:
					menu.delete_subject();
					break;
				case 3:
					menu.check();
					break;
				case 4:
					menu.select_semester();
					break;
				case 5:
					menu.show_menu();
					break;
					
			}
			
			
		}
		
	}
	
	public void add_subject() {
		selected_semester.addSubject(); //������ �߰��ϴ� �Լ�
		System.out.println("If you want to look Menu, Press number 5");
	}
	
	public void delete_subject() {
		selected_semester.deleteSubject(); //������ �����ϴ� �Լ�
		System.out.println("If you want to look Menu, Press number 5");
	}
	
	public void check() {
		selected_semester.print_subjectSet(); //���õ� �б��� ��� ������ ������ִ� �Լ�
		//System.out.println("Your total grade is");
		//������ ���տ� ���� ������ ����
		System.out.println("If you want to look Menu, Press number 5");

	}
	
	public void select_semester() {
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
		System.out.println("If you want to look Menu, Press number 5");
	}
	
	public void show_menu() {
		//�޴��� �����ִ� �Լ�
		System.out.println("Hi! this is Grade-Management-Program!");
		System.out.printf("** Select number! | Selected semester: %s semester**\n", selected_semester.semester);
		
		System.out.println("1. Add Subject");
		System.out.println("2. Delete Subject");
		System.out.println("3. Check my Subjects and Grade");
		System.out.println("4. Select Semester");
		System.out.println("5. Show Menu");
		System.out.println("6. Exit");
		
	}
	

}
