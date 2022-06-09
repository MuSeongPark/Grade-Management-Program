package grade_management_pro;

import java.util.Scanner;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Iterator;

import gui.*;

public class LoadMain implements Semester {
	
	public SubjectStorage selected_semester;
	
	public LoadMain() {
		
		LogManager second_log = new LogManager(second_semester);
		second_log.logLoading();
		
		LogManager summer_log = new LogManager(summer_semester);
		summer_log.logLoading();
		
		LogManager winter_log = new LogManager(winter_semester);
		winter_log.logLoading();
		
		LogManager first_log = new LogManager(first_semester);
		first_log.logLoading();
		

		selected_semester = first_semester;
		MenuSelection menusl = new MenuSelection(selected_semester);
		
	}
	


}
