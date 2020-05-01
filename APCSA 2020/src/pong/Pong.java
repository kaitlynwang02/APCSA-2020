package pong;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;

import javax.swing.JOptionPane;

import java.awt.event.ActionListener;

	public class Pong extends Canvas implements KeyListener, Runnable
	{
		private Ball ball;
		private Paddle leftPaddle;
		private Paddle rightPaddle;
		private boolean[] keys;
		private BufferedImage back;
		
		private int leftScore;
		private int rightScore;
		
		private boolean gameOver = false;

		public Pong()
		{
			ball = new BlinkyBall();
			ball.setColor(Color.GREEN);
			leftPaddle = new Paddle(5, 10, 5, 10, 100);
			rightPaddle = new Paddle(720, 10, 5, 10, 100);
			
			leftPaddle.setColor(new Color(0x803380));
			rightPaddle.setColor(new Color(0xff83ff));
			
			leftScore = 0;
			rightScore = 0;
			

			keys = new boolean[4];
		
	    
	    	setBackground(Color.WHITE);
			setVisible(true);
			
			JOptionPane.showMessageDialog(null, "WZ / IM to move. R to restart.");
			
			new Thread(this).start();
			addKeyListener(this);		
		}
		
	   public void update(Graphics window){
		   paint(window);
	   }
	   
	   
	   private static boolean PtInRect(Paddle p, int x, int y )
	   {
	       return x >= p.getX() && x < p.getX() + p.getWidth()
	           && y >= p.getY() && y < p.getY() + p.getHeight();
	   }

	   public void paint(Graphics window)
	   {
		   
		   Graphics2D twoDGraph = (Graphics2D)window;
		   
		   if (gameOver) {
			   
			   for (int i = 0; i < 9; ++i) {
				   for (int j = 0; j < 26; ++j) {
					   twoDGraph.drawString("GAME OVER", 10 + 80 * i, 20 * j);
				   }
				   
			   }
			   
			  
			   return;
		   }
			
			back = (BufferedImage)(createImage(getWidth(),getHeight()));	
			
			Graphics graphToBack = back.createGraphics();

			ball.moveAndDraw(graphToBack);
			
			leftPaddle.draw(graphToBack);
			rightPaddle.draw(graphToBack);
			
			if(keys[0] == true)
			{
				
				leftPaddle.moveDownAndDraw(window);
			}
			if(keys[1] == true)
			{
							
				leftPaddle.moveUpAndDraw(window);
			}
			if(keys[2] == true)
			{
				rightPaddle.moveDownAndDraw(window);
				
			}
			if(keys[3] == true)
			{
				rightPaddle.moveUpAndDraw(window);
			}

			
			
			if (ball.didCollideLeft(null)) {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				
				gameOver = true;
				
				rightScore++;
			}
			
			if (ball.didCollideRight(null)) {
				ball.setXSpeed(0);
				ball.setYSpeed(0);
				
				gameOver = true;
				
				leftScore++;
			}
			
			if (ball.didCollideTop(null) || ball.didCollideBottom(null)) {
				ball.setYSpeed(-ball.getYSpeed());

			}
			
			
			if (PtInRect(rightPaddle, ball.getX(), ball.getY())) {
				
				ball.setXSpeed(-ball.getXSpeed());
				
				
				
			}
			
			if (PtInRect(leftPaddle, ball.getX(), ball.getY())) {
				ball.setXSpeed(-ball.getXSpeed());
				
			}
			
		
			if (leftPaddle.getY() < 0)
				leftPaddle.setY(0);
			
			if (rightPaddle.getY() < 0)
				rightPaddle.setY(0);
			
			if (leftPaddle.getY() > 500)
				leftPaddle.setY(500);
			
			if (rightPaddle.getY() > 500)
				rightPaddle.setY(500);
			

			twoDGraph.drawImage(back, null, 0, 0);
		   
			twoDGraph.setColor(new Color(0x800080));
			twoDGraph.drawRect(2, 2, 730, 557);
			twoDGraph.drawString("Leftscore: " + Integer.toString(leftScore), 20, 520);
			twoDGraph.drawString("Rightscore: " + Integer.toString(rightScore), 20, 550);
			try {
				Thread.sleep(4);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	   
		public void keyPressed(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=true; break;
				case 'Z' : keys[1]=true; break;
				case 'I' : keys[2]=true; break;
				case 'M' : keys[3]=true; break;
			}
		}

		public void keyReleased(KeyEvent e)
		{
			switch(toUpperCase(e.getKeyChar()))
			{
				case 'W' : keys[0]=false; break;
				case 'Z' : keys[1]=false; break;
				case 'I' : keys[2]=false; break;
				case 'M' : keys[3]=false; break;
				
				case 'R':
					
					ball = new BlinkyBall();
					
					gameOver = false;
					break;
			}
		}

		public void keyTyped(KeyEvent e){}
		
	   public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   			
	   		   Thread.currentThread().sleep(8);
	            repaint();
	         }
	      }catch(Exception e)
	      {
	      }
	  	}	
	}