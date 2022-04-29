package grade_management_pro;
import java.util.*;

public class GradeCalculator {
	private HashSet<SubjectInfo> set;
	int gradeSum;
	
	public GradeCalculator(HashSet<SubjectInfo> set) {
		this.gradeSum = 0;
		this.set = set;
		
	}
	
	
	public float calculateGradeAvg(SubjectStorage storage) {
		Iterator<SubjectInfo> iter = set.iterator();
		SubjectInfo subject;
		float avg;
		float scoreSum = 0;
		
		while(iter.hasNext()) {
			subject = iter.next();
			gradeSum += subject.grade;
			switch(subject.score) {
				case "A+":
					scoreSum += 4.5f*subject.grade;
					break;
					
				case "A0":
					scoreSum += 4.0f*subject.grade;
					break;
				case "B+":
					scoreSum += 3.5f*subject.grade;
					break;
				case "B0":
					scoreSum += 3.0f*subject.grade;
					break;
				case "C+":
					scoreSum += 2.5f*subject.grade;
					break;
				case "C0":
					scoreSum += 2.0f*subject.grade;
					break;
				
			}
		}
			
		avg = scoreSum / gradeSum;
		return avg;
			
	}
	
}
