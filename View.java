//William Taylor
//9/11/2020
//Programming Paradigms Assignment1 @ University of Arkansas:
//Program to make a turtle track a mouse click.
//Turtle can also be moved with arrow keys.

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.IOException;
import java.io.File;
import javax.swing.JButton;
import java.awt.Color;

class View extends JPanel
{
	JButton b1;
	BufferedImage turtle_image;
	Model model;					
	View view;
	Controller controller;

	View(Controller c, Model m)
	{
		model = m;
		c.setView(this);
		b1 = new JButton("pineapple juice");		
		b1.addActionListener(c);	//waits for i/o device to click on button
		this.add(b1);

		try
		{
			this.turtle_image =
				ImageIO.read(new File("turtle.png"));
		} catch(Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	void removeButton()		//removes button labled "pineapple juice"
	{
		this.remove(b1);
		this.repaint();
	}
	
	public void paintComponent(Graphics g)	//repaints turtle 25 times a second
	{
		
		g.setColor(new Color(128, 255, 255));
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		g.drawImage(this.turtle_image, model.turtle_x, model.turtle_y, null); //draws turtle at appointed position
		
	}

}
