package ba.bitcamp.GUI.task1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Window1 extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8817844154455640421L;

	private int counter = 1;
	private int counter1 = 1;
	private JButton button[] = new JButton[10];
	private JButton button1 = new JButton("PLAY AGAIN");
	private JButton button2 = new JButton("INFO");
	private JButton button3 = new JButton(" EXIT ");

	public Window1() {

		setVisible(true);
		setTitle("        TIC - TAC - GAME      ");
		setSize(500, 500);
		setResizable(false);
		setLocation(400, 200);

		Font f = new Font("Cambria", Font.BOLD, 12);
		setLayout(new GridLayout(4, 4));
		for (int i = 0; i < 9; i++) {
			button[i] = new JButton();
			add(button[i]);
			button[i].setFont(f);
			button[i].setBackground(Color.getHSBColor(14, 62, 69));
			button[i].setForeground(Color.RED);
			button[i].addActionListener(new Action());

		}
		add(button1);
		button1.setForeground(Color.green);
		button1.setFont(f);
		add(button3);
		button3.setForeground(Color.red);
		button3.setFont(f);
		add(button2);
		button3.setForeground(Color.red);
		button3.setFont(f);

		button1.addActionListener(new Action());
		button3.addActionListener(new Action());
		button2.addActionListener(new Action());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Window1();

	}

	private class Action implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			Font f = new Font("Cambria", Font.BOLD, 80);
			for (int i = 0; i < 9; i++) {
				if (e.getSource() == button[i]) {
					if (counter % 2 == 0) {
						button[i].setText("X");
						button[i].setFont(f);
						button[i].setEnabled(false);
						counter++;
					} else {
						button[i].setText("O");
						button[i].setFont(f);
						button[i].setEnabled(false);
						counter++;
					}

					if (button[0].getText().equals(button[1].getText())
							&& button[1].getText().equals(button[2].getText())
							&& button[0].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner  is player " + button[2].getText());

					} else if (button[3].getText().equals(button[4].getText())
							&& button[4].getText().equals(button[5].getText())
							&& button[3].getText().equals("") == false ) {
						
						JOptionPane.showMessageDialog(null,
								" Winnnnner  is player " + button[3].getText());

					} else if (button[6].getText().equals(button[7].getText())
							&& button[7].getText().equals(button[8].getText())
							&& button[6].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner  is player " + button[6].getText());

					} else if (button[0].getText().equals(button[3].getText())
							&& button[3].getText().equals(button[6].getText())
							&& button[0].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner is player " + button[3].getText());

					} else if (button[1].getText().equals(button[4].getText())
							&& button[4].getText().equals(button[7].getText())
							&& button[1].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner  is player " + button[1].getText());

					} else if (button[2].getText().equals(button[5].getText())
							&& button[5].getText().equals(button[8].getText())
							&& button[2].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner is player " + button[2].getText());

					} else if (button[0].getText().equals(button[1].getText())
							&& button[1].getText().equals(button[2].getText())
							&& button[0].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner is player " + button[1].getText());
					} else if (button[0].getText().equals(button[4].getText())
							&& button[4].getText().equals(button[8].getText())
							&& button[0].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner is player " + button[0].getText());

					} else if (button[2].getText().equals(button[4].getText())
							&& button[4].getText().equals(button[6].getText())
							&& button[2].getText().equals("") == false) {

						JOptionPane.showMessageDialog(null,
								" Winnnnner is player " + button[2].getText());
					} else  {
						counter1++;
						
					}
					if ( counter1 == 10){
						JOptionPane.showMessageDialog(null,
								" Game is draw , play again");
					}

				}
			}

			if (e.getSource() == button3) {
				System.exit(3);
			}
			if (e.getSource() == button1) {
				for (int i = 0; i < 9; i++) {
					button[i].setText("");
					button[i].setEnabled(true);
					counter1 = 1;
				}
			}
			if (e.getSource() == button2) {
				JOptionPane.showMessageDialog(null,
						"Get three of the same sign for victory");
			}
		}

	}

}
