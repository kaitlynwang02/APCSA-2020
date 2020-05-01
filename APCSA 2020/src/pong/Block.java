package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	@Override
	public String toString() {
		return "Block [xPos=" + xPos + ", yPos=" + yPos + ", width=" + width
				+ ", height=" + height + ", color=" + color + "]";
	}

	private int xPos;
	private int yPos;
	protected int width;
	protected int height;

	protected Color color;
	
	public Block() {
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.GREEN;
	}

	public Block(int xPos, int yPos, int width, int height) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		color = Color.GREEN;
	}
	
	public Block(int xPos, int yPos, int width, int height, Color c) {
		super();
		this.xPos = xPos;
		this.yPos = yPos;
		this.width = width;
		this.height = height;
		color = c;
	}

	public Block(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		width = 10;
		height = 10;
		color = Color.GREEN;
	}
	
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}

	
   public void setColor(Color col)
   {
	   color = col;

   }
   
   public Color getColor() {
	   return color;
   }
   
   
   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	  draw(window);
   }
   
	public boolean equals(Object obj)
	{
		return this == obj;
	}

	@Override
	public void setPos(int x, int y) {
		
		setX(x);
		setY(y);
	}

	@Override
	public void setX(int x) {
		
		xPos = x;
	}

	@Override
	public void setY(int y) {
		
		yPos = y;
	}

	@Override
	public int getX() {
		
		return xPos;
	}

	@Override
	public int getY() {
		
		return yPos;
	}   

}