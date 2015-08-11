import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;

public class GreenPLayer  implements MouseListener{

	static JLabel fields[][] = LudoGame.getFields();

	public static JLabel[] playingFields() {

		JLabel[] move = { fields[4][10], fields[5][10], fields[6][10],
				fields[7][10], fields[7][9], fields[7][8], fields[7][7],
				fields[8][7], fields[9][7], fields[10][7], fields[10][6],
				fields[10][5], fields[10][4], fields[10][3], fields[9][3],
				fields[8][3], fields[7][3], fields[7][2], fields[7][1],
				fields[7][0], fields[6][0], fields[5][0], fields[4][0],
				fields[3][0], fields[3][1], fields[3][2], fields[3][3],
				fields[2][3], fields[1][3], fields[0][3], fields[0][4],
				fields[0][5], fields[0][6], fields[0][7], fields[1][7],
				fields[2][7], fields[3][7], fields[3][8], fields[3][9],
				fields[3][10], };

		return move;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
