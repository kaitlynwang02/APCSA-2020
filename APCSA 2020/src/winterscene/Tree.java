package winterscene;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Tree extends AbstractShape
{
   public Tree(int x, int y, int w, int h )
   {
		super(x, y, w, h, Color.GREEN, 0, 0);
   }

   public void draw(Graphics window)
   {
	   window.setColor(Color.DARK_GRAY);   	
	   window.fillRect(200, 415, 20, 300);
	   window.fillRect(400, 300, 20, 200);
	   
	   window.setColor(Color.GREEN);
	   window.fillOval(100, 300, 200, 200);
	   window.fillOval(300, 100, 200, 200);
	   
   }

   public void moveAndDraw(Graphics window)
   {
      window.fillOval(getXPos(), getYPos(), getWidth(), getHeight());   
   }
}