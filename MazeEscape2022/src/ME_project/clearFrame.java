package ME_project;

import java.awt.BorderLayout;
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

import ME_project02.Frame2;

public class clearFrame extends JFrame {
	ImageIcon continueBtn = new ImageIcon("./Image/next.png");
	Image clearImg = new ImageIcon("./Image/stageclear.png").getImage();
	Frame F;
	Frame2 F2;

	public clearFrame() {
		initSetting();
	}
	
	
	public void initSetting() {
		setTitle("Maze Escape"); // 타이틀
		JPanel Jpanel = new JPanel();
		JButton IntBtn = new JButton(continueBtn);
		setSize(1500, 850); // 창 크기 설정
		IntBtn.setBorderPainted(false); // 버튼 테두리 설정해제
		IntBtn.setContentAreaFilled(false);
		IntBtn.setFocusPainted(false);
		IntBtn.setPreferredSize(new Dimension(300, 50)); // 버튼 크기 지정
		IntBtn.setBounds(570, 516, 330, 140);
		add(IntBtn);
		add(Jpanel);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setVisible(true);

		IntBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				F2 = new Frame2();
				setVisible(false); // 창 안보이게 하기

			}

		});
	}

	public void paint(Graphics g) {
		g.drawImage(clearImg, 9, 32, null);// background를 그려줌
	}

	public static void main(String[] args) {
		new clearFrame();
	}
}
