package grade_management_pro;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UIManager {
	
	
	public UIManager() {
		JFrame frame = new JFrame("My Grade Manager");
		JLabel title = new JLabel("Welcome to Grade Manager. Type Subject Info.");
		
		JButton enter_button = new JButton("Enter");
		enter_button.setPreferredSize(new Dimension(100,35));
		//System.out.println(enter_button.getPreferredSize());
		
		JLabel sub_name = new JLabel("Subject Name : ");
		JLabel prof = new JLabel("Prof. : ");
		JLabel sub_grade = new JLabel("Grade : ");
		JLabel sub_score = new JLabel("Score : ");
		
		JTextField tf1 = new JTextField("Enter here");
		JTextField tf2 = new JTextField("Enter here");
		JTextField tf3 = new JTextField("Enter here");
		JTextField tf4 = new JTextField("Enter here");
		
		JPanel title_panel = new JPanel();
		JPanel name_panel = new JPanel();
		JPanel prof_panel = new JPanel();
		JPanel grade_panel = new JPanel();
		JPanel score_panel = new JPanel();
		
		JPanel button_panel = new JPanel();
		
		title_panel.add(title);
		name_panel.add(sub_name);
		name_panel.add(tf1, BorderLayout.AFTER_LINE_ENDS);
		
		
		prof_panel.add(prof);
		prof_panel.add(tf2, BorderLayout.AFTER_LINE_ENDS);
		
		grade_panel.add(sub_grade);
		grade_panel.add(tf3, BorderLayout.AFTER_LINE_ENDS);
		
		score_panel.add(sub_score);
		score_panel.add(tf4, BorderLayout.AFTER_LINE_ENDS);
		
		button_panel.add(enter_button);
		
		GridLayout layout = new GridLayout(6, 1, 0, 0);
		frame.setLayout(layout);
		
		frame.add(title_panel);
		frame.add(name_panel);
		
		frame.add(prof_panel);
		frame.add(grade_panel);
		frame.add(score_panel);
		frame.add(button_panel);
		
		frame.setSize(400,300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}

}
