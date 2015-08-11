
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class Dice {

	private BufferedImage image1;
	private BufferedImage image2;
	private BufferedImage image3;
	private BufferedImage image4;
	private BufferedImage image5;
	private BufferedImage image6;

	public Dice() {

		try {
			image1 = ImageIO.read(new File("src/dice1.png"));
			image2 = ImageIO.read(new File("src/dice2.png"));
			image3 = ImageIO.read(new File("src/dice3.png"));
			image4 = ImageIO.read(new File("src/dice4.png"));
			image5 = ImageIO.read(new File("src/dice5.png"));
			image6 = ImageIO.read(new File("src/dice6.png"));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static int randomValue() {

		Random rd = new Random();
		int value =  1 + rd.nextInt(6);
		return value;
	}

	public BufferedImage rollDice(int value) {

		switch (value) {

		case 1:
			return getImage1();
		case 2:
			return getImage2();
		case 3:
			return getImage3();
		case 4:
			return getImage4();
		case 5:
			return getImage5();
		case 6:
			return getImage6();
		}
		return null;
	}

	public BufferedImage getImage1() {
		return image1;
	}

	public BufferedImage getImage2() {
		return image2;
	}

	public BufferedImage getImage3() {
		return image3;
	}

	public BufferedImage getImage4() {
		return image4;
	}

	public BufferedImage getImage5() {
		return image5;
	}

	public BufferedImage getImage6() {
		return image6;
	}

}
