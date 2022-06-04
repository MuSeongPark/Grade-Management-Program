package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;

import grade_management_pro.*;
import gui.*;


public class CheckListener implements ActionListener {
	HashSet<SubjectManager> subjectSet;
	SubjectStorage subStr;
	
	public CheckListener(SubjectStorage subStr) {
		this.subStr = subStr;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		SubjectViewer subjectV = new SubjectViewer(this.subStr);
		
	}
	

}
