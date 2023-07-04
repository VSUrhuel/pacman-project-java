public class Pacman
{
	private double stride;
	private int totalScore;
	private Rectangle dimension;

	public Pacman(double startX, double startY, double width, double height, double stride)
	{
		this.dimension = new Rectangle(startX, startY, width, height);
		this.stride = stride;
		this.totalScore = 0;
	}
	public Rectangle getDimension()
	{
		return new Rectangle(this.dimension.getLocation().x, this.dimension.getLocation().y, this.dimension.getWidth(), this.dimension.getHeight());
	}
	public int totalScore()
	{
		return totalScore;
	}
	public boolean eat(Pellet pellet)
	{
		if(pellet.isVisible && (pellet.getDimension().collidesWith(this.dimension) && this.dimension.collidesWith(pellet.getDimension())))
		{
			this.totalScore += pellet.score;
			pellet.isVisible = false;
			return true;
		}
		return false;
	}
	public void moveUp()
	{
		this.dimension.setLocation(this.dimension.getLocation().x, (this.dimension.getLocation().y-this.stride));
	}
	public void moveDown()
	{
		this.dimension.setLocation(this.dimension.getLocation().x, (this.dimension.getLocation().y+this.stride));
	}
	public void moveLeft()
	{
		this.dimension.setLocation((this.dimension.getLocation().x-this.stride), this.dimension.getLocation().y);
	}
	public void moveRight()
	{
		this.dimension.setLocation((this.dimension.getLocation().x+this.stride), this.dimension.getLocation().y);
	}
	@Override
	public String toString()
	{
		return "Pacman (Total Score: " + this.totalScore + ") " + this.dimension;
	}
}