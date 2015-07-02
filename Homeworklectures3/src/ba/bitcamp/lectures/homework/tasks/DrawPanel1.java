package ba.bitcamp.lectures.homework.tasks;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DrawPanel1 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Color activeColor;
	private PointArray points;
	private int s = 5;
	int x1, y1, x2, y2;
	int counter = 1;
	int counter1 = 0;
	private boolean shape;
	private boolean type;

	private static Color[] supportedColors = new Color[] { Color.RED,
			Color.BLACK, Color.BLUE, Color.MAGENTA, Color.GREEN , Color.YELLOW };

	public DrawPanel1(int height, int width) {
		setSize(width, height);

		points = new PointArray();
		setSize(500, 500);
		setBackground(Color.WHITE);

		JButton size1 = new JButton(" Size + ");
		JButton size2 = new JButton(" Size - ");
		JButton button1 = new JButton(" Pen ");
		JButton button2 = new JButton(" Brush ");
		JButton button3 = new JButton(" UNDO ");
		JButton button4 = new JButton(" REDO ");

		size1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				s += 5;
			}

		});

		size2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				s -= 5;
				if (s <= 0) {
					s = 5;
				}
			}

		});

		add(button1);
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				type = true;

			}
		});

		add(button2);

		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				type = false;

			}
		});
		add(button3);

		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				counter1 = 0;
				counter++;
				for (int i = counter - 2; i < points.getLength() - 1; i++) {
					
					Point p = points.elementAt(points.getLength() - counter + 1);

					p.setColor(getBackground());

					repaint();

				}

			}
		});

		add(button4);

		button4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				counter--;
				counter1++;
				for (int i = points.getLength() - counter; i < points
						.getLength() - 1; i++) {
					Point p = points.elementAt(points.getLength() - counter);
					p.setColor(activeColor);

					repaint();
				}
				if (counter1 > 3) {

					JOptionPane.showMessageDialog(null, " Max number of redo");
					counter1 = 0;
					counter = 2;
				} else {

				}

			}
		});

		for (int i = 0; i < supportedColors.length; i++) {
			JButton color = new JButton(" Pick color ");
			color.setName(Integer.toString(i));
			color.setForeground(supportedColors[i]);

			color.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					counter = 1;
					JButton clicked = (JButton) e.getSource();

					String name = clicked.getName();
					int index = Integer.parseInt(name);
					activeColor = supportedColors[index];

				}

			});

			add(color);
			add(size1);
			add(size2);

		}
		addMouseMotionListener(new MouseHandler());
		addMouseListener(new MouseHandler());
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < points.getLength() - 1; i++) {

			Point p = points.elementAt(i);
			if (p.isType() == false) {
				if (p.isShape() == false) {
					g.setColor(p.getColor());
					g.fillOval(p.getX(), p.getY(), p.getSize(), p.getSize());

				} else if (p.isShape() == true) {

					g.setColor(p.getColor());
					g.drawOval(p.getX(), p.getY(), p.getSize(), p.getSize());

				}

			} else if (p.isType() == true) {

				Graphics2D g2d = (Graphics2D) g;
				Point p1 = points.elementAt(i + 1);

				g.setColor(p.getColor());
				g2d.setStroke(new BasicStroke(p.getSize()));

				x1 = p.getX();
				y1 = p.getY();
				x2 = p1.getX();
				y2 = p1.getY();

				g.drawLine(x1, y1, x2, y2);

			}

		}
	}

	private class MouseHandler extends MouseAdapter implements
			MouseMotionListener {

		@Override
		public void mousePressed(MouseEvent e) {

		}

		@Override
		public void mouseReleased(MouseEvent e) {

		}

		@Override
		public void mouseDragged(MouseEvent e) {
			counter = 1;
			Point newPoint = new Point(e.getX(), e.getY(), s, activeColor,
					shape, type);

			if (e.isShiftDown() == true) {
				newPoint.setColor(Color.WHITE);

			}
			if (e.isControlDown() == true) {
				newPoint.setShape(true);

			}

			points.AddPoint(newPoint);
			repaint();

		}

		@Override
		public void mouseMoved(MouseEvent e) {

		}

	}

}