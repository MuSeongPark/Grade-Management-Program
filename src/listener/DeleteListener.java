package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import grade_management_pro.*;

public class DeleteListener implements ActionListener{
	protected JTable table;
	protected SubjectStorage subStr;
	protected LogManager logmanager = new LogManager();
	
	public DeleteListener(JTable table, SubjectStorage subStr) {
		this.table = table;
		this.subStr = subStr;
		
	}
	
	public void remove(int idx) {
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		model.removeRow(idx);
		System.out.println("");
			
		
	}
	//jtable에서 삭제한 후, 로그파일에 재로딩을 하기위한 함수
	public void reload() {
		logmanager.resetLog();
		SubjectManager sub;
		Iterator<SubjectManager> iter = this.subStr.subjectSet.iterator();
		
		while(iter.hasNext()) {
			String data;
			sub = iter.next();
			data = sub.getSubjectName()+" "+sub.getProf()+" "+sub.getGrade()+" "+sub.getScore();
			logmanager.writeLogFile(data);

		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String name;
		int row = table.getSelectedRow();

		if(row >= 0) {
			try {
				name = table.getValueAt(row, 0).toString();
				remove(row);
				subStr.deleteSubject(name);
				reload();
			}catch(NullPointerException err) {
				System.out.println("This is blank!!");
			}

			
		}

	}

}
