package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import listener.*;
import grade_management_pro.*;

public class MenuSelection extends JFrame{
	String semester[] = {"winter", "first", "summer", "second"};
	JComboBox<String> cb;
	
	public MenuSelection(SubjectStorage subStr) {

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("My Grade Manager");
		this.setSize(400,600);
			
		JPanel south_panel = new JPanel();
		JPanel cb_panel = new JPanel();
		JPanel button_panel = new JPanel();
		JTextArea textarea = new JTextArea();
		cb = new JComboBox<String> (semester);
		
		textarea.setPreferredSize(new Dimension(400,100));
		textarea.setEditable(false);

		south_panel.setLayout(new BoxLayout(south_panel, BoxLayout.Y_AXIS));
		//title_panel.setLayout(new BoxLayout(title_panel, BoxLayout.Y_AXIS));
		cb_panel.setLayout(new BoxLayout(cb_panel, BoxLayout.Y_AXIS));
		button_panel.setLayout(new GridLayout(2,2,15,15));
		
		
		JLabel titlelabel = new JLabel("Welcome to Grade Manager!");
		JLabel selectlabel = new JLabel("Select Semester");
		
		JButton add_button = new JButton("Add Subject");
		JButton calculate_button = new JButton("Calculate Score");
		JButton view_button = new JButton("Check Subjects");
		JButton reset_button = new JButton("Reset");
		
		//setting
		
		
		add_button.setPreferredSize(new Dimension(80,40));
		calculate_button.setPreferredSize(new Dimension(80,40));
		view_button.setPreferredSize(new Dimension(80,40));
		reset_button.setPreferredSize(new Dimension(80,40));
		
		//listener 생성
		AddListener addButton_listener = new AddListener(subStr);
		CheckListener check_sub_listener = new CheckListener(subStr);
		ResetListener reset_listener = new ResetListener();
		CalculatorListener cal_listener = new CalculatorListener(subStr, textarea, subStr.semester);
		
		
		
		//listener 추가
		add_button.addActionListener(addButton_listener);
		view_button.addActionListener(check_sub_listener);
		reset_button.addActionListener(reset_listener);
		calculate_button.addActionListener(cal_listener);
		
		
		//cb = new JComboBox<String> (semester);
		
		//패널에 추가
		//title_panel.add(titlelabel);
		//title_panel.add(selectlabel);
		//title_panel.add(cb);
		
		button_panel.add(add_button);
		button_panel.add(view_button);
		button_panel.add(calculate_button);
		
		button_panel.add(reset_button);
		button_panel.setBorder(BorderFactory.createEmptyBorder(40, 30, 40, 30));
		
		cb_panel.add(titlelabel);
		cb_panel.add(selectlabel);
		cb_panel.add(cb);
		//cb_panel.add(textarea);
		
		south_panel.add(textarea);
		south_panel.add(button_panel);
		
		
		//this.getContentPane().add(title_panel, BorderLayout.NORTH);
		this.getContentPane().add(cb_panel, BorderLayout.NORTH);
		DrawImage draw = new DrawImage(this);
		this.getContentPane().add(south_panel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

}
