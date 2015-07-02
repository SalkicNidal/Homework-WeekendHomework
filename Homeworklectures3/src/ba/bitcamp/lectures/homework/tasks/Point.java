package ba.bitcamp.lectures.homework.tasks;

import java.awt.Color;

public class Point {
	
	
	private int x;
	private int y;
	private int size;
	private Color color;
	private boolean shape;
	private boolean type;
	
	public Point( int x, int y, int size, Color c, boolean shape , boolean type){
		this.x = x;
		this.y = y;
		this.color = c;
		this.size = size;
		this.shape = shape;
		this.type = type;

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isShape() {
		return shape;
	}

	public void setShape(boolean shape) {
		this.shape = shape;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}
	
	

}