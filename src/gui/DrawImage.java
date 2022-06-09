package gui;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import com.sun.tools.javac.Main;

public class DrawImage {
	public DrawImage(JFrame f) {
		Image img = new ImageIcon(this.getClass().getResource("gne.png")).getImage();
		Image resized = img.getScaledInstance(400, 200, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(resized);
		
		JLabel lbl = new JLabel(icon);
		

		f.add(lbl);
	}



}
