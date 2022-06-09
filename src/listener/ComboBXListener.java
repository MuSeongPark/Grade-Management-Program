package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import grade_management_pro.*;

import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class ComboBXListener extends LogManager implements ActionListener {
	private JTextArea textarea;
	
	public ComboBXListener(JTextArea textarea) {
		this.textarea = textarea;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JComboBox cb = (JComboBox) e.getSource();
		select_semester(cb.getSelectedItem().toString());
		
	}
	
	public void select_semester(String semester) {
		//학기를 선택하는 함수

		if (semester.equals("winter")) {
			selected_semester = winter_semester;
			this.textarea.setText("Winter semester selected!");
			
	
		}else if (semester.equals("first")){
			selected_semester = first_semester;
			this.textarea.setText("First semester selected!");
				
			
		}else if (semester.equals("summer")) {
			selected_semester = summer_semester;
			this.textarea.setText("Summer semester selected!");
				
				
		}else if (semester.equals("second")) {
			selected_semester = second_semester;
			this.textarea.setText("Second semester selected!");
				
		}

	}
	

}
