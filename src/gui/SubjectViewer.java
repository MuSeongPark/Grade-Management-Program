package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import grade_management_pro.*;
import listener.*;


public class SubjectViewer extends JFrame{
	protected SubjectStorage subStr;
	protected HashSet<SubjectManager> subjectSet;
	
	public SubjectViewer(SubjectStorage subStr) {
		this.subStr = subStr;
		this.subjectSet = subStr.subjectSet;
		
		int num = subStr.subjectSet.size();
		int i = 0;
		
		String header[] = {"Subject", "Prof.", "Grade", "Score"};
		String[][] contents = new String[num+1][4];
		//String[] subject = new String[4];
		
		SubjectManager sub;
		
		Iterator<SubjectManager> iter = this.subjectSet.iterator();
		
		while(iter.hasNext()) {
			sub = iter.next();
			contents[i][0] = sub.getSubjectName();
			contents[i][1] = sub.getProf();
			contents[i][2] = Integer.toString(sub.getGrade());
			contents[i][3] = sub.getScore();
			i++;

		}
		DefaultTableModel dtm = new DefaultTableModel(contents, header);
		
		JTable table = new JTable(dtm);
		JScrollPane sp = new JScrollPane(table);
		JPanel bp = new JPanel();
		JButton del_button = new JButton("Delete");
		
		DeleteListener del_listener = new DeleteListener(table, this.subStr);
		
		del_button.setPreferredSize(new Dimension(80,50));
		del_button.addActionListener(del_listener);
		bp.add(del_button);
		
		this.add(sp);
		this.add(bp, BorderLayout.SOUTH);
		
		
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setTitle("Subject Viewer");
		
		this.setVisible(true);
	}

}
