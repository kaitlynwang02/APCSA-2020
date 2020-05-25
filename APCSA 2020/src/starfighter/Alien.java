package starfighter;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;

	public Alien()
	{
		this(50,10,40,40,1);
	}

	public Alien(int x, int y)
	{
		this(x,y,40,40,1);
	}

	public Alien(int x, int y, int s)
	{
		this(x,y,40,40,s/2);
	}

	public Alien(int x, int y, int w, int h, int s)
	{
		super(x, y, w,h);
		speed=s/2;
		try
		{
			URL url = getClass().getResource("alien.JPG");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("");
		}
	}

	public void setSpeed(int s)
	{
	   speed=s;
	}

	public int getSpeed()
	{
	   return speed;
	}

   public void move(String direction)
   {
	   if(direction.equals("RIGHT"))
		{
			setX(getX() + speed);
			
		}
		if(direction.equals("LEFT"))
		{
			setX(getX() - speed);
			
		}
		if(direction.equals("DOWN"))
		{
			
			setY(getY() + speed);
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() +" "+ getSpeed();
	}
}
