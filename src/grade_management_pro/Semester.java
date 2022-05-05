package grade_management_pro;

abstract public class Semester {
	//4개 학기에 대한 인스턴스 생성
	public static SubjectStorage winter_semester = new SubjectStorage("Winter");
	public static SubjectStorage first_semester = new SubjectStorage("First");
	public static SubjectStorage summer_semester = new SubjectStorage("Summer");
	public static SubjectStorage second_semester = new SubjectStorage("Second");
	
}
