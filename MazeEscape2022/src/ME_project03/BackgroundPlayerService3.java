package ME_project03;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.nio.Buffer;

import javax.imageio.ImageIO;

import ME_project02.clearFrame2;

public class BackgroundPlayerService3 implements Runnable {

	BufferedImage image;
	Player3 player;
	clearFrame3 CF3;

	int stage3Time = 1;

	Color leftColor;
	Color rightColor;
	Color upColor;
	Color downColor;

	public BackgroundPlayerService3(Player3 player) {
		this.player = player;
		try {
			image = ImageIO.read(new File("./image/maze3-2.png"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void run() {

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {
					// 색상 확인
					leftColor = new Color(image.getRGB(player.getX()-5, player.getY()+15));
					rightColor = new Color(image.getRGB(player.getX()+33, player.getY()+15));
					upColor = new Color(image.getRGB(player.getX()+15, player.getY()+15));
					downColor = new Color(image.getRGB(player.getX()+15, player.getY()+55));

					// 벽에 닿으면 움직임 정지
					if (leftColor.getRed() == 0 && leftColor.getGreen() == 0 && leftColor.getBlue() == 0) {
						System.out.println("왼쪽 벽에 충돌");
						player.setLeftWallCrash(true);
						player.setLeft(false);
					} else if (rightColor.getRed() == 0 && rightColor.getGreen() == 0 && rightColor.getBlue() == 0) {
						System.out.println("오른쪽 벽에 충돌");
						player.setRightWallCrash(true);
						player.setRight(false);
					} else if (upColor.getRed() == 0 && upColor.getGreen() == 0 && upColor.getBlue() == 0) {
						System.out.println("위쪽 벽에 충돌");
						player.setUpWallCrash(true);
						player.setUp(false);
					} else if (downColor.getRed() == 0 && downColor.getGreen() == 0 && downColor.getBlue() == 0) {
						System.out.println("아래쪽 벽에 충돌");
						player.setDownWallCrash(true);
						player.setDown(false);
					} else { // 벽에 닿지 않으면 계속 이동
						player.setLeftWallCrash(false);
						player.setRightWallCrash(false);
						player.setUpWallCrash(false);
						player.setDownWallCrash(false);
					}

					if (leftColor.getRed() == 100 && leftColor.getGreen() == 100 && leftColor.getBlue() == 100) {
						System.out.println("L도착");
						CF3 = new clearFrame3();
						break;
					}
					if (rightColor.getRed() == 100 && rightColor.getGreen() == 100 && rightColor.getBlue() == 100) {
						System.out.println("R도착");
						CF3 = new clearFrame3();
						break;
					}
					if (upColor.getRed() == 100 && upColor.getGreen() == 100 && upColor.getBlue() == 100) {
						System.out.println("U도착");
						CF3 = new clearFrame3();
						break;
					}
					if (downColor.getRed() == 100 && downColor.getGreen() == 100 && downColor.getBlue() == 100) {
						System.out.println("D도착");
						CF3 = new clearFrame3();
						break;
					}
				}
			}
		}).start();

		new Thread(new Runnable() {

			@Override
			public void run() {
				while (true) {

					try {
						Thread.sleep(1000);
						//System.out.println(stage3Time++);

					} catch (Exception e) {
						e.printStackTrace();
					}
					if (leftColor.getRed() == 100 && leftColor.getGreen() == 100 && leftColor.getBlue() == 100) {
						break;
					}
					if (rightColor.getRed() == 100 && rightColor.getGreen() == 100 && rightColor.getBlue() == 100) {
						break;
					}
					if (upColor.getRed() == 100 && upColor.getGreen() == 100 && upColor.getBlue() == 100) {
						break;
					}
					if (downColor.getRed() == 100 && downColor.getGreen() == 100 && downColor.getBlue() == 100) {
						break;
					}
				}
			}
		}).start();

	}

}
