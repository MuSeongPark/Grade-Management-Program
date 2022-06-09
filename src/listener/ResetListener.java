package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import grade_management_pro.*;


public class ResetListener extends LogManager implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		resetLog();
		
	}
	
}
