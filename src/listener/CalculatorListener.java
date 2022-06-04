package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import grade_management_pro.*;



public class CalculatorListener implements ActionListener{
	private SubjectStorage subStr;
	private GradeCalculator cal = new GradeCalculator();
	private float gradeAvg;
	private JTextArea textarea;
	private String semester;
	
	public CalculatorListener(SubjectStorage subStr, JTextArea textarea, String semester) {
		this.subStr = subStr;
		this.textarea = textarea;
		this.semester = semester;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		this.gradeAvg = cal.calculateGradeAvg(this.subStr);
		this.textarea.setText("Your " + this.semester+" semester Grade Average is " + this.gradeAvg);
		
		
	}

	

}
