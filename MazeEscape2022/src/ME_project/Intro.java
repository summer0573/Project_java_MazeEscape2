package ME_project;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Intro extends JFrame {
	Image logo = new ImageIcon("./Image/background.png").getImage();
	ImageIcon btnImg = new ImageIcon("./Image/start.png");
	
	JLabel background;

	public Intro() {
		setTitle("Maze Escape"); // Ÿ��Ʋ
		JPanel Jpanel = new JPanel();
		JButton IntBtn = new JButton(btnImg);
		setSize(1500, 850); // â ũ�� ����
		setBackground(Color.WHITE);
		IntBtn.setBorderPainted(false); // ��ư �׵θ� ��������
		IntBtn.setContentAreaFilled(false);
		IntBtn.setFocusPainted(false);
		IntBtn.setPreferredSize(new Dimension(403, 187)); // ��ư ũ�� ����
		IntBtn.setBounds(570, 516, 330, 140);
		add(IntBtn);
		add(Jpanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		//initObject();
		
		setVisible(true);

		IntBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Frame();
				setVisible(false); // â �Ⱥ��̰� �ϱ�
			}
		});
	}
	
	public void initObject() {
		background = new JLabel(new ImageIcon("./image/background.png"));
		setContentPane(background);

	}


	public void paint(Graphics g) {
		g.drawImage(logo, 9, 32, null);// background�� �׷���
	}

	public static void main(String[] args) {
		new Intro();

		 
	}
}
