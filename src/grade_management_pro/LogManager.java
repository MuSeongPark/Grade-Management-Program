package grade_management_pro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;

public class LogManager {

	public HashSet<String> subjectData = new HashSet<String>();
	
	public void resetLog() {
		try {
			PrintWriter printWriter = new PrintWriter("SubjectData.txt");
			printWriter.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}


	public void writeLogFile(String data) {
		try {
			PrintWriter printWriter = new PrintWriter(new FileWriter("SubjectData.txt", true));
			printWriter.write(data+"\n");
			printWriter.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
	}
	

	
	public HashSet<String> loadData() {
		try {
			FileReader fileReader = new FileReader("SubjectData.txt");
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String s;
			while((s = bufferedReader.readLine()) != null) {
				subjectData.add(s);
			}
			
			bufferedReader.close();
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		
		return subjectData;
	}

}
