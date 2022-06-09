package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listener.*;
import grade_management_pro.*;


public class EnterGui extends JFrame {
	//과목 입력을 위한 gui
	public EnterGui(SubjectStorage subStr) {
		
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
		this.setTitle("Add Subject");
		this.setSize(400,350);

		
		JPanel enter_panel = new JPanel();
		JPanel button_panel = new JPanel();
		
		JButton enter_button = new JButton("Enter");
		
		JLabel name_l = new JLabel("Subject Name :");
		JLabel prof_l = new JLabel("Prof. Name :");
		JLabel grade_l = new JLabel("Grade :");
		JLabel score_l = new JLabel("Score :");
		
		JTextField name_f = new JTextField();
		JTextField prof_f = new JTextField();
		JTextField grade_f = new JTextField();
		JTextField score_f = new JTextField();
		
		//setting
		enter_panel.setLayout(new GridLayout(4,2,15,15));
		enter_button.setPreferredSize(new Dimension(100,40));
		
		name_f.setPreferredSize(new Dimension(50,30));
		prof_f.setPreferredSize(new Dimension(50,30));
		grade_f.setPreferredSize(new Dimension(50,30));
		score_f.setPreferredSize(new Dimension(50,30));
		
		
		//listener
		EnterListener enter_listener = new EnterListener(subStr, name_f, prof_f, grade_f, score_f);
		enter_button.addActionListener(enter_listener);
		
		//panel에 추가
		enter_panel.add(name_l);
		enter_panel.add(name_f);
		enter_panel.add(prof_l);
		enter_panel.add(prof_f);
		enter_panel.add(grade_l);
		enter_panel.add(grade_f);
		enter_panel.add(score_l);
		enter_panel.add(score_f);
		
		enter_panel.setBorder(BorderFactory.createEmptyBorder(40,30,40,30));
		
		button_panel.add(enter_button);
		
		
		//프레임에 추가
		this.getContentPane().add(enter_panel, BorderLayout.NORTH);
		this.getContentPane().add(button_panel, BorderLayout.CENTER);
		
		this.setVisible(true);
		
		
		
		
		
		
		
		
	}

}
