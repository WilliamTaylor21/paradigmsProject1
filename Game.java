//William Taylor
//9/11/2020
//Programming Paradigms Assignment1 @ University of Arkansas:
//Program to make a turtle track a mouse click.
//Turtle can also be moved with arrow keys.


import javax.swing.JFrame;
import java.awt.Toolkit;

public class Game extends JFrame
{	
	Model model;
	Controller controller;
	View view;
	public Game()
	{
		model = new Model();
	    controller = new Controller(model);
		view = new View(controller, model);
		this.setTitle("Turtle attack!");
		this.setSize(500, 500);
		this.setFocusable(true);
		this.getContentPane().add(view);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.addKeyListener(controller);
		view.addMouseListener(controller);
	}

	public static void main(String[] args)
	{
		Game g = new Game();
		g.run();
	}
	
	public void run()
	{
		while(true)
			{
				controller.update();
				model.update();
				view.repaint(); // Indirectly calls View.paintComponent
				Toolkit.getDefaultToolkit().sync(); // Updates screen

				// Go to sleep for 50 miliseconds
				try
				{
					Thread.sleep(40);
				} catch(Exception e) {
					e.printStackTrace();
					System.exit(1);
				}
			}
	}
}
