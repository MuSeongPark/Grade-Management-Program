package grade_management_pro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;

public class LogManager implements Semester {

	public HashSet<String> subjectData = new HashSet<String>();
	public static SubjectStorage selected_semester;
	
	public LogManager() {
		
	}
	
	public LogManager(SubjectStorage subStr) {
		this.selected_semester = subStr;
		
	}
	
	public void resetLog() {
		String semester = this.selected_semester.semester;
		try {
			PrintWriter printWriter = new PrintWriter(semester + "SubjectData.txt");
			printWriter.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}


	public void writeLogFile(String data) {
		String semester = this.selected_semester.semester;
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter(semester + "SubjectData.txt", true));
			printWriter.write(data+"\n");
			printWriter.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	

	
	public HashSet<String> loadData() {
		String semester = this.selected_semester.semester;

		try {
			FileReader fileReader = new FileReader(semester + "SubjectData.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String s;
			while((s = bufferedReader.readLine()) != null) {
				subjectData.add(s);
			}
			
			bufferedReader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			resetLog();
			
		}
		
		return subjectData;
	}
	
	public void logLoading() {
		HashSet<String> subData = this.loadData();
		Iterator<String> iter = subData.iterator();

		int grade;
		while(iter.hasNext()) {
			String[] splitData;
			String data = iter.next();
			splitData = data.split(" ");
			grade = Integer.parseInt(splitData[2]);
			this.selected_semester.addSubjectForLog(splitData[0], splitData[1], grade, splitData[3]);
		}


	}

}
