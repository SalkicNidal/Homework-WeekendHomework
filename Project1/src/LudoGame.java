import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LudoGame extends JFrame {

	private static final long serialVersionUID = 8907483178616736257L;

	private static int start = 0;
	private static int value;
	private static boolean firstRed = false;
	private static boolean firstBlue = false;
	private static boolean blueStart = false;
	private static boolean greenStart = false;
	private static boolean yellowstart = false;
	private static boolean redStart = true;

	private static JLabel[] moves;
	int[][] field = new int[][] { { 5, 5, 1, 2, 2, 2, 2, 2, 1, 6, 6 },
			{ 5, 5, 1, 2, 1, 6, 1, 2, 1, 6, 6 },
			{ 1, 1, 1, 2, 1, 6, 1, 2, 1, 1, 1 },
			{ 2, 2, 2, 2, 1, 6, 1, 2, 2, 2, 2 },
			{ 2, 1, 1, 1, 1, 6, 1, 1, 1, 1, 2 },
			{ 2, 5, 5, 5, 5, 0, 7, 7, 7, 7, 2 },
			{ 2, 1, 1, 1, 1, 8, 1, 1, 1, 1, 2 },
			{ 2, 2, 2, 2, 1, 8, 1, 2, 2, 2, 2 },
			{ 1, 1, 1, 2, 1, 8, 1, 2, 1, 1, 1 },
			{ 8, 8, 1, 2, 1, 8, 1, 2, 1, 7, 7 },
			{ 8, 8, 1, 2, 2, 2, 2, 2, 1, 7, 7 } };

	Color red = Color.RED;
	Color green = Color.GREEN;
	Color blue = Color.BLUE;
	Color yellow = Color.YELLOW;
	Color white = Color.WHITE;
	Color grey = Color.LIGHT_GRAY;
	Color center = Color.ORANGE;

	private static JLabel[][] fields = new JLabel[11][11];
	JPanel panel = new JPanel();
	JPanel panel1 = new JPanel();
	JButton dice = new JButton();

	public LudoGame() {

		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		add(panel1, BorderLayout.EAST);
		panel.setSize(700, 800);
		panel1.setSize(100, 800);

		panel.setLayout(new GridLayout(11, 11));

		for (int i = 0; i < fields.length; i++) {
			for (int j = 0; j < fields[i].length; j++) {
				fields[i][j] = new JLabel();
				fields[i][j].setHorizontalAlignment(JLabel.CENTER);
				fields[i][j].setOpaque(true);
				fields[i][j].setBorder(BorderFactory
						.createLineBorder(Color.BLACK));
				panel.add(fields[i][j]);
				fields[i][j].setText(field[i][j] + "");
				if (fields[i][j].getText().equals("2")) {
					fields[i][j].setBackground(white);
					fields[i][j].setForeground(white);

				} else if (fields[i][j].getText().equals("5")) {
					fields[i][j].setBackground(red);
					fields[i][j].setForeground(red);
				} else if (fields[i][j].getText().equals("6")) {
					fields[i][j].setBackground(blue);
					fields[i][j].setForeground(blue);
				} else if (fields[i][j].getText().equals("7")) {
					fields[i][j].setBackground(green);
					fields[i][j].setForeground(green);
				} else if (fields[i][j].getText().equals("8")) {
					fields[i][j].setBackground(yellow);
					fields[i][j].setForeground(yellow);
				} else if (fields[i][j].getText().equals("1")) {
					fields[i][j].setBackground(grey);
					fields[i][j].setForeground(grey);
				} else if (fields[i][j].getText().equals("0")) {
					fields[i][j].setBackground(center);
					fields[i][j].setForeground(center);
				}
			}
		}

		fields[0][2].setIcon(new ImageIcon(new Dice().rollDice(1)));
		fields[0][8].setIcon(new ImageIcon(new Dice().rollDice(1)));
		fields[10][2].setIcon(new ImageIcon(new Dice().rollDice(1)));
		fields[10][8].setIcon(new ImageIcon(new Dice().rollDice(1)));

		fields[0][2].addMouseListener(new MyAction());
		fields[0][8].addMouseListener(new MyAction());
		fields[10][2].addMouseListener(new MyAction());
		fields[10][8].addMouseListener(new MyAction());

		fields[5][5].addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {

				value = new Dice().randomValue();
				fields[5][5].setIcon(new ImageIcon(new Dice().rollDice(value)));

				if (blueStart && firstBlue) {

					moves = BluePlayer.playingFields();
					moves[start + value].setBackground(Color.BLUE);
					start += value;
					blueStart = false;
					redStart = true;
					//fields[5][5].setIcon(null);
					

				} else if (redStart && firstRed) {

					moves = RedPlayer.playingFields();
					moves[start + value].setBackground(Color.RED);
					start += value;
					redStart = false;
					blueStart = true;
					//fields[5][5].setIcon(null);
					

				}

				// else if ( value == 6 &&)
				System.out.println(start);
				System.out.println(start + value);

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub

			}
		});

		panel1.setLayout(new GridLayout(1, 10));

		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static JLabel[][] getFields() {

		return fields;
	}

	public static void move(JLabel[] player, int value) {

		player[start + value].setBackground(Color.BLACK);
		start += value;
	}

	public static int getValue() {

		return value;
	}

	public static void main(String[] args) {

		new LudoGame();

	}

	public class MyAction extends MouseAdapter {
		int count = 0;

		@Override
		public void mousePressed(MouseEvent e) {

			super.mousePressed(e);

			if (e.getSource() == fields[0][2]) {

				value = new Dice().randomValue();
				fields[0][2].setIcon(new ImageIcon(new Dice().rollDice(value)));

				if (value == 6) {

					RedPlayer.playingFields()[0].setBackground(Color.RED);
					fields[0][2].setIcon(null);

					firstRed = true;
					fields[5][5].setIcon(new ImageIcon(new Dice().rollDice(1)));
					

				} else {

					count++;
				}

				if (count > 3) {

					fields[0][2].setIcon(null);
					fields[0][8].setIcon(new ImageIcon(new Dice().rollDice(value)));
					
				}
			

			} else if (e.getSource() == fields[0][8]) {
     
				value = new Dice().randomValue();
				fields[0][8].setIcon(new ImageIcon(new Dice().rollDice(value)));

				if (value == 6) {
					
					BluePlayer.playingFields()[0].setBackground(Color.BLUE);
					fields[0][8].setIcon(null);
					firstBlue = true;
					fields[5][5].setIcon(new ImageIcon(new Dice().rollDice(1)));

				} else {
					count++;
				}
				if (count > 3) {

					fields[0][8].setIcon(null);
					fields[0][2].setIcon(new ImageIcon(new Dice().rollDice(value)));
					
				}

			}

		}
	}

}