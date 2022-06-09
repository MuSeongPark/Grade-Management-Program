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
	String semester[] = {"first", "summer", "second", "winter"};
	JComboBox<String> cb;
	
	String intro = "  Hello! this is your Grade Management Program GNE! \n"
			+ "  Nice to meet you!  \n"
			+ "  Please select one of services!  ";
	
	public MenuSelection(SubjectStorage subStr) {

		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setTitle("My Grade Manager");
		this.setSize(400,600);
			
		JPanel south_panel = new JPanel();
		JPanel cb_panel = new JPanel();
		JPanel button_panel = new JPanel();
		JTextArea textarea = new JTextArea();
		cb = new JComboBox<String> (semester);
		
		
		//레이아웃 생성
		south_panel.setLayout(new BoxLayout(south_panel, BoxLayout.Y_AXIS));
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
		textarea.setText(intro);

		
		textarea.setPreferredSize(new Dimension(400,100));
		textarea.setEditable(false);
		
		//listener 생성
		AddListener addButton_listener = new AddListener();
		CheckListener check_sub_listener = new CheckListener();
		ResetListener reset_listener = new ResetListener(subStr);
		CalculatorListener cal_listener = new CalculatorListener(textarea);
		ComboBXListener cb_listener = new ComboBXListener(textarea);
		
		//listener 추가
		add_button.addActionListener(addButton_listener);
		view_button.addActionListener(check_sub_listener);
		reset_button.addActionListener(reset_listener);
		calculate_button.addActionListener(cal_listener);
		cb.addActionListener(cb_listener);
		
		
		//패널에 추가
		button_panel.add(add_button);
		button_panel.add(view_button);
		button_panel.add(calculate_button);
		
		button_panel.add(reset_button);
		button_panel.setBorder(BorderFactory.createEmptyBorder(20, 0, 40, 0));
		
		cb_panel.add(titlelabel);
		cb_panel.add(selectlabel);
		cb_panel.add(cb);
		
		south_panel.add(textarea);
		south_panel.add(button_panel);
		south_panel.setBorder(BorderFactory.createEmptyBorder(0,15,0,15));
		
		
		
		this.getContentPane().add(cb_panel, BorderLayout.NORTH);
		DrawImage draw = new DrawImage(this);
		this.getContentPane().add(south_panel, BorderLayout.SOUTH);
		this.setVisible(true);
	}

}
