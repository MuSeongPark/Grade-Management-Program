package grade_management_pro;

abstract public class Subject {
	
	protected String subjectName;
	protected String prof;
	protected String score;
	protected int grade;
	
	
	abstract public String getSubjectName();
	abstract public String getProf();
	abstract public int getGrade();
	abstract public String getScore();


}
