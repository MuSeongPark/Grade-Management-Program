package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import grade_management_pro.*;

public class EnterListener implements ActionListener{
	
	private SubjectStorage subStr;
	private JTextField name_f;
	private JTextField prof_f;
	private JTextField grade_f;
	private JTextField score_f;
	
	
	public EnterListener(SubjectStorage subStr, JTextField name_f, JTextField prof_f, JTextField grade_f, JTextField score_f) {
		
		this.subStr = subStr;
		this.name_f = name_f;
		this.prof_f = prof_f;
		this.grade_f = grade_f;
		this.score_f = score_f;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (this.name_f.getText().isBlank() == false) {
			String name, prof, grade, score;
			
			name = this.name_f.getText();
			prof = this.prof_f.getText();
			grade = this.grade_f.getText();
			score = this.score_f.getText();
			
			this.subStr.addSubject(name, prof, grade, score);
			
			//입력 받은 후, 텍스트 필드 리셋
			this.name_f.setText("");
			this.prof_f.setText("");
			this.grade_f.setText("");
			this.score_f.setText("");
			
		}


		
		
	}

}
