package ME_project06_final;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import ME_project.Frame;
import ME_project.Intro;

public class mazeEndFrame extends JFrame {
	Image logo = new ImageIcon("./Image/scoreImage.png").getImage();

	public mazeEndFrame() {
		setTitle("Maze Escape"); // 타이틀
		JPanel Jpanel = new JPanel();
		setSize(1500, 850); // 창 크기 설정
		setBackground(Color.WHITE);
		add(Jpanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);
	}
	

	public void paint(Graphics g) {
		g.drawImage(logo, 9, 32, null);// background를 그려줌
	}

	public static void main(String[] args) {
		new mazeEndFrame();

		 
	}
}
