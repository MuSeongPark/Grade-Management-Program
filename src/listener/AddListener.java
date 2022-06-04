package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.*;
import grade_management_pro.*;


public class AddListener implements ActionListener {
	private SubjectStorage subStr;
	
	public AddListener(SubjectStorage subStr) {
		this.subStr = subStr;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		EnterGui enterGui = new EnterGui(this.subStr);
		
		
	}
	

}
