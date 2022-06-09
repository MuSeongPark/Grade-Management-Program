package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

import grade_management_pro.*;



public class CalculatorListener extends LogManager implements ActionListener{

	private GradeCalculator cal = new GradeCalculator();
	private Float gradeAvg;
	private JTextArea textarea;
	
	public CalculatorListener(JTextArea textarea) {
		this.textarea = textarea;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		this.gradeAvg = cal.calculateGradeAvg(selected_semester);
		
		if (this.gradeAvg.isNaN()) this.gradeAvg = 0f;
		this.textarea.setText("Your " + selected_semester.semester +" semester Grade Average is " + this.gradeAvg);
		
		
	}

	

}
