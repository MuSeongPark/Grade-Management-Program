package grade_management_pro;

import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		while (true) {
			System.out.println("Hi! this is Grade-Management-Program!");
			System.out.println("Select number!");
			
			System.out.println("1. Add Subject");
			System.out.println("2. Delete Subject");
			System.out.println("3. Check my Grade");
			System.out.println("4. Select Semester");
			System.out.println("5. Exit");
			

			int num = input.nextInt();
			if (num == 5) {
				System.out.println("Grade-Management-Program is terminated");
				break;
			}
			
		}
		input.close();

	}

}
