package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import grade_management_pro.*;
import gui.*;


public class CheckListener extends LogManager implements ActionListener {


	@Override
	public void actionPerformed(ActionEvent e) {
		SubjectViewer subjectV = new SubjectViewer(selected_semester);
		
	}
	

}
