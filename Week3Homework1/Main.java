import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Main {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		// **** Draw here ****

		for (int i = 50; i <= 500; i += 50) {
              for(int j=0;j<15;j+=2){
        
            g.setColor(Color.ORANGE);	  
            g.drawOval(90+j, 220+j, 200, 100);
            g.drawOval(190+j, 220+j, 200, 100);
            g.drawOval(280+j, 220+j, 200, 100);
            g.setColor(Color.BLUE);	  
            g.setFont(new Font("Cambria", Font.BOLD, 20));	  
            g.drawString("An array of numbers", 195, 50);
            g.drawString("Types INT",240 , 180);
			g.setColor(Color.RED);
			g.drawRect(i+j, 80+j, 50, 50);
			g.setFont(new Font("Cambria", Font.BOLD, 30));
              }
			String s = "";
			g.setColor(Color.BLACK);
			g.drawString(s + (int) (Math.random() * 10), i + 25, 125);
			
              
		}

		// *******************
		w.setImage(img);
	}

}
