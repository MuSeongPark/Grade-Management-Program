package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import grade_management_pro.*;


public class ResetListener extends LogManager implements ActionListener{
	
	private SubjectStorage subStr;
	
	public ResetListener(SubjectStorage subStr) {
		this.subStr = subStr;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		resetLog();
		subStr.subjectSet.clear();
		
	}
	
}
