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
		//로그파일 리셋
		String semester = this.selected_semester.semester;
		try {
			PrintWriter printWriter = new PrintWriter(semester + "SubjectData.txt");
			printWriter.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}


	public void writeLogFile(String data) {
		//로그파일에 정보 저장
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
		//로그파일로부터 과목 정보들 로딩
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
		//로딩된 과목 정보를 다시 과목 저장소에 저장(테이블에 나타내기 위함)
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
