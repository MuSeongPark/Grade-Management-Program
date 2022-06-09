package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.*;
import grade_management_pro.*;


public class AddListener extends LogManager implements ActionListener {

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		EnterGui enterGui = new EnterGui(selected_semester);
		
		
	}
	

}
