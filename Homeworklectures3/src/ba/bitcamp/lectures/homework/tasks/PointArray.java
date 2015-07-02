package ba.bitcamp.lectures.homework.tasks;

public class PointArray {

	private Point[] points;
	private int length;

	public PointArray() {
		this.points = new Point[10];
		this.length = 0;

	}

	public void AddPoint(Point p) {
		if (length == points.length) {
			resize();
		}
		this.points[length++] = p;

	}
	
	public int getLength(){
		return length;
	}
	
	public Point elementAt( int index){
		return points[index];
	}

	public void resize() {

		Point[] tmp = new Point[points.length * 2];
		for (int i = 0; i < points.length; i++) {
			tmp[i] = points[i];
		}

		points = tmp;
	}
	
	public void undo( ){
		
		Point[] tmp = new Point[points.length - 2];
		for ( int i = 0; i < points.length - 2  ; i++){
			
			tmp[i] = points[i];
		}
		
		points = tmp;
		
		
		
	}
	
	public void removePoints(){
		
		this.points[length - 1].equals(null);
	}

	
	
	
	
	
	
	
	
	
	
	
	
}