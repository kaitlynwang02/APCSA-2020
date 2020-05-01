package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block implements Collidable
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super ((int)(Math.random() * 450) + 20, (int)(Math.random() * 450) + 20);
		
		xSpeed = 3;
		ySpeed = 3;
		
		if ((int)(Math.random() * 2) == 1) {
			xSpeed = -1 * xSpeed;
		}
		
		if ((int)(Math.random() * 2) == 1) {
			ySpeed = -1 * ySpeed;
		}
		
		width = 20;
		height = 20;
		   
		   setColor(Color.GREEN);
	}


   public Ball(int i, int j, int k, int l, Color blue) {
		
	   super(i, j);
	   xSpeed = k;
	   ySpeed = l;
	   setColor(blue);
	   width = 20;
	   height = 20;
	}

   public Ball(int i, int j, int k, int l) {
	   
	   super(i, j);
	   xSpeed = k;
	   ySpeed = l;
	   width = 20;
	   height = 20;
}

   public Ball(int i, int j) {
	
	   super(i, j);
	   width = 20;
	   height = 20;
}

   public Ball(int i, int j, int k, int l, Color blue, int m, int n) {
	
	   super(i, j);
	   xSpeed = k;
	   ySpeed = l;
	   setColor(blue);
	   width = m;
	   height = l;
}

   public Ball(int x, int y, int wid, int ht, int xSpd, int ySpd) {
	   super(x, y);
	   xSpeed = xSpd;
	   ySpeed = ySpd;
	   setColor(Color.GREEN);
	   width = wid;
	   height = ht;
}

   public void moveAndDraw(Graphics window)
   {
	  setX(getX()+xSpeed);
	  setY(getY()+ySpeed);
	  
	  draw(window, getColor());
   }
   
	public boolean equals(Object obj)
	{
		return this == obj;
	}

	@Override
	public String toString() {
		return "Ball [xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + "]";
	}

	public int getXSpeed() {
		
		return xSpeed;
	}

	public void setXSpeed(int i) {
		xSpeed = i;
		
	}

	public int getYSpeed() {
		
		return ySpeed;
	}

	public void setYSpeed(int i) {
		
		ySpeed = i;
	}

	@Override
	public boolean didCollideLeft(Object obj) {
		
		return getX()<=10;
	}

	@Override
	public boolean didCollideRight(Object obj) {
		
		return getX()>=730;
	}

	@Override
	public boolean didCollideTop(Object obj) {
		
		return getY()<=10;
	}

	@Override
	public boolean didCollideBottom(Object obj) {
		
		return getY()>=550;
	}   

}