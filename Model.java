//William Taylor
//9/11/2020
//Programming Paradigms Assignment1 @ University of Arkansas:
//Program to make a turtle track a mouse click.
//Turtle can also be moved with arrow keys.


class Model
{
	int turtle_x;
	int turtle_y;
	int dest_x;
	int dest_y;

	Model()
	{
	}

	public void update()
	{
		// Move the turtle
		if(this.turtle_x < this.dest_x)
			this.turtle_x += 4;//4 is speed of turtle (lower is slower)
		else if(this.turtle_x > this.dest_x)
			this.turtle_x -= 4;
		if(this.turtle_y < this.dest_y)
			this.turtle_y += 4;
		else if(this.turtle_y > this.dest_y)
			this.turtle_y -= 4;
	}

	public void setDestination(int x, int y)
	{
		this.dest_x = x;
		this.dest_y = y;
	}
}