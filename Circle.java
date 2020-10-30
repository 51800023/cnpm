public class Circle
{
	private double radius = 1.0;
	private String color = "red";
	public Circle ()
	{
		radius = 1.0;
		color = "red";
	}
	public Circle (double r)
	{
		this.radius = r ; 
	}
	public double getRadius()
	{
		return radius ;
	}	
	public double setArea()
	{
		return Math.PI*radius*radius;
	}
	public void print()
	{
		System.out.format("R= %f va Mau la %s",radius,color);
	}
}