package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import grade_management_pro.*;


public class ResetListener implements ActionListener{
	LogManager logmanager = new LogManager();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		logmanager.resetLog();
		
	}
	


}
